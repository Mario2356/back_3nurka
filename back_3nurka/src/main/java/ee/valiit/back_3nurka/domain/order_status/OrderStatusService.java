package ee.valiit.back_3nurka.domain.order_status;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;


@Service
public class OrderStatusService {

    @Resource
    OrderStatusRepository orderStatusRepository;
    public OrderStatus getOrderStatus(Integer orderStatusId) {
        Optional<OrderStatus> status = orderStatusRepository.findById(orderStatusId);
        OrderStatus orderStatus = status.get();
        return orderStatus;

    }
}
