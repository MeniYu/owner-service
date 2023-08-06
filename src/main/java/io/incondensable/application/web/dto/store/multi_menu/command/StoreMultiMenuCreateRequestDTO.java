package io.incondensable.application.web.dto.store.multi_menu.command;

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
public class StoreMultiMenuCreateRequestDTO {
    private Long ownerId;
    private String name;
    private String phoneNumber;
    private AddressCreateRequestDTO address;
    private String storeCategoryType;
}
