package ee.valiit.back_3nurka.domain.user;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public User getValidUser(String username, String password) {

    }

}
