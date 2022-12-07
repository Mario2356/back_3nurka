package ee.valiit.back_3nurka.business.shop;

import ee.valiit.back_3nurka.domain.order.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link Order} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubmitOrder implements Serializable {
    private Integer orderStatusId;
}