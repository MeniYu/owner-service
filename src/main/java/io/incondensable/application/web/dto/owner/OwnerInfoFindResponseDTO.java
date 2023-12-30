package io.incondensable.application.web.dto.owner;

import io.incondensable.application.web.dto.address.AddressFindResponseDTO;
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
public class OwnerInfoFindResponseDTO {
    private int age;
    private String email;
    private String lastname;
    private String firstname;
    private String phoneNumber;
    private AddressFindResponseDTO address;
}
