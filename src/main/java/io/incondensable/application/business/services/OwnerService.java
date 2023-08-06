package io.incondensable.application.business.services;

import io.incondensable.application.business.domain.Owner;
import io.incondensable.application.business.exception.general.EmailDuplicateException;
import io.incondensable.application.business.exception.general.PhoneNumberDuplicateException;
import io.incondensable.application.business.exception.owner.OwnerNotFoundWithIdException;
import io.incondensable.application.dao.repositories.OwnerRepository;
import io.incondensable.application.mappers.owner.CmdOwnerMapper;
import io.incondensable.application.mappers.owner.QueryOwnerMapper;
import io.incondensable.application.web.dto.owner.command.OwnerCreateRequestDTO;
import io.incondensable.application.web.dto.owner.query.OwnerFullFindResponseDTO;
import io.incondensable.application.web.dto.owner.query.OwnerInfoFindResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * IRAN POST APIs FOR VALIDATING ZIP-CODES: https://gnaf.post.ir/reseller/ApiService/Index/0
 * @author abbas
 */
@Service
public class OwnerService {

    private final OwnerRepository ownerRepository;
    private final CmdOwnerMapper ownerCommand;
    private final QueryOwnerMapper ownerQuery;

    public OwnerService(OwnerRepository ownerRepository, CmdOwnerMapper ownerCommand, QueryOwnerMapper ownerQuery) {
        this.ownerRepository = ownerRepository;
        this.ownerCommand = ownerCommand;
        this.ownerQuery = ownerQuery;
    }

    public List<OwnerInfoFindResponseDTO> getAllInfo() {
        return ownerRepository.findAll().stream().map(
                ownerQuery::entityToInfoDto
        ).collect(Collectors.toList());
    }

    public OwnerInfoFindResponseDTO getInfoById(Long ownerId) {
        return ownerQuery.entityToInfoDto(getById(ownerId));
    }

    public OwnerFullFindResponseDTO getFullById(Long ownerId) {
        return ownerQuery.entityToFullDto(getById(ownerId));
    }

    public OwnerInfoFindResponseDTO create(OwnerCreateRequestDTO req) {
        if (ownerRepository.existsByPhoneNumber(req.getPhoneNumber()))
            throw new PhoneNumberDuplicateException(req.getPhoneNumber());
        if (ownerRepository.existsByEmail(req.getEmail()))
            throw new EmailDuplicateException(req.getEmail());

        Owner owner = ownerCommand.dtoToEntity(req);

        return ownerQuery.entityToInfoDto(ownerRepository.save(owner));
    }

    Owner getById(Long ownerId) {
        return ownerRepository.findById(ownerId)
                .orElseThrow(() -> {
                    throw new OwnerNotFoundWithIdException(ownerId);
                });
    }

}
