package io.incondensable.application.mappers.store;

import io.incondensable.application.business.domain.store.StoreMultiMenu;
import io.incondensable.application.web.dto.store.multi_menu.command.StoreMultiMenuCreateRequestDTO;
import io.incondensable.application.web.dto.store.multi_menu.command.StoreMultiMenuUpdateRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

/**
 * @author abbas
 */
@Mapper(componentModel = "spring")
public interface CmdStoreMultiMenuMapper {

    StoreMultiMenu dtoToEntity(StoreMultiMenuCreateRequestDTO dto);

    void dtoToEntity(@MappingTarget StoreMultiMenu entity, StoreMultiMenuUpdateRequestDTO dto);

}
