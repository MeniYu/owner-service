package io.incondensable.application.mappers;

import io.incondensable.application.business.domain.store.StoreMultiMenu;
import io.incondensable.application.web.dto.store.multi_menu.StoreMultiMenuCreateRequestDTO;
import io.incondensable.application.web.dto.store.multi_menu.StoreMultiMenuUpdateRequestDTO;
import io.incondensable.application.web.dto.store.single_menu.StoreMultiMenuInfoFindResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

/**
 * @author abbas
 */
@Mapper(componentModel = "spring")
public interface StoreMultiMenuMapper {

    StoreMultiMenuInfoFindResponseDTO entityToInfoDto(StoreMultiMenu store);

    StoreMultiMenu dtoToEntity(StoreMultiMenuCreateRequestDTO dto);

    void dtoToEntity(@MappingTarget StoreMultiMenu entity, StoreMultiMenuUpdateRequestDTO dto);

}
