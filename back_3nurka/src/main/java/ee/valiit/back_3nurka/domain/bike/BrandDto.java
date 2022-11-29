package ee.valiit.back_3nurka.domain.bike;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link Brand} entity
 */
@Data
public class BrandDto implements Serializable {
    private final Integer brandId;
    @Size(max = 255)
    @NotNull
    private final String brandName;
    @NotNull
    private final Boolean brandIsOther;
}