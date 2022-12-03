package ee.valiit.back_3nurka.business.bike;

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
public class BikeOrderRequest implements Serializable {
    private final Integer orderId;
    private final Integer bikeId;
    private final Integer workTypeId;
    private final Integer bikeStatusId;
    private final Integer packageFieldId;
    @NotNull
    private final LocalDate dateFrom;
    private final LocalDate dateTo;
    @Size(max = 1000)
    private final String customerComment;
}