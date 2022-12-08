package ee.valiit.back_3nurka.domain.order;

import ee.valiit.back_3nurka.business.shop.OrderResponse;
import ee.valiit.back_3nurka.business.shop.SubmitOrder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OrderMapper {
    @Mapping(source = "id", target = "orderId")
    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "status.id", target = "orderStatusId")
    @Mapping(source = "status.name", target = "orderStatusName")
    @Mapping(source = "address.id", target = "addressId")
    OrderResponse toOrderResponse(Order order);


}
