package io.incondensable.application.web.dto.address;

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
public class AddressFindResponseDTO {
    private String country;
    private String province;
    private String city;
    private String detailedAddress;
    private int buildingNumber;
    private int apartmentNumber;
}
