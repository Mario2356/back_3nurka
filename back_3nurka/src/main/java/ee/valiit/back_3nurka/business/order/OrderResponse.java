package ee.valiit.back_3nurka.business.order;

import ee.valiit.back_3nurka.domain.order.Order;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link Order} entity
 */
@Data
public class OrderResponse implements Serializable {
    private final Integer orderId;
    private final Integer userId;
    private final Integer orderStatusId;
    @Size(max = 20)
    @NotNull
    private final String orderStatusName;
    private final Integer addressId;
    @Size(max = 50)
    @NotNull
    private final String addressStreetName;
    @Size(max = 20)
    @NotNull
    private final String number;
    private final LocalDate dateFrom;
    private final LocalDate dateTo;
    private final Integer price;
}