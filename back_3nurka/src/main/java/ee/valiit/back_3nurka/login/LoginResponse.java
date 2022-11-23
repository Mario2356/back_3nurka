package ee.valiit.back_3nurka.login;

import ee.valiit.back_3nurka.domain.user.User;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link User} entity
 */
@Data
public class LoginResponse implements Serializable {
    private final Integer userId;
    private final Integer roleId;
    @Size(max = 255)
    @NotNull
    private final String roleType;
}