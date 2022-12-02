package ee.valiit.back_3nurka.domain.user;

import ee.valiit.back_3nurka.domain.bike.*;
import ee.valiit.back_3nurka.validation.Validation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    @Resource
    private BikeRepository bikeRepository;

    public User getValidUser(String email, String password) {
        Optional<User> userOptional = userRepository.findBy(email, password);
        Validation.validateUserCredentials(userOptional);
        User user = userOptional.get();
        return user;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }


    public User getBikeUser(Integer userId) {
        Optional<User> byUserId = userRepository.findById(userId);
        User user = byUserId.get();
        return user;
    }


    public void addUserBike (Bike bike) {
//        bike.setModel(bike.getModel());
//        bike.setBrand(bike.getBrand().setName());
        bikeRepository.save(bike);
    }
}
