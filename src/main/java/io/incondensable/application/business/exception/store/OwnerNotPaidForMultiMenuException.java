package io.incondensable.application.business.exception.store;

import io.incondensable.exception.BusinessException;
import org.springframework.http.HttpStatus;

/**
 * @author abbas
 */
public class OwnerNotPaidForMultiMenuException extends BusinessException {
    public OwnerNotPaidForMultiMenuException(Long ownerId) {
        super(new BusinessException(
                "owner.not.paid.multi.menu",
                new Object[]{ownerId},
                HttpStatus.NOT_FOUND
        ));
    }
}
