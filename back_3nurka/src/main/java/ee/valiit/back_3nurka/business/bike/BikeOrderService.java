package ee.valiit.back_3nurka.business.bike;


import ee.valiit.back_3nurka.domain.bike.Bike;
import ee.valiit.back_3nurka.domain.bike.BikeDto;
import ee.valiit.back_3nurka.domain.bike.BikeService;
import ee.valiit.back_3nurka.domain.bike.brand.Brand;
import ee.valiit.back_3nurka.domain.bike.brand.BrandDto;
import ee.valiit.back_3nurka.domain.bike.brand.BrandMapper;
import ee.valiit.back_3nurka.domain.bike.brand.BrandService;
import ee.valiit.back_3nurka.domain.user.User;
import ee.valiit.back_3nurka.domain.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service

public class BikeOrderService {

    @Resource
    private BrandMapper brandMapper;

    @Resource
    private BrandService brandService;

    @Resource
    private UserService userService;

    public List<BrandDto> getAllBrands() {
        List<Brand> brands = brandService.getAllBrands();
        List<BrandDto> brandDtos = createBrandDtos(brands);
        return brandDtos;
    }

    private List<BrandDto> createBrandDtos(List<Brand> brands) {
        List<BrandDto> brandDtos = brandMapper.toBrandDtos(brands);
        return brandDtos;
    }

    public void addBikeInfo(BikeDto request) {
        Bike bike = userService.getValidBikeUser(request.getUserId());
        userService.addUserBike(bike, request.getBikeModel(), request.getBrandName());
    }


}
