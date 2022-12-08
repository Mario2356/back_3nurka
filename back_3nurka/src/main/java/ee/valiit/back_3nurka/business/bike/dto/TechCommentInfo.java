package ee.valiit.back_3nurka.business.bike.dto;

import ee.valiit.back_3nurka.domain.bike_order.BikeOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link BikeOrder} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TechCommentInfo implements Serializable {
    private Integer id;
    @Size(max = 1000)
    private String techComment;
}