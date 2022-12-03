package ee.valiit.back_3nurka.business.order;


import ee.valiit.back_3nurka.domain.bike.Bike;
import ee.valiit.back_3nurka.domain.bike.brand.Brand;
import ee.valiit.back_3nurka.domain.order.Order;
import ee.valiit.back_3nurka.domain.order.OrderService;
import ee.valiit.back_3nurka.domain.orderStatus.OrderStatus;
import ee.valiit.back_3nurka.domain.orderStatus.OrderStatusService;
import ee.valiit.back_3nurka.domain.user.User;
import ee.valiit.back_3nurka.domain.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BusinessOrderService {

    public OrderResponse getOrderResponse;
    @Resource
    UserService userService;

    @Resource
    OrderStatusService orderStatusService;

    @Resource
    OrderService orderService;


    public Order startOrder(Integer userId) {
        User user = userService.getBikeUser(userId);
        OrderStatus orderStatus = orderStatusService.getOrderStatus(1);
        String number = orderService.generateOrderNumber(userId);

        Order order = new Order();
        order.setUser(user);
        order.setStatus(orderStatus);
        order.setNumber(number);
        return orderService.addOrder(order);

    }
}
