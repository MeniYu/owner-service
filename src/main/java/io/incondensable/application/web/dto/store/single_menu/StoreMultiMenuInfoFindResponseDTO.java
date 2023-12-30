package io.incondensable.application.web.dto.store.single_menu;

import io.incondensable.application.web.dto.address.AddressFindResponseDTO;
import io.incondensable.application.web.dto.owner.OwnerInfoFindResponseDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author abbas
 */
@Getter
@Setter
@NoArgsConstructor
public class StoreMultiMenuInfoFindResponseDTO {
    private String name;
    private String phoneNumber;
    private AddressFindResponseDTO address;
    private OwnerInfoFindResponseDTO owner;
//    private EmployeeFindResponseDTO employee;
    private String type;
}
