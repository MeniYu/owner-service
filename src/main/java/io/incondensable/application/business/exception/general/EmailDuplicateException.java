package io.incondensable.application.business.exception.general;

import io.incondensable.exception.BusinessException;
import org.springframework.http.HttpStatus;

/**
 * @author abbas
 */
public class EmailDuplicateException extends BusinessException {
    public EmailDuplicateException(String email) {
        super(new BusinessException(
                "email.duplicate",
                new Object[]{email},
                HttpStatus.BAD_REQUEST
        ));
    }
}
