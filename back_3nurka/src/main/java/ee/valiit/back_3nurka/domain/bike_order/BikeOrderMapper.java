package ee.valiit.back_3nurka.domain.bike_order;

import ee.valiit.back_3nurka.business.bike.dto.BikeOrderDto;
import ee.valiit.back_3nurka.business.bike.dto.BikeOrderRequest;
import org.mapstruct.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    BikeOrderDto toBikeOrderDto (BikeOrder bikeOrder);

    List<BikeOrderDto> toBikeOrderDtos(List<BikeOrder> bikeOrders);

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