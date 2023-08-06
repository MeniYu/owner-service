package io.incondensable.application.web.dto.employee.query;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author abbas
 */
@Getter
@Setter
@NoArgsConstructor
public class EmployeeFindResponseDTO {
    private String firstname;
    private String lastname;
    private int age;
}
