package ee.valiit.back_3nurka.business.location;

import ee.valiit.back_3nurka.domain.district.DistrictDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LocationController {

    @Resource
    private LocationService locationService;

    @GetMapping("/order/profile")
    @Operation(summary = "Toob userId järgi tema profiiliaadressi")
    public LocationRequest getProfileAddress(@RequestParam Integer userId) {
        return locationService.getProfileAddress(userId);
    }

    @PostMapping("/order/address")
    @Operation(summary = "Loob aadressi tellimusse")
    public void addNewAddressToOrder(@RequestBody LocationRequest locationRequest) {
        locationService.addNewAddressToOrder(locationRequest);
    }

    @GetMapping("/order/districts")
    @Operation(summary = "Leiab kõik linnaosad")
    public List<DistrictDto> allDistricts() {
        List<DistrictDto> result = locationService.getAllDistricts();
        return result;
    }
}
