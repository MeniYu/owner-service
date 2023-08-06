package io.incondensable.application.web.dto.store.multi_menu.query;

import io.incondensable.application.web.dto.address.query.AddressFindResponseDTO;
import io.incondensable.application.web.dto.employee.query.EmployeeFindResponseDTO;
import io.incondensable.application.web.dto.owner.query.OwnerInfoFindResponseDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author abbas
 */
@Getter
@Setter
@NoArgsConstructor
public class StoreSingleMenuInfoFindResponseDTO {
    private String name;
    private String phoneNumber;
    private AddressFindResponseDTO address;
    private OwnerInfoFindResponseDTO owner;
    private EmployeeFindResponseDTO employee;
    private String type;
}
