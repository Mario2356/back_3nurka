package ee.valiit.back_3nurka.domain.bike_order;

import ee.valiit.back_3nurka.business.bike.dto.AdminBikeOrderRequest;
import ee.valiit.back_3nurka.business.bike.dto.BikeOrderDto;
import ee.valiit.back_3nurka.business.bike.dto.BikeOrderRequest;
import ee.valiit.back_3nurka.business.bike.dto.TechCommentInfo;
import ee.valiit.back_3nurka.business.shop.AdminOrderRequest;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface BikeOrderMapper {

    BikeOrder toBikeOrder(BikeOrderRequest bikeOrderRequest);


    @Mapping(source = "id", target = "bikeOrderId")
    @Mapping(source = "bike.brand.name", target = "bikeBrandName")
    @Mapping(source = "bike.model", target = "bikeModel")
    @Mapping(source = "workType.name", target = "workTypeName")
    @Mapping(source = "packageField.name", target = "packageFieldName")
    @Mapping(source = "packageField.price", target = "packageFieldPrice")
    BikeOrderDto toBikeOrderDto(BikeOrder bikeOrder);

    List<BikeOrderDto> toBikeOrderDtos(List<BikeOrder> bikeOrders);

    @Mapping(source = "order.id", target = "orderId")
    @Mapping(source = "order.user.email", target = "orderUserEmail")
    @Mapping(source = "order.status.id", target = "orderStatusId")
    @Mapping(source = "order.status.name", target = "orderStatusName")
    @Mapping(source = "order.user.customer.firstName", target = "firstName")
    @Mapping(source = "order.user.customer.lastName", target = "lastName")
    @Mapping(source = "order.address.district.name", target = "orderAddressDistrictName")
    @Mapping(source = "order.address.streetName", target = "orderAddressStreetName")
    @Mapping(source = "order.address.phone", target = "orderAddressPhone")
    @Mapping(source = "order.number", target = "orderNumber")
    @Mapping(source = "order.dateFrom", target = "orderDateFrom")
    @Mapping(source = "order.dateTo", target = "orderDateTo")
    @Mapping(source = "order.price", target = "orderPrice")
    @Mapping(source = "bike.brand.name", target = "bikeBrandName")
    @Mapping(source = "bike.model", target = "bikeModel")
    @Mapping(source = "workType.name", target = "workTypeName")
    @Mapping(source = "bikeStatus.name", target = "bikeStatusName")
    @Mapping(source = "packageField.name", target = "packageFieldName")
    @Mapping(source = "packageField.price", target = "packageFieldPrice")
    AdminOrderRequest toAdminOrderDto(BikeOrder bikeOrder);

    List<AdminOrderRequest> toAdminOrderDtos(List<BikeOrder> bikeOrders);


    @Mapping(source = "order.id", target = "orderId")
    @Mapping(source = "order.user.customer.firstName", target = "firstName")
    @Mapping(source = "order.user.customer.lastName", target = "lastName")
    @Mapping(source = "order.user.email", target = "email")
    @Mapping(source = "order.status.name", target = "orderStatus")
    @Mapping(source = "order.address.streetName", target = "orderAddress")
    @Mapping(source = "order.address.district.name", target = "orderDistrict")
    @Mapping(source = "order.number", target = "orderNumber")
    @Mapping(source = "bike.brand.name", target = "bikeBrandName")
    @Mapping(source = "bike.model", target = "bikeModel")
    @Mapping(source = "workType.name", target = "workType")
    @Mapping(source = "bikeStatus.name", target = "bikeStatus")
    @Mapping(source = "packageField.name", target = "packageFieldName")
    @Mapping(source = "packageField.price", target = "packageFieldPrice")
    AdminBikeOrderRequest toAdminBikeOrderDto(BikeOrder bikeOrder);




//    BikeOrder ToBikeOrder(TechCommentInfo Info);
//
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    BikeOrder updateBikeOrderTechCommentInfo(TechCommentInfo techCommentInfo, @MappingTarget BikeOrder bikeOrder);
//
}

//    private Integer bikeOrderId;
//    @Size(max = 255)
//    @NotNull
//    private String bikeBrandName;
//    @Size(max = 255)
//    private String bikeModel;
//    @Size(max = 255)
//    @NotNull
//    private String workTypeName;
//    @Size(max = 255)
//    @NotNull
//    private String packageFieldName;
//    @NotNull
//    private Integer packageFieldPrice;
//    @Size(max = 1000)
//    private String customerComment;