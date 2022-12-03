package ee.valiit.back_3nurka.domain.bike_order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeOrderRepository extends JpaRepository<BikeOrder, Integer> {
}