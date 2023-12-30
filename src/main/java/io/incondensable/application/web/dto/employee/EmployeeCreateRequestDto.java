package io.incondensable.application.web.dto.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author abbas
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeCreateRequestDto {
    private String firstname;
    private String lastname;
    private int age;
}
