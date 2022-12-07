package ee.valiit.back_3nurka.business.bike.dto;

import ee.valiit.back_3nurka.domain.bike_order.BikeOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link BikeOrder} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BikeOrderDto implements Serializable {
    private Integer bikeOrderId;
    @Size(max = 255)
    @NotNull
    private String bikeBrandName;
    @Size(max = 255)
    private String bikeModel;
    @Size(max = 255)
    @NotNull
    private String workTypeName;
    @Size(max = 255)
    @NotNull
    private String packageFieldName;
    @NotNull
    private Integer packageFieldPrice;
    @Size(max = 1000)
    private String customerComment;
    @Size(max = 1000)
    private String techComment;
}