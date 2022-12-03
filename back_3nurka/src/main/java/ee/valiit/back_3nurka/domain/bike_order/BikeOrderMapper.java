package ee.valiit.back_3nurka.domain.bike_order;

import ee.valiit.back_3nurka.business.bike.BikeOrderRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface BikeOrderMapper {

    @Mapping(source = "orderId", target = "order.id")
    @Mapping(source = "bikeId", target = "bike.id")
    @Mapping(source = "workTypeId", target = "workType.id")
    @Mapping(source = "packageFieldId", target = "packageField.id")
    BikeOrder ToBikeOrder(BikeOrderRequest bikeOrderRequest);

}
