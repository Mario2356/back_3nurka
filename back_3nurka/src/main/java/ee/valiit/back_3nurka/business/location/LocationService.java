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

    public LocationDto getProfileAddress(Integer userId) {
        User user = userService.getUser(userId);
        LocationDto locationDto = userMapper.toLocationDto(user);
        return locationDto;
    }

    public void addNewAddressToOrder(LocationDto locationDto) {

        District district = districtService.getDistrict(locationDto.getDistrictId());
        Address address = new Address();
        address.setDistrict(district);
        address.setPhone(locationDto.getPhone());
        address.setStreetName(locationDto.getStreetName());
        addressService.addAddress(address);
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
