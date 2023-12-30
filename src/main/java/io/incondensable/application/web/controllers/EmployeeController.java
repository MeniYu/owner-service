package io.incondensable.application.web.controllers;

import io.incondensable.application.business.domain.Employee;
import io.incondensable.application.business.services.EmployeeService;
import io.incondensable.application.mappers.EmployeeMapper;
import io.incondensable.application.web.dto.employee.EmployeeFindResponseDTO;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author abbas
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;
    private final EmployeeMapper employeeMapper;

    public EmployeeController(EmployeeService employeeService, EmployeeMapper employeeMapper) {
        this.employeeService = employeeService;
        this.employeeMapper = employeeMapper;
    }

    @GetMapping("/v1/all/{ownerId}")
    public ResponseEntity<List<EmployeeFindResponseDTO>> getEmployeesOfOwner(@PathVariable Long ownerId) {
        List<Employee> result = employeeService.getAllEmployeesByOwnerId(ownerId);
        return ResponseEntity.ok(map(result));
    }

    @Profile("dev")
    @GetMapping("/v1/all")
    public ResponseEntity<List<EmployeeFindResponseDTO>> getAll() {
        List<Employee> result = employeeService.getAll();
        return ResponseEntity.ok(map(result));
    }

    private List<EmployeeFindResponseDTO> map(List<Employee> result) {
        return result.stream().map(
                employeeMapper::entityToDto
        ).toList();
    }

}
