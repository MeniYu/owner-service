package io.incondensable.application.mappers.owner;

import io.incondensable.application.business.domain.Owner;
import io.incondensable.application.web.dto.owner.query.OwnerFullFindResponseDTO;
import io.incondensable.application.web.dto.owner.query.OwnerInfoFindResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author abbas
 */
@Mapper(componentModel = "spring")
public interface QueryOwnerMapper {

    OwnerInfoFindResponseDTO entityToInfoDto(Owner owner);

    @Mapping(target = "creatorId", source = "owner.entityDetails.creatorId")
    OwnerFullFindResponseDTO entityToFullDto(Owner owner);

}
