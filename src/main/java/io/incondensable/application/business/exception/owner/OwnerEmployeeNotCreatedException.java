package io.incondensable.application.business.exception.owner;

import io.incondensable.exception.BusinessException;
import org.springframework.http.HttpStatus;

/**
 * @author abbas
 */
public class OwnerEmployeeNotCreatedException extends BusinessException {
    public OwnerEmployeeNotCreatedException(long ownerId) {
        super(new BusinessException(
                "",
                new Object[]{ownerId},
                HttpStatus.BAD_REQUEST
        ));
    }
}
