package io.incondensable.application.mappers;

import io.incondensable.application.business.domain.Owner;
import io.incondensable.application.web.dto.owner.OwnerCreateRequestDTO;
import io.incondensable.application.web.dto.owner.OwnerFullFindResponseDTO;
import io.incondensable.application.web.dto.owner.OwnerInfoFindResponseDTO;
import org.mapstruct.Mapper;

/**
 * @author abbas
 */
@Mapper(componentModel = "spring", uses = AddressMapper.class)
public interface OwnerMapper {

    Owner dtoToEntity(OwnerCreateRequestDTO dto);

    OwnerInfoFindResponseDTO entityToInfoDto(Owner owner);

    OwnerFullFindResponseDTO entityToFullDto(Owner owner);

}
