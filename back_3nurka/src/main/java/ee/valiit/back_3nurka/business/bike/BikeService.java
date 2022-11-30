package ee.valiit.back_3nurka.business.bike;


import ee.valiit.back_3nurka.domain.bike.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service

public class BikeService {

    @Resource
    private BrandMapper brandMapper;

    @Resource
    private BrandService brandService;

    public List<BrandDto> getAllBrands() {
        List<Brand> brands = brandService.getAllBrands();
        List<BrandDto> brandDtos = createBrandDtos(brands);
        return brandDtos;
    }

    private List<BrandDto> createBrandDtos(List<Brand> brands) {
        List<BrandDto> brandDtos = brandMapper.toBrandDtos(brands);
        return brandDtos;
    }


}
