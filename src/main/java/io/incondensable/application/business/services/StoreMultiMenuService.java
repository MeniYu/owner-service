package io.incondensable.application.business.services;

import io.incondensable.application.business.domain.Owner;
import io.incondensable.application.business.domain.store.StoreMultiMenu;
import io.incondensable.application.business.exception.store.OwnerNotPaidForMultiMenuException;
import io.incondensable.application.business.exception.store.OwnerViolatingSingleStoreException;
import io.incondensable.application.business.exception.store.StoreNotFoundException;
import io.incondensable.application.dao.repositories.StoreMultiMenuRepository;
import io.incondensable.application.mappers.StoreMultiMenuMapper;
import io.incondensable.application.web.dto.store.multi_menu.StoreMultiMenuCreateRequestDTO;
import io.incondensable.application.web.dto.store.multi_menu.StoreMultiMenuUpdateRequestDTO;
import io.incondensable.application.web.dto.store.single_menu.StoreMultiMenuInfoFindResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * IRAN POST APIs FOR VALIDATING ZIP-CODES: https://gnaf.post.ir/reseller/ApiService/Index/0
 *
 * @author abbas
 */
@Service
public class StoreMultiMenuService {

    private final OwnerService ownerService;
    private final StoreMultiMenuRepository repo;
    private final StoreMultiMenuMapper mapper;

    public StoreMultiMenuService(OwnerService ownerService, StoreMultiMenuRepository repo, StoreMultiMenuMapper mapper) {
        this.ownerService = ownerService;
        this.repo = repo;
        this.mapper = mapper;
    }

    public List<StoreMultiMenuInfoFindResponseDTO> getAllByOwnerId(Long ownerId) {
        ownerService.getById(ownerId);
        return repo.findAllByOwnerId(ownerId).stream().map(
                mapper::entityToInfoDto
        ).collect(Collectors.toList());
    }

    public StoreMultiMenuInfoFindResponseDTO getById(Long storeId) {
        return mapper.entityToInfoDto(getStoreById(storeId));
    }

    public StoreMultiMenuInfoFindResponseDTO createStore(StoreMultiMenuCreateRequestDTO dto) {
        Owner owner = ownerService.getById(dto.getOwnerId());
        if (owner.canHaveMultipleStores())
            throw new OwnerViolatingSingleStoreException(dto.getOwnerId());

        if (owner.canHaveMultiMenu())
            throw new OwnerNotPaidForMultiMenuException(dto.getOwnerId());

        StoreMultiMenu menu = mapper.dtoToEntity(dto);
        return mapper.entityToInfoDto(repo.save(menu));
    }

    public StoreMultiMenuInfoFindResponseDTO updateStore(Long storeId, StoreMultiMenuUpdateRequestDTO dto) {
        StoreMultiMenu currentStore = getStoreById(storeId);

        mapper.dtoToEntity(currentStore, dto);
        return mapper.entityToInfoDto(repo.save(currentStore));
    }

    StoreMultiMenu getStoreById(Long storeId) {
        return repo.findById(storeId).orElseThrow(() -> {
            throw new StoreNotFoundException(storeId);
        });
    }

}
