package io.incondensable.application.web.controllers;

import io.incondensable.application.business.services.OwnerService;
import io.incondensable.application.web.dto.owner.query.OwnerFullFindResponseDTO;
import io.incondensable.application.web.dto.owner.query.OwnerInfoFindResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author abbas
 */
@RestController("/v1/owner")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("/{ownerId}")
    public ResponseEntity<OwnerInfoFindResponseDTO> getOwnerInfoById(@PathVariable Long ownerId) {
        return ResponseEntity.ok(ownerService.getInfoById(ownerId));
    }

    @GetMapping("/full/{ownerId}")
    public ResponseEntity<OwnerFullFindResponseDTO> getOwnerFullById(@PathVariable Long ownerId) {
        return ResponseEntity.ok(ownerService.getFullById(ownerId));
    }

}
