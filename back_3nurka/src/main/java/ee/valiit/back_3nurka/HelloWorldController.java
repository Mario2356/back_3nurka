package ee.valiit.back_3nurka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello/world")
    public String helloWorld() {
        return "Hello World!!!";
    }

}
