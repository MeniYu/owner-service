package io.incondensable.application.business.domain.menu;

import io.incondensable.application.business.domain.AsIdentity;
import io.incondensable.application.business.domain.vt.EntityDetails;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author abbas
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "meniyu_id_generator", sequenceName = "menu_detail_sequence")
public class MenuDetails extends AsIdentity {

    @OneToMany(mappedBy = "menuDetails", orphanRemoval = true)
    private Collection<Item> items = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "menu_header_id", insertable = false, updatable = false)
    private MenuHeader menuHeader;

    @Embedded
    private EntityDetails entityDetails;

}
