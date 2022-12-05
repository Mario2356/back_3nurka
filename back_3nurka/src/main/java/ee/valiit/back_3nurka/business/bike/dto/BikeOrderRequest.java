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
public class BikeOrderRequest implements Serializable {
    private  Integer orderId;
    private  Integer bikeId;
    private  Integer workTypeId;
    private  Integer packageFieldId;
    @NotNull
    private  LocalDate dateFrom;
    private  LocalDate dateTo;
    @Size(max = 1000)
    private  String customerComment;
    private  String techComment;
}