package ee.valiit.back_3nurka.business.location;

import ee.valiit.back_3nurka.domain.address.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link Address} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationDto implements Serializable {
    private Integer districtId;
    @Size(max = 255)
    @NotNull
    private String districtName;
    @Size(max = 50)
    @NotNull
    private String streetName;
    @Size(max = 50)
    @NotNull
    private String phone;
}