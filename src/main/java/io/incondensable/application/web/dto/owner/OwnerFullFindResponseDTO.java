package io.incondensable.application.web.dto.owner;

import io.incondensable.application.web.dto.address.AddressFindResponseDTO;
import io.incondensable.application.web.dto.owner.OwnerBaseDTO;
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
public class OwnerFullFindResponseDTO extends OwnerBaseDTO {
    private int age;
    private String email;
    private String ownerId;
    private String lastname;
    private String firstname;
    private String phoneNumber;
    private AddressFindResponseDTO address;
}
