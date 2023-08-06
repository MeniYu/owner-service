package io.incondensable.application.web.dto.owner;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author abbas
 */
@Getter
@Setter
@NoArgsConstructor
public class OwnerBaseDTO {
    private String firstname;
    private String lastname;
    private int age;
}
