package ee.valiit.back_3nurka.domain.bike_order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BikeOrderRepository extends JpaRepository<BikeOrder, Integer> {
    @Query("select b from BikeOrder b where b.order.id = ?1")
    List<BikeOrder> findByOrder(Integer id);


}