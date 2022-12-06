package ee.valiit.back_3nurka.business.location;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LocationController {

    @Resource
    private LocationService locationService;

    @GetMapping("/location/profile")
    @Operation(summary = "Toob userId järgi tema profiiliaadressi")
    public LocationResponse getProfileAddress(@RequestParam Integer userId) {
        return locationService.getProfileAddress(userId);
    }
}
