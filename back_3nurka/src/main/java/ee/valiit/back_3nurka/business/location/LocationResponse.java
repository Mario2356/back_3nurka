package ee.valiit.back_3nurka.business.location;

import ee.valiit.back_3nurka.domain.address.Address;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link Address} entity
 */
@Data
public class LocationResponse implements Serializable {
    private final Integer addressId;
    private final Integer districtId;
    @Size(max = 255)
    @NotNull
    private final String districtName;
    @Size(max = 50)
    @NotNull
    private final String streetName;
    @Size(max = 50)
    @NotNull
    private final String phone;
}