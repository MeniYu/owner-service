package io.incondensable.application.business.services;

import io.incondensable.application.business.domain.Employee;
import io.incondensable.application.dao.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author abbas
 */
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public List<Employee> getAllEmployeesByOwnerId(Long ownerId) {
        return employeeRepository.findAllByOwnerId(ownerId);
    }

    public Employee createEmployee(Employee employee) {
        if (employee.getOwner() == null)
            return null;
        return employeeRepository.save(employee);
    }

}
