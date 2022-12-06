package ee.valiit.back_3nurka.business.location;

import ee.valiit.back_3nurka.domain.user.User;
import ee.valiit.back_3nurka.domain.user.UserMapper;
import ee.valiit.back_3nurka.domain.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LocationService {

    @Resource
    private UserService userService;

    @Resource
    private UserMapper userMapper;

    public LocationResponse getProfileAddress(Integer userId) {
        User user = userService.getUser(userId);
        LocationResponse locationResponse = userMapper.toLocationResponse(user);
        return locationResponse;
    }
}
