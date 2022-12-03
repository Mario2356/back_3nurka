package ee.valiit.back_3nurka.business.bike;


import ee.valiit.back_3nurka.domain.bike.Bike;
import ee.valiit.back_3nurka.domain.bike.BikeMapper;
import ee.valiit.back_3nurka.domain.bike.BikeService;
import ee.valiit.back_3nurka.domain.bike.brand.Brand;
import ee.valiit.back_3nurka.domain.bike.brand.BrandDto;
import ee.valiit.back_3nurka.domain.bike.brand.BrandMapper;
import ee.valiit.back_3nurka.domain.bike.brand.BrandService;
import ee.valiit.back_3nurka.domain.bike_order.BikeOrder;
import ee.valiit.back_3nurka.domain.bike_order.BikeOrderDomService;
import ee.valiit.back_3nurka.domain.bike_order.BikeOrderMapper;
import ee.valiit.back_3nurka.domain.bike_status.BikeStatus;
import ee.valiit.back_3nurka.domain.bike_status.BikeStatusService;
import ee.valiit.back_3nurka.domain.order.Order;
import ee.valiit.back_3nurka.domain.order.OrderService;
import ee.valiit.back_3nurka.domain.package_field.PackageField;
import ee.valiit.back_3nurka.domain.package_field.PackageFieldService;
import ee.valiit.back_3nurka.domain.user.User;
import ee.valiit.back_3nurka.domain.user.UserService;
import ee.valiit.back_3nurka.domain.work_type.WorkType;
import ee.valiit.back_3nurka.domain.work_type.WorkTypeService;
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


    @Resource
    private BikeService bikeService;

    @Resource
    private BikeMapper bikeMapper;

    @Resource
    private BikeOrderMapper bikeOrderMapper;

    @Resource
    private OrderService orderService;

    @Resource
    private WorkTypeService workTypeService;

    @Resource
    private PackageFieldService packageFieldService;

    @Resource
    private BikeOrderDomService bikeOrderDomService;

    @Resource
    private BikeStatusService bikeStatusService;


    public List<BrandDto> getAllBrands() {
        List<Brand> brands = brandService.getAllBrands();
        List<BrandDto> brandDtos = createBrandDtos(brands);
        return brandDtos;
    }


    private List<BrandDto> createBrandDtos(List<Brand> brands) {
        List<BrandDto> brandDtos = brandMapper.toBrandDtos(brands);
        return brandDtos;
    }


    public void addBikeInfo(BikeRequest request) {
        User user = userService.getBikeUser(request.getUserId());
        Brand brand = brandService.getBikeBrand(request.getBrandId());


        Bike bike = new Bike();
        bike.setBrand(brand);
        bike.setUser(user);
        bike.setModel(request.getBikeModel());
        bikeService.addBike(bike);
    }

    public List<BikeResponse> getBikeInfo(Integer userId) {
        List<BikeResponse> bikesByUserId = bikeService.getBikesByUserId(userId);
        return bikesByUserId;
    }

    public void deleteBikeInfo(Integer bikeId) {
        bikeService.deleteBikeBy(bikeId);
    }
    public void addBikeOrder(BikeOrderRequest bikeOrderRequest) {
        BikeOrder bikeOrder = bikeOrderMapper.ToBikeOrder(bikeOrderRequest);
        Order order = orderService.getOrderById(bikeOrderRequest.getOrderId());
        Bike bike = bikeService.getBikeById(bikeOrderRequest.getBikeId());
        // TODO: 03.12.2022 WorkType peab Frondist sisse tulema
        WorkType workType = workTypeService.getWorkType(bikeOrderRequest.getWorkTypeId());
        BikeStatus bikeStatus = bikeStatusService.getBikeStatus(1);
        PackageField packageField = packageFieldService.getPackageField(bikeOrderRequest.getPackageFieldId());

        bikeOrder.setOrder(order);
        bikeOrder.setBike(bike);
        bikeOrder.setWorkType(workType);
        bikeOrder.setBikeStatus(bikeStatus);
        bikeOrder.setPackageField(packageField);

        bikeOrderDomService.addBikeOrder(bikeOrder);




    }
}