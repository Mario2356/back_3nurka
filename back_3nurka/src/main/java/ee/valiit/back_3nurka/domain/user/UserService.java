package ee.valiit.back_3nurka.domain.user;

import ee.valiit.back_3nurka.validation.Validation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public User getValidUser(String email, String password) {
        Optional<User> userOptional = userRepository.findBy(email, password);
        Validation.validateUserCredentials(userOptional);
        User user = userOptional.get();
        return user;
    }

}