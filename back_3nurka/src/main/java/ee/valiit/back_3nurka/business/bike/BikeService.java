package ee.valiit.back_3nurka.business.bike;


import ee.valiit.back_3nurka.domain.bike.Brand;
import ee.valiit.back_3nurka.domain.bike.BrandDto;
import ee.valiit.back_3nurka.domain.bike.BrandMapper;
import ee.valiit.back_3nurka.domain.bike.BrandRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service

public class BikeService {

    @Resource
    private BrandRepository brandRepository;

    @Resource
    private BrandMapper brandMapper;

    public List<BrandDto> getAllBrands() {
        List<Brand> brands = brandRepository.findAll();
        List<BrandDto> brandDtos = createBrandDtos(brands);
        return brandDtos;
    }

    private List<BrandDto> createBrandDtos(List<Brand> brands) {
        List<BrandDto> brandDtos = brandMapper.toBrandDtos(brands);
        return brandDtos;
    }


}
