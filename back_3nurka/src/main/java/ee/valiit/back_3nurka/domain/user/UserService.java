package ee.valiit.back_3nurka.domain.user;

import ee.valiit.back_3nurka.domain.bike.*;
import ee.valiit.back_3nurka.validation.Validation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    @Resource
    private BikeRepository bikeRepository;

    @Resource
    private BikeMapper bikeMapper;

    public User getValidUser(String email, String password) {
        Optional<User> userOptional = userRepository.findBy(email, password);
        Validation.validateUserCredentials(userOptional);
        User user = userOptional.get();
        return user;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public Bike getValidBikeUser(Integer userId) {
        Optional<Bike> byUserId = bikeRepository.findById(userId);
        Bike bike = byUserId.get();
        return bike;
    }

    public void addUserBike(Bike bike, String bikeModel, String brandName) {
        bike.setModel(bikeModel);
        bike.getBrand().setName(brandName);
        bikeRepository.save(bike);
    }


}
