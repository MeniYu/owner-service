package io.incondensable.application.web.dto.owner.query;

import io.incondensable.application.business.domain.vt.Address;
import io.incondensable.application.web.dto.address.query.AddressFindResponseDTO;
import io.incondensable.application.web.dto.owner.OwnerBaseDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author abbas
 */
@Getter
@Setter
@NoArgsConstructor
public class OwnerFullFindResponseDTO extends OwnerBaseDTO {
    private int age;
    private String jwt;
    private String lastname;
    private String firstname;
    private String userId;
    private AddressFindResponseDTO address;
    private String phoneNumber;
    private String email;
    private String creatorId;
}
