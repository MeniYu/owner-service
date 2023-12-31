package io.incondensable.application.web.dto.owner;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author abbas
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class OwnerBaseDTO {
    private String firstname;
    private String lastname;
    private int age;
}
