package io.incondensable.application.mappers.store;

import io.incondensable.application.business.domain.store.StoreMultiMenu;
import io.incondensable.application.web.dto.store.single_menu.query.StoreMultiMenuInfoFindResponseDTO;
import org.mapstruct.Mapper;

/**
 * @author abbas
 */
@Mapper(componentModel = "spring")
public interface QueryStoreMultiMenuMapper {

    StoreMultiMenuInfoFindResponseDTO entityToInfoDto(StoreMultiMenu store);

}
