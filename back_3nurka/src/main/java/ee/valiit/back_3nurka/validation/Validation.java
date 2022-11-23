package ee.valiit.back_3nurka.validation;

import ee.valiit.back_3nurka.domain.user.User;
import ee.valiit.back_3nurka.infrastructure.exception.BusinessException;

import java.util.Optional;

public class Validation {
    public static void validateUserCredentials(Optional<User> userOptional) {
        if (userOptional.isEmpty()) {
            throw new BusinessException(BikeError.INCORRECT_CREDENTIALS.getMessage(), BikeError.INCORRECT_CREDENTIALS.getErrorCode());
        }
    }
}
