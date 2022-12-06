package ee.valiit.back_3nurka.business.shop;


import ee.valiit.back_3nurka.domain.bike_order.BikeOrder;
import ee.valiit.back_3nurka.domain.bike_order.BikeOrderDomService;
import ee.valiit.back_3nurka.domain.bike_order.BikeOrderMapper;
import ee.valiit.back_3nurka.domain.order.Order;
import ee.valiit.back_3nurka.domain.order.OrderService;
import ee.valiit.back_3nurka.domain.order_status.OrderStatus;
import ee.valiit.back_3nurka.domain.order_status.OrderStatusService;
import ee.valiit.back_3nurka.domain.user.User;
import ee.valiit.back_3nurka.domain.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopService {

    public OrderResponse getOrderResponse;
    @Resource
    UserService userService;

    @Resource
    OrderStatusService orderStatusService;

    @Resource
    OrderService orderService;

    @Resource
    BikeOrderDomService bikeOrderDomService;

    @Resource
    BikeOrderMapper bikeOrderMapper;


    public Order startOrder(Integer userId) {
        User user = userService.getUser(userId);
        OrderStatus orderStatus = orderStatusService.getOrderStatus(1);
        String number = orderService.generateOrderNumber(userId);

        Order order = new Order();
        order.setUser(user);
        order.setStatus(orderStatus);
        order.setNumber(number);
        return orderService.addOrder(order);

    }

    public List<AdminOrderRequest> getAdminAllOrders() {
        List<BikeOrder> allOrders = bikeOrderDomService.findAllOrders();
        List<AdminOrderRequest> adminOrderDtos = bikeOrderMapper.toAdminOrderDtos(allOrders);
        return adminOrderDtos;
    }

}
