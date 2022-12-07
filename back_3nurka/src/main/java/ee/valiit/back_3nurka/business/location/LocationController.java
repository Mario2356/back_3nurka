package ee.valiit.back_3nurka.business.location;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class LocationController {

    @Resource
    private LocationService locationService;

    @GetMapping("/order/profile")
    @Operation(summary = "Toob userId järgi tema profiiliaadressi")
    public LocationDto getProfileAddress(@RequestParam Integer userId) {
        return locationService.getProfileAddress(userId);
    }

    @PostMapping("/order/custom")
    @Operation(summary = "Loob aadressi tellimusse")
    public void addNewAddressToOrder(@RequestBody LocationDto locationDto) {
        locationService.addNewAddressToOrder(locationDto);
    }
}
