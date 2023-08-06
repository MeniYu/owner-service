package io.incondensable.application.business.domain.menu;

import io.incondensable.application.business.domain.AsIdentity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author abbas
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "meniyu_id_generator", sequenceName = "item_sequence")
public class Item extends AsIdentity {

    private String name;
    private Long price;
    private Boolean hasDiscount;
    private Double discount;

    @ManyToOne
    @JoinColumn(name = "menu_details_id", updatable = false, insertable = false)
    private MenuDetails menuDetails;

    @OneToOne(
            cascade = CascadeType.PERSIST,
            fetch = FetchType.LAZY,
            optional = false,
            mappedBy = "item",
            orphanRemoval = true
    )
    private ItemImage image;
}
