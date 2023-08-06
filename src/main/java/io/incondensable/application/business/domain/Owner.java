package io.incondensable.application.business.domain;

import io.incondensable.application.business.domain.vt.Address;
import io.incondensable.application.business.domain.vt.EntityDetails;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
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
@SequenceGenerator(name = "meniyu_id_generator", sequenceName = "owner_sequence", allocationSize = 1)
public class Owner extends AsIdentity {

    private String firstname;
    private String lastname;
    private int age;

    private String jwt;
    @Column(unique = true, nullable = false)
    private String userId;

    @Embedded
    private Address address;

    @Column(unique = true)
    private String phoneNumber;

    @Column(unique = true)
    private String email;

    private boolean canHaveMultiMenu;
    private boolean canHaveMultipleStores;

    @Embedded
    private EntityDetails entityDetails;

    public boolean canHaveMultiMenu() {
        return this.canHaveMultiMenu;
    }

    public boolean canHaveMultipleStores() {
        return this.canHaveMultipleStores;
    }
}
