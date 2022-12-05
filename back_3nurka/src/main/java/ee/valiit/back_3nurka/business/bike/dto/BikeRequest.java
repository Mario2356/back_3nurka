package ee.valiit.back_3nurka.business.bike.dto;

import ee.valiit.back_3nurka.domain.bike.Bike;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link Bike} entity
 */
@Data
public class BikeRequest implements Serializable {
    private Integer brandId;
    private Integer userId;
    @Size(max = 255)
    private String bikeModel;
}