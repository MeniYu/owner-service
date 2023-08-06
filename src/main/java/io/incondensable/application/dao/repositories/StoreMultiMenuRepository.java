package io.incondensable.application.dao.repositories;

import io.incondensable.application.business.domain.store.StoreMultiMenu;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author abbas
 */
@Repository
public interface StoreMultiMenuRepository extends StoreRepository<StoreMultiMenu, Long> {

    @Query("select s from StoreMultiMenu s where s.owner.id = :ownerId")
    List<StoreMultiMenu> findAllByOwnerId(@Param("ownerId") Long ownerId);

}
