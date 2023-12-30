package io.incondensable.application.web.controllers;

import io.incondensable.application.business.domain.Employee;
import io.incondensable.application.business.domain.Owner;
import io.incondensable.application.business.services.OwnerService;
import io.incondensable.application.mappers.EmployeeMapper;
import io.incondensable.application.mappers.OwnerMapper;
import io.incondensable.application.web.dto.employee.EmployeeCreateRequestDto;
import io.incondensable.application.web.dto.employee.EmployeeFindResponseDTO;
import io.incondensable.application.web.dto.owner.OwnerCreateRequestDTO;
import io.incondensable.application.web.dto.owner.OwnerFullFindResponseDTO;
import io.incondensable.application.web.dto.owner.OwnerInfoFindResponseDTO;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author abbas
 */
@RestController("/owner")
public class OwnerController {

    private final EmployeeMapper employeeMapper;
    private final OwnerService ownerService;
    private final OwnerMapper mapper;

    public OwnerController(OwnerService ownerService, OwnerMapper command, EmployeeMapper employeeMapper) {
        this.ownerService = ownerService;
        this.mapper = command;
        this.employeeMapper = employeeMapper;
    }

    @GetMapping("/v1/info/{ownerId}")
    public ResponseEntity<OwnerInfoFindResponseDTO> getOwnerInfoById(@PathVariable Long ownerId) {
        return ResponseEntity.ok(
                mapper.entityToInfoDto(ownerService.getInfoById(ownerId))
        );
    }

    @Profile("dev")
    @GetMapping("/v1/full/{ownerId}")
    public ResponseEntity<OwnerFullFindResponseDTO> getOwnerFullById(@PathVariable Long ownerId) {
        return ResponseEntity.ok(
                mapper.entityToFullDto(ownerService.getFullById(ownerId))
        );
    }

    @Profile("dev")
    @GetMapping("/v1/all")
    public ResponseEntity<List<OwnerInfoFindResponseDTO>> getAllOwners() {
        return ResponseEntity.ok(
                ownerService.getAllInfo().stream().map(
                        mapper::entityToInfoDto
                ).toList()
        );
    }

    @PostMapping("/v1/create")
    public ResponseEntity<OwnerInfoFindResponseDTO> createOwner(@RequestBody OwnerCreateRequestDTO dto) {
        Owner persistedOwner = ownerService.create(
                mapper.dtoToEntity(dto)
        );
        return ResponseEntity.ok(mapper.entityToInfoDto(persistedOwner));
    }

    @PostMapping("/v1/{ownerId}/create-employee")
    public ResponseEntity<EmployeeFindResponseDTO> createAndAppendEmployeeToOwner(@PathVariable Long ownerId, @RequestBody EmployeeCreateRequestDto req) {
        Employee persistedEmployee = ownerService.addEmployee(
                ownerId,
                employeeMapper.dtoToEntity(req)
        );
        return ResponseEntity.ok(employeeMapper.entityToDto(persistedEmployee));
    }

}
