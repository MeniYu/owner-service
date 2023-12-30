package io.incondensable.application.web.dto.owner;

import io.incondensable.application.web.dto.address.AddressCreateRequestDTO;
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
public class OwnerCreateRequestDTO {
    private String firstname;
    private String lastname;
    private Integer age;
    private String phoneNumber;
    private String email;
    private boolean haveMultipleMenus;
    private boolean haveMultipleStores;
    private AddressCreateRequestDTO address;
}
