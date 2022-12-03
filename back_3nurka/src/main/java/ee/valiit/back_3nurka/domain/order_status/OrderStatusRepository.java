package ee.valiit.back_3nurka.domain.order_status;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, Integer> {
}