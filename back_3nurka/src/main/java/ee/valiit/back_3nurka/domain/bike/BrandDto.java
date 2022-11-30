package ee.valiit.back_3nurka.domain.bike;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Brand} entity
 */
@Data
public class BrandDto implements Serializable {
    private final Integer brandId;
    private final String brandName;
    private final Boolean brandIsOther;
}