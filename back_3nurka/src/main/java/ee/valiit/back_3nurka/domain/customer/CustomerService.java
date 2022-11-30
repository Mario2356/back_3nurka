package ee.valiit.back_3nurka.domain.customer;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CustomerService {

    @Resource
    private CustomerRepository customerRepository;

    public void saveNewCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}
