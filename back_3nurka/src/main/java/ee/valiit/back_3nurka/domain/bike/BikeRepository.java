package ee.valiit.back_3nurka.domain.bike;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BikeRepository extends JpaRepository<Bike, Integer> {
    @Query("select b from Bike b where b.user.id = ?1")
    List<Bike> findBikeBy(Integer id);

}

