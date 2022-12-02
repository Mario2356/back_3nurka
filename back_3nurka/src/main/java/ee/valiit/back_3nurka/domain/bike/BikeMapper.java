package ee.valiit.back_3nurka.domain.bike;

import ee.valiit.back_3nurka.domain.bike.brand.Brand;
import ee.valiit.back_3nurka.domain.user.User;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface BikeMapper {

}
