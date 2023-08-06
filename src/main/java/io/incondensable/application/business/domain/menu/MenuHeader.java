package io.incondensable.application.business.domain.menu;

import io.incondensable.application.business.domain.AsIdentity;
import io.incondensable.application.business.domain.vt.EntityDetails;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class MenuHeader extends AsIdentity {

    private String categoryName;
    private String description;

    @OneToOne
    private MenuHeaderIcon icon;

    @OneToMany(mappedBy = "menuHeader", orphanRemoval = true)
    private Collection<MenuDetails> details = new ArrayList<>();

    @Embedded
    private EntityDetails entityDetails;
}
