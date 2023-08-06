package io.incondensable.application.business.exception.general;

import io.incondensable.exception.BusinessException;
import org.springframework.http.HttpStatus;

/**
 * @author abbas
 */
public class PhoneNumberDuplicateException extends BusinessException {
    public PhoneNumberDuplicateException(String phoneNumber) {
        super(new BusinessException(
                "phone.number.duplicate",
                new Object[]{phoneNumber},
                HttpStatus.BAD_REQUEST
        ));
    }
}
