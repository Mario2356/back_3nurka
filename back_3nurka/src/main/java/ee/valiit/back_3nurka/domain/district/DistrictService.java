package ee.valiit.back_3nurka.domain.district;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class DistrictService {

    @Resource
    private DistrictRepository districtRepository;

    public District getDistrict(Integer id) {
        Optional<District> byId = districtRepository.findById(id);
        District district = byId.get();
        return district;
    }

}
