package ee.valiit.back_3nurka.business.shop;

import ee.valiit.back_3nurka.domain.order.Order;
import ee.valiit.back_3nurka.domain.order.OrderMapper;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ShopController {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private ShopService shopService;


    @PostMapping("/order/start")
    @Operation(summary = "Alustab uue userId-ga seotud Orderi, staatus Ootel")
    public OrderResponse startOrder(@RequestParam Integer userId) {
        Order order = shopService.startOrder(userId);
        return orderMapper.toOrderResponse(order);
    }

    @GetMapping("/admin/order")
    @Operation(summary = "Toob kõikide Orderite andmed Admin tabelisse")
    public List<AdminOrderRequest> getAllOrders() {
        List<AdminOrderRequest> adminAllOrders = shopService.getAdminAllOrders();
        return adminAllOrders;
    }


}
