package ee.valiit.back_3nurka.business.shop;

import ee.valiit.back_3nurka.domain.bike_order.BikeOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link BikeOrder} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminOrderRequest implements Serializable {
    private Integer id;
    private Integer orderId;
    @Size(max = 50)
    @NotNull
    private String orderUserEmail;
    private Integer orderStatusId;
    @Size(max = 20)
    @NotNull
    private String orderStatusName;
    @Size(max = 255)
    @NotNull
    private String orderAddressDistrictName;
    @Size(max = 50)
    @NotNull
    private String orderAddressStreetName;
    @Size(max = 50)
    @NotNull
    private String orderAddressPhone;
    @Size(max = 20)
    @NotNull
    private String orderNumber;
    private LocalDate orderDateFrom;
    private LocalDate orderDateTo;
    private Integer orderPrice;
    @Size(max = 255)
    @NotNull
    private String bikeBrandName;
    @Size(max = 255)
    private String bikeModel;
    @Size(max = 255)
    @NotNull
    private String workTypeName;
    @Size(max = 20)
    @NotNull
    private String bikeStatusName;
    @Size(max = 255)
    @NotNull
    private String packageFieldName;
    @NotNull
    private Integer packageFieldPrice;
    @NotNull
    private LocalDate dateFrom;
    private LocalDate dateTo;
    @Size(max = 1000)
    private String techComment;
    @Size(max = 1000)
    private String customerComment;
}