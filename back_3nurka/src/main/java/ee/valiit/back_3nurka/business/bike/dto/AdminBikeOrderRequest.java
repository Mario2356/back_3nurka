package ee.valiit.back_3nurka.business.bike.dto;

import ee.valiit.back_3nurka.domain.bike_order.BikeOrder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link BikeOrder} entity
 */
@Data
public class AdminBikeOrderRequest implements Serializable {
    private  Integer orderId;
    @Size(max = 255)
    @NotNull
    private  String firstName;
    @Size(max = 255)
    @NotNull
    private  String lastName;
    @Size(max = 50)
    @NotNull
    private  String email;
    @Size(max = 20)
    @NotNull
    private  String orderStatus;
    @Size(max = 50)
    @NotNull
    private  String orderAddress;
    @Size(max = 255)
    @NotNull
    private  String orderDistrict;
    @Size(max = 20)
    @NotNull
    private  String orderNumber;
    @Size(max = 255)
    @NotNull
    private  String bikeBrandName;
    @Size(max = 255)
    private  String bikeModel;
    @Size(max = 255)
    @NotNull
    private  String workType;
    @Size(max = 20)
    @NotNull
    private  String bikeStatus;
    @Size(max = 255)
    @NotNull
    private  String packageFieldName;
    @NotNull
    private  Integer packageFieldPrice;
    @NotNull
    private  LocalDate dateFrom;
    private  LocalDate dateTo;
    @Size(max = 1000)
    private  String techComment;
    @Size(max = 1000)
    private  String customerComment;
}