package io.incondensable.application.business.exception.owner;

import io.incondensable.exception.BusinessException;
import org.springframework.http.HttpStatus;

/**
 * @author abbas
 */
public class OwnerNotFoundWithIdException extends BusinessException {

    public OwnerNotFoundWithIdException(Long ownerId) {
        super(new BusinessException(
                "owner.not.found.with.id",
                new Object[]{ownerId},
                HttpStatus.NOT_FOUND
        ));
    }

}
