package ee.valiit.back_3nurka.domain.address;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AddressService {

    @Resource
    private AddressRepository addressRepository;

    public void addAddress(Address address) {
        addressRepository.save(address);
    }
}
