package io.incondensable.application.web.dto.owner.command;

import io.incondensable.application.web.dto.address.command.AddressCreateRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author abbas
 */
@Getter
@Setter
@AllArgsConstructor
public class OwnerCreateRequestDTO {
    private String firstname;
    private String lastname;
    private Integer age;
    private String phoneNumber;
    private String email;
    private AddressCreateRequestDTO address;
}
