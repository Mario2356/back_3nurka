package ee.valiit.back_3nurka.infrastructure.error;

import lombok.Data;

@Data
public class ApiError {
    private String message;
    private String errorCode;
}

