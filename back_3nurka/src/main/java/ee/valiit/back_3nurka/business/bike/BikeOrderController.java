package ee.valiit.back_3nurka.business.bike;

import ee.valiit.back_3nurka.business.bike.dto.*;
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
    @Operation(summary = "Võtab kõik rattad andmebaasist tema userId järgi")
    public List<BikeResponse> getBikeInfo(@RequestParam Integer userId) {
        List<BikeResponse> bikeInfo = bikeOrderService.getBikeInfo(userId);
        return bikeInfo;
    }

    @DeleteMapping("/order/bike")
    @Operation(summary = "Kustutab kliendi ratta bikeId järgi")
    public void deleteBikeInfo(@RequestParam Integer bikeId) {
        bikeOrderService.deleteBikeInfo(bikeId);
    }

    @PostMapping("/repair/bikeorder")
    @Operation(summary = "Alustab uue orderId-ga seotud remondi bikeOrderi, staatus AktiivneTeenus")
    public void addRepairBikeOrder(@RequestBody BikeOrderRequest bikeOrderRequest) {
        bikeOrderRequest.setDateTo(bikeOrderRequest.getDateFrom());
        bikeOrderRequest.setPackageFieldId(1);
        bikeOrderService.addBikeOrder(bikeOrderRequest);
    }

    @PostMapping("/maintenance/bikeorder")
    @Operation(summary = "Alustab uue orderId-ga seotud hoolduse bikeOrderi, staatus AktiivneTeenus")
    public void addMaintenanceBikeOrder(@RequestBody BikeOrderRequest bikeOrderRequest) {
        bikeOrderRequest.setDateTo(bikeOrderRequest.getDateFrom());
        bikeOrderService.addBikeOrder(bikeOrderRequest);
    }

    @PostMapping("/storage/bikeorder")
    @Operation(summary = "Alustab uue orderId-ga seotud hoiustamisega bikeOrderi, staatus AktiivneTeenus")
    public void addStorageBikeOrder(@RequestBody BikeOrderRequest bikeOrderRequest) {
        bikeOrderService.addBikeOrder(bikeOrderRequest);
    }


    @GetMapping("/order/info")
    @Operation(summary = "Toob OrderId järgi kõik BikeOrderid ja OrderId numbri")
    public OrderInfo getBikeOrderInfo(@RequestParam Integer orderId) {
        return bikeOrderService.getBikeOrderInfo(orderId);
    }

    @GetMapping("info/by-order")
    @Operation(summary = "Toob bikeOrderId järgi ühe bikeOrderi")
    public AdminBikeOrderRequest findBikeOrderById(@RequestParam Integer bikeOrderId) {
        AdminBikeOrderRequest bikeOrderBy = bikeOrderService.findBikeOrderBy(bikeOrderId);
        return bikeOrderBy;

    }

    @GetMapping("/admin/detail")
    @Operation(summary = "Toob OrderId järgi kõik BikeOrderid ja OrderId numbri AdminDetailsView lehele")
    public OrderInfo getAdminBikeOrderInfo(@RequestParam Integer orderId) {
        return bikeOrderService.getBikeOrderInfo(orderId);
    }

    @GetMapping("/storage/packages")
    @Operation(summary = "Toob workTypeId järgi kõik packageFieldid")
    public List<PackageFieldDto> findPackageFieldsBy(@RequestParam Integer workTypeId) {
        List<PackageFieldDto> packageFieldsBy = bikeOrderService.findPackageFieldsBy(workTypeId);
        return packageFieldsBy;

    }

}
