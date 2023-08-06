package io.incondensable.application.dao.repositories;

import io.incondensable.application.business.domain.store.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author abbas
 */
@NoRepositoryBean
public interface StoreRepository<T extends Store, ID> extends JpaRepository<T, ID> {

}
