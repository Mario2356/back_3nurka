package ee.valiit.back_3nurka.domain.bike;

import ee.valiit.back_3nurka.business.bike.BikeRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface BikeMapper {

    @Mapping(source = "brandName", target = "brand.name")
    @Mapping(source = "bikeModel", target = "model")
    Bike toEntity(BikeRequest bikeRequest);

}
