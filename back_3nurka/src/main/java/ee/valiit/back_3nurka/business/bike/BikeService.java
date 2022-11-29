package ee.valiit.back_3nurka.business.bike;


import ee.valiit.back_3nurka.domain.bike.BikeBrand;
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

    public List<BikeBrandDto> getAllBrandNames() {
        List<BikeBrand> brands = bikeBrandRepository.findAll();
        List<BikeBrandDto> brandDtos = createBrandDtos(brands);
        return brandDtos;
    }

    private List<BikeBrandDto> createBrandDtos(List<BikeBrand> bikeBrands) {
        List<BikeBrandDto> bikeBrandDtos = bikeBrandMapper.toBikeBrandDtos(bikeBrands);
        return bikeBrandDtos;
    }
}
