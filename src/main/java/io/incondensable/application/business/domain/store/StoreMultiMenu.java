package io.incondensable.application.business.domain.store;

import io.incondensable.application.business.domain.menu.MenuDetails;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author abbas
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "meniyu_id_generator", sequenceName = "multiMenuStore_sequence", allocationSize = 1)
public class StoreMultiMenu extends Store {

    @OneToMany
    private Set<MenuDetails> menuDetails = new HashSet<>();

}
