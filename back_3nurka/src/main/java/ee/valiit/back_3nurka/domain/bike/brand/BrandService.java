package ee.valiit.back_3nurka.domain.bike.brand;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BrandService {

    @Resource
    private BrandRepository brandRepository;

    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    public Brand getBikeBrand(Integer brandId) {
        Brand brand = brandRepository.findById(brandId).get();
        return brand;
    }
}
