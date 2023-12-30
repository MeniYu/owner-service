package io.incondensable.application.business.domain;

import io.incondensable.application.business.domain.vt.EntityDetails;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <p>Employee relationship to Owner is not direct.
 * actually an Owner has a Store, that Store belongs to the Owner okay?
 * also, the Store has a Collection of Employees working in there.</p>
 *
 * @author abbas
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "meniyu_id_generator", sequenceName = "employee_sequence", allocationSize = 1)
public class Employee extends AsIdentity {

    private String firstname;
    private String lastname;
    private int age;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Owner owner;

    @Embedded
    private EntityDetails entityDetails;

}
