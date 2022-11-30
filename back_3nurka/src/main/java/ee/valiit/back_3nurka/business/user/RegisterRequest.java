package ee.valiit.back_3nurka.business.user;

import ee.valiit.back_3nurka.domain.user.User;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link User} entity
 */
@Data
public class RegisterRequest implements Serializable {
    @Size(max = 255)
    @NotNull
    private String firstName;
    @Size(max = 255)
    @NotNull
    private String lastName;
    @Size(max = 50)
    @NotNull
    private String email;
    @Size(max = 50)
    @NotNull
    private String password;
}