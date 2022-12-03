package ee.valiit.back_3nurka.business.bike;

import ee.valiit.back_3nurka.domain.bike.brand.BrandDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/order/bike")
    @Operation(summary = "Lisab ratta info andmebaasi vastava kasutaja alla")
    public void addBikeInfo(@RequestBody BikeRequest bikeRequest) {
        bikeOrderService.addBikeInfo(bikeRequest);
    }

    @GetMapping("/order/bike")
    @Operation(summary = "Võtab ratta info andmebaasist tema userId järgi")
    public List<BikeResponse> getBikeInfo(@RequestParam Integer userId) {
        List<BikeResponse> bikeInfo = bikeOrderService.getBikeInfo(userId);
        return bikeInfo;
    }

    @DeleteMapping("/order/bike")
    @Operation(summary = "Kustutab kliendi ratta bikeId järgi")
    public void deleteBikeInfo(@RequestParam Integer bikeId) {
        bikeOrderService.deleteBikeInfo(bikeId);
    }

 }
