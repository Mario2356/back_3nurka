package ee.valiit.back_3nurka.domain.bike_order;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link BikeOrder} entity
 */
@Data
public class BikeOrderDto implements Serializable {
    private final Integer orderId;
    @Size(max = 255)
    @NotNull
    private final String orderUserCustomerFirstName;
    @Size(max = 255)
    @NotNull
    private final String orderUserCustomerLastName;
    @Size(max = 50)
    @NotNull
    private final String orderUserEmail;
    @Size(max = 20)
    @NotNull
    private final String orderStatusName;
    @Size(max = 50)
    @NotNull
    private final String orderAddressStreetName;
    @Size(max = 20)
    @NotNull
    private final String orderNumber;
    @Size(max = 255)
    @NotNull
    private final String bikeBrandName;
    @Size(max = 255)
    private final String bikeModel;
    @Size(max = 255)
    @NotNull
    private final String workTypeName;
    @Size(max = 20)
    @NotNull
    private final String bikeStatusName;
    @Size(max = 255)
    @NotNull
    private final String packageFieldName;
    @NotNull
    private final Integer packageFieldPrice;
    @NotNull
    private final LocalDate dateFrom;
    private final LocalDate dateTo;
    @Size(max = 1000)
    private final String techComment;
    @Size(max = 1000)
    private final String customerComment;
}