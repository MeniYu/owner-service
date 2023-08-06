package io.incondensable.application.mappers.owner;

import io.incondensable.application.business.domain.Owner;
import io.incondensable.application.web.dto.owner.command.OwnerCreateRequestDTO;
import org.mapstruct.Mapper;

/**
 * @author abbas
 */
@Mapper(componentModel = "spring")
public interface CmdOwnerMapper {

    Owner dtoToEntity(OwnerCreateRequestDTO dto);

}
