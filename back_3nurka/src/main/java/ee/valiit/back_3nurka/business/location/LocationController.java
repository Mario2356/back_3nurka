package ee.valiit.back_3nurka.business.location;

import ee.valiit.back_3nurka.domain.address.Address;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
    @GetMapping("/location/profile")
    @Operation(summary = "Toob userId järgi tema aadressi")
    public Address getCustomerAddress(@RequestParam Integer userId) {
        return null;
    }
}
