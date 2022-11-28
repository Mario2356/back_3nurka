package ee.valiit.back_3nurka.domain.bike;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BikeRepository extends JpaRepository<Bike, Integer> {
    @Override
    List<Bike> findAll();


//    @Query("select b from Bike b where b.brand = ?1 order by b.brand.name, b.brand.isOther")
//    List<Bike> findAllBrands(Brand brand);






}