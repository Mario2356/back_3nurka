package ee.valiit.back_3nurka.domain.bike_status;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeStatusRepository extends JpaRepository<BikeStatus, Integer> {
}