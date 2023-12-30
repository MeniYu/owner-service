package io.incondensable.application.business.exception.owner;

import io.incondensable.exception.BusinessException;
import org.springframework.http.HttpStatus;

/**
 * @author abbas
 */
public class OwnerDuplicateWithEmailException extends BusinessException {

    public OwnerDuplicateWithEmailException(String email) {
        super(new BusinessException(
                "owner.duplicate.with.email",
                new Object[]{email},
                HttpStatus.BAD_REQUEST
        ));
    }

}
