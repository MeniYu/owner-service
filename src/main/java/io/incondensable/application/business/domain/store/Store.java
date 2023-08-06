package io.incondensable.application.business.domain.store;

import io.incondensable.application.business.domain.Employee;
import io.incondensable.application.business.domain.Owner;
import io.incondensable.application.business.domain.vt.Address;
import io.incondensable.application.business.domain.vt.EntityDetails;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author abbas
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "meniyu_id_generator")
    private Long id;

    private String name;
    private String phoneNumber;
    private String qrCode;

    @Embedded
    private Address address;

    @ManyToOne
    private Owner owner;

    @OneToMany
    private Collection<Employee> employees = new ArrayList<>();

    @Embedded
    private EntityDetails entityDetails;

    @Enumerated(EnumType.STRING)
    private StoreCategoryEnum type;

}
