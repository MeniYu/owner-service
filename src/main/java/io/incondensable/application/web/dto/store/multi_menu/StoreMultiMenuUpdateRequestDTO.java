package io.incondensable.application.web.dto.store.multi_menu;

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
public class StoreMultiMenuUpdateRequestDTO {
    private String name;
    private String phoneNumber;
    private AddressCreateRequestDTO address;
    private String storeCategoryType;
}
