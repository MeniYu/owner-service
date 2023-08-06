package io.incondensable.application.business.domain.vt;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author abbas
 */
@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String country;
    private String province;
    private String city;
    private String detailedAddress;
    private int buildingNumber;
    private int apartmentNumber;
}
