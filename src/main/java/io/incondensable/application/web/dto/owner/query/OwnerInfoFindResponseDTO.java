package io.incondensable.application.web.dto.owner.query;

import io.incondensable.application.web.dto.address.query.AddressFindResponseDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author abbas
 */
@Getter
@Setter
@NoArgsConstructor
public class OwnerInfoFindResponseDTO {
    private int age;
    private String email;
    private String lastname;
    private String firstname;
    private String phoneNumber;
    private AddressFindResponseDTO address;
}
