package ee.valiit.back_3nurka.domain.bike;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BikeBrandRepository extends JpaRepository<BikeBrand, Integer> {

    @Override
    List<BikeBrand> findAll();
}