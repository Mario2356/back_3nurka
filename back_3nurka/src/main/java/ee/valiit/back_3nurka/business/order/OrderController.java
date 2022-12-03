package ee.valiit.back_3nurka.business.order;

import ee.valiit.back_3nurka.domain.order.Order;
import ee.valiit.back_3nurka.domain.order.OrderMapper;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private BusinessOrderService businessOrderService;


    @PostMapping ("/order/start")
    @Operation(summary = "Alustab uue userId-ga seotud Orderi, staatus Ootel")
    public OrderResponse startOrder(@RequestParam Integer userId) {
        Order order = businessOrderService.startOrder(userId);
        return orderMapper.toOrderResponse(order);
    };

}
