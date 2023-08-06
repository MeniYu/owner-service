package io.incondensable.application.business.domain;

import io.incondensable.application.business.domain.vt.EntityDetails;
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
@SequenceGenerator(name = "meniyu_id_generator", sequenceName = "employee_sequence", allocationSize = 1)
public class Employee extends AsIdentity {

    private String firstname;
    private String lastname;
    private int age;

    @Embedded
    private EntityDetails entityDetails;

}
