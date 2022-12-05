package ee.valiit.back_3nurka.domain.customer;

import ee.valiit.back_3nurka.business.user.dto.RegisterRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CustomerMapper {


    Customer toEntity(RegisterRequest request);
}
