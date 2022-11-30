package ee.valiit.back_3nurka.domain.bike.brand;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

    @Override
    List<Brand> findAll();
}