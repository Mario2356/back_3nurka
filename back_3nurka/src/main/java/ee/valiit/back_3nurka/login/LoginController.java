package ee.valiit.back_3nurka.login;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/login")
    @Operation(summary = "Logib teenusesse sisse")
    public void login() {
    }
}
