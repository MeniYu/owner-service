package io.incondensable.application.business.exception.store;

import io.incondensable.exception.BusinessException;
import org.springframework.http.HttpStatus;

/**
 * @author abbas
 */
public class StoreNotFoundException extends BusinessException {

    public StoreNotFoundException(Long storeId) {
        super(new BusinessException(
                "store.not.found.with.id",
                new Object[]{storeId},
                HttpStatus.NOT_FOUND
        ));
    }

}
