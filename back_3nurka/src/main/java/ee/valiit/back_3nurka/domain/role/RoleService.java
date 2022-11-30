package ee.valiit.back_3nurka.domain.role;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoleService {

    public static final int CUSTOMER_ROLE_ID = 2;

    @Resource
    private RoleRepository roleRepository;


    public Role getRoleCustomer() {
      return roleRepository.findById(CUSTOMER_ROLE_ID).get();
    }
}
