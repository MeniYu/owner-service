package io.incondensable.application.web.dto.address.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author abbas
 */
@Getter
@Setter
@AllArgsConstructor
public class AddressCreateRequestDTO {
    private String country;
    private String province;
    private String city;
    private String detailedAddress;
    private int buildingNumber;
    private int apartmentNumber;
}
