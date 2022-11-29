package ee.valiit.back_3nurka.business.bike;


import ee.valiit.back_3nurka.domain.bike.BikeBrandDto;
import ee.valiit.back_3nurka.domain.bike.BikeBrandMapper;
import ee.valiit.back_3nurka.domain.bike.BikeBrandRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service

public class BikeService {

    @Resource
    private BikeBrandRepository bikeBrandRepository;

    @Resource
    private BikeBrandMapper bikeBrandMapper;

    private List<BikeBrandDto> getAllBrandNames() {
        bikeBrandRepository.findAll();

    }
}
