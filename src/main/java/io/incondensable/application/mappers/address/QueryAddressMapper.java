package io.incondensable.application.mappers.address;

import io.incondensable.application.business.domain.vt.Address;
import io.incondensable.application.web.dto.address.query.AddressFindResponseDTO;
import org.mapstruct.Mapper;

/**
 * @author abbas
 */
@Mapper(componentModel = "spring")
public interface QueryAddressMapper {

    AddressFindResponseDTO entityToDto(Address address);

}
