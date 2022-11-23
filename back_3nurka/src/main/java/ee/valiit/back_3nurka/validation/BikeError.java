package ee.valiit.back_3nurka.validation;

import lombok.Getter;

@Getter
public enum BikeError {
    INCORRECT_CREDENTIALS("Sellist kasutajanime või parooli ei leitud", "123");

    private final String message;

    private final String errorCode;

    BikeError(String message, String errorCode) {
        this.errorCode = errorCode;
        this.message = message;
    }
}
