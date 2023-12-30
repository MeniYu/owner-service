package io.incondensable.application.mappers;

import io.incondensable.application.business.domain.vt.Address;
import io.incondensable.application.web.dto.address.AddressCreateRequestDTO;
import io.incondensable.application.web.dto.address.AddressFindResponseDTO;
import org.mapstruct.Mapper;

/**
 * @author abbas
 */
@Mapper(componentModel = "spring")
public interface AddressMapper {

    Address dtoToEntity(AddressCreateRequestDTO dto);

    AddressFindResponseDTO entityToDto(Address address);

}
