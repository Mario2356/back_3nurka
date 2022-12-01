package ee.valiit.back_3nurka.business.bike;

import ee.valiit.back_3nurka.domain.bike.brand.BrandDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController

public class BikeOrderController {

    @Resource
    private BikeOrderService bikeOrderService;

    @GetMapping("/order/brand")
    @Operation(summary = "Leiab kõik ratta brändid")
    public List<BrandDto> allBrandNames() {
        List<BrandDto> result = bikeOrderService.getAllBrands();
        return result;
    }

//    @PostMapping("/order/bike")
//    @Operation(summary = "Lisab ratta info")
//    public BikeResponse addBikeInfo(@RequestBody BikeRequest bikeRequest) {
//        BikeResponse response = bikeOrderService.addBikeInfo(bikeRequest);
//        return response;
//    }
}
