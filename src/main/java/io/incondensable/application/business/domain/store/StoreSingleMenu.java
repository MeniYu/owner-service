package io.incondensable.application.business.domain.store;

import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * StoreSingleMenu is a Store that can have only a simple Menu-As-Picture made by the Owner itself
 * This is the Free Option that every Store can use.
 * This option does not have Payment, Ordering, Comments and Votes, Cashier options
 * The Owner can only upload Menu once per month.
 *
 * @author abbas
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "meniyu_id_generator", sequenceName = "singleMenuStore_sequence", allocationSize = 1)
public class StoreSingleMenu extends Store {

    private byte[] menuImage;

}
