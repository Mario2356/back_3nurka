package ee.valiit.back_3nurka.domain.package_field;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PackageFieldRepository extends JpaRepository<PackageField, Integer> {
    @Query("select p from PackageField p where p.workType.id = ?1")
    List<PackageField> findByWorkTypeId(Integer workTypeId);



}