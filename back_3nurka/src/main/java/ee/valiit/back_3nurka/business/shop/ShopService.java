package ee.valiit.back_3nurka.business.shop;


import ee.valiit.back_3nurka.domain.order.Order;
import ee.valiit.back_3nurka.domain.order.OrderService;
import ee.valiit.back_3nurka.domain.order_status.OrderStatus;
import ee.valiit.back_3nurka.domain.order_status.OrderStatusService;
import ee.valiit.back_3nurka.domain.user.User;
import ee.valiit.back_3nurka.domain.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ShopService {

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