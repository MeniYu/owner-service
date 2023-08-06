package io.incondensable.application.web.dto.address.query;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author abbas
 */
@Getter
@Setter
@NoArgsConstructor
public class AddressFindResponseDTO {
    private String country;
    private String province;
    private String city;
    private String detailedAddress;
    private int buildingNumber;
    private int apartmentNumber;
}
