package ee.valiit.back_3nurka.domain.bike;

import ee.valiit.back_3nurka.business.bike.BikeResponse;
import ee.valiit.back_3nurka.business.login.LoginResponse;
import ee.valiit.back_3nurka.domain.bike.brand.Brand;
import ee.valiit.back_3nurka.domain.user.User;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface BikeMapper {
    @Mapping(source = "id", target = "bikeId")
    @Mapping(source = "brand.id", target = "brandId")
    @Mapping(source = "model", target = "bikeModel")
    @Mapping(source = "brand.name", target = "brandName")
    BikeResponse toBikeResponse(Bike bike);

   List<BikeResponse> toBikeResponses(List<Bike> bikes);






}
