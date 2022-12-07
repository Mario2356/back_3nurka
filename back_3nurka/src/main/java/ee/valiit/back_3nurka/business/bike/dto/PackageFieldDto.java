package ee.valiit.back_3nurka.business.bike.dto;

import ee.valiit.back_3nurka.domain.package_field.PackageField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link PackageField} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PackageFieldDto implements Serializable {
    private Integer id;
    @Size(max = 255)
    @NotNull
    private String name;
    @NotNull
    private Integer price;
}