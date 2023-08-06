package io.incondensable.application.dao.repositories.menu;

import io.incondensable.application.business.domain.menu.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author abbas
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
