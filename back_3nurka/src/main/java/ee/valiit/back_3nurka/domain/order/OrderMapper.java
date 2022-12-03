package ee.valiit.back_3nurka.domain.order;

import ee.valiit.back_3nurka.business.order.OrderResponse;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OrderMapper {
    @Mapping(source = "id", target = "orderId")
    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "status.id", target = "orderStatusId")
    @Mapping(source = "status.name", target = "orderStatusName")
    @Mapping(source = "address.id", target = "addressId")
    @Mapping(source = "address.streetName", target = "addressStreetName")
    OrderResponse toOrderResponse(Order order);

}
