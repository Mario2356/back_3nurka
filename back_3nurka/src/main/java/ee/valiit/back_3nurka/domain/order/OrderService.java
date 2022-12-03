package ee.valiit.back_3nurka.domain.order;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderService {

    @Resource
    OrderRepository orderRepository;


    public String generateOrderNumber(Integer userId) {
        String orderNumber = String.valueOf(userId + System.currentTimeMillis());
        return orderNumber;
    }

    public Order addOrder(Order order) {
        return orderRepository.save(order);

    }
}
