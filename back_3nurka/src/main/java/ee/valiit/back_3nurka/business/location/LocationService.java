package ee.valiit.back_3nurka.business.location;

import ee.valiit.back_3nurka.domain.address.Address;
import ee.valiit.back_3nurka.domain.address.AddressService;
import ee.valiit.back_3nurka.domain.district.District;
import ee.valiit.back_3nurka.domain.district.DistrictDto;
import ee.valiit.back_3nurka.domain.district.DistrictMapper;
import ee.valiit.back_3nurka.domain.district.DistrictService;
import ee.valiit.back_3nurka.domain.user.User;
import ee.valiit.back_3nurka.domain.user.UserMapper;
import ee.valiit.back_3nurka.domain.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LocationService {

    @Resource
    private UserService userService;

    @Resource
    private UserMapper userMapper;

    @Resource
    private AddressService addressService;

    @Resource
    private DistrictService districtService;

    @Resource
    private DistrictMapper districtMapper;

    public LocationRequest getProfileAddress(Integer userId) {
        User user = userService.getUser(userId);
        LocationRequest locationRequest = userMapper.toLocationDto(user);
        return locationRequest;
    }

    public void addNewAddressToOrder(LocationRequest locationRequest) {
        Address address;
        if (locationRequest.getUseDefaultAddress()) {
            address = getUserDefaultAddress(locationRequest);
        } else {
            address = createNewAddress(locationRequest);
        }
        addressService.addAddress(address);
    }

    private Address createNewAddress(LocationRequest locationRequest) {
        Address address = new Address();
        District district = districtService.getDistrict(locationRequest.getDistrictId());
        address.setDistrict(district);
        address.setPhone(locationRequest.getPhone());
        address.setStreetName(locationRequest.getStreetName());
        return address;
    }

    private Address getUserDefaultAddress(LocationRequest locationRequest) {
        Address address;
        User user = userService.getUser(locationRequest.getUserId());
        address = user.getCustomer().getAddress();
        return address;
    }

    public List<DistrictDto> getAllDistricts() {
        List<District> districts = districtService.getAllDistricts();
        List<DistrictDto> districtDtos = createDistrictDtos(districts);
        return districtDtos;
    }

    private List<DistrictDto> createDistrictDtos(List<District> districts) {
        List<DistrictDto> districtDtos = districtMapper.toDistrictDtos(districts);
        return districtDtos;
    }
}
