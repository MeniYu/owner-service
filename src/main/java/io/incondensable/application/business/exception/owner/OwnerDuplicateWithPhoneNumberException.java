package io.incondensable.application.business.exception.owner;

import io.incondensable.exception.BusinessException;
import org.springframework.http.HttpStatus;

/**
 * @author abbas
 */
public class OwnerDuplicateWithPhoneNumberException extends BusinessException {
    public OwnerDuplicateWithPhoneNumberException(String phoneNumber) {
        super(new BusinessException(
                "owner.phone.number.duplicate",
                new Object[]{phoneNumber},
                HttpStatus.BAD_REQUEST
        ));
    }
}
