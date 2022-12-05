package ee.valiit.back_3nurka.business.user;

import ee.valiit.back_3nurka.business.user.dto.RegisterRequest;
import ee.valiit.back_3nurka.business.user.dto.RegisterResponse;
import ee.valiit.back_3nurka.domain.customer.Customer;
import ee.valiit.back_3nurka.domain.customer.CustomerService;
import ee.valiit.back_3nurka.domain.customer.CustomerMapper;
import ee.valiit.back_3nurka.domain.role.Role;
import ee.valiit.back_3nurka.domain.role.RoleService;
import ee.valiit.back_3nurka.domain.user.User;
import ee.valiit.back_3nurka.domain.user.UserMapper;
import ee.valiit.back_3nurka.domain.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RegisterService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private CustomerMapper customerMapper;

    @Resource
    private RoleService roleService;

    @Resource
    private CustomerService customerService;

    @Resource
    private UserService userService;

    public RegisterResponse registerNewCustomer(RegisterRequest dto) {
        Role role = roleService.getRoleCustomer();
        Customer customer = customerMapper.toEntity(dto);
        customerService.saveNewCustomer(customer);

        User user = userMapper.toEntity(dto);
        user.setRole(role);
        user.setCustomer(customer);
        userService.saveUser(user);

        RegisterResponse response = new RegisterResponse();
        response.setUserId(user.getId());
        return response;
    }
}

