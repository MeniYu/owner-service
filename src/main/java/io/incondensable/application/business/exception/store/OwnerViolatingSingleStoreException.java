package io.incondensable.application.business.exception.store;

import io.incondensable.exception.BusinessException;
import org.springframework.http.HttpStatus;

/**
 * @author abbas
 */
public class OwnerViolatingSingleStoreException extends BusinessException {
    public OwnerViolatingSingleStoreException(Long ownerId) {
        super(new BusinessException(
                "owner.violated.single.store",
                new Object[]{ownerId},
                HttpStatus.NOT_FOUND
        ));
    }
}
