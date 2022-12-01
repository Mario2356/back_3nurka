package ee.valiit.back_3nurka.business.user;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RegisterController {

    @Resource
    private RegisterService registerService;

    @PostMapping("/register/new")
    @Operation(summary = "Registreerib uue kasutaja andmed")
    public RegisterResponse registerNewCustomer(@RequestBody RegisterRequest registerRequest) {
        RegisterResponse response = registerService.registerNewCustomer(registerRequest);
        return response;
    }


}
