package io.incondensable.application.web.dto.address;

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
public class AddressCreateRequestDTO {
    private String country;
    private String province;
    private String city;
    private String detailedAddress;
    private int buildingNumber;
    private int apartmentNumber;
}
