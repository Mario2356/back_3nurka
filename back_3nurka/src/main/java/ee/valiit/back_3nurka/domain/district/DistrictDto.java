package ee.valiit.back_3nurka.domain.district;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link District} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DistrictDto implements Serializable {
    private Integer districtId;
    @Size(max = 255)
    @NotNull
    private String districtName;
}