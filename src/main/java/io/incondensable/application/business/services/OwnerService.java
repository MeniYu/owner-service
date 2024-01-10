package io.incondensable.application.business.services;

import io.incondensable.application.business.domain.Employee;
import io.incondensable.application.business.domain.Owner;
import io.incondensable.application.business.exception.owner.OwnerDuplicateWithPhoneNumberException;
import io.incondensable.application.business.exception.owner.OwnerDuplicateWithEmailException;
import io.incondensable.application.business.exception.owner.OwnerNotFoundWithIdException;
import io.incondensable.application.dao.repositories.OwnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * IRAN POST APIs FOR VALIDATING ZIP-CODES: https://gnaf.post.ir/reseller/ApiService/Index/0
 *
 * @author abbas
 */
@Service
public class OwnerService {

    private final OwnerRepository ownerRepository;
    private final EmployeeService employeeService;

    public OwnerService(OwnerRepository ownerRepository, EmployeeService employeeService) {
        this.ownerRepository = ownerRepository;
        this.employeeService = employeeService;
    }

    public List<Owner> getAllInfo() {
        return ownerRepository.findAll();
    }

    public Owner getInfoById(Long ownerId) {
        return getById(ownerId);
    }

    public Owner getFullById(Long ownerId) {
        return getById(ownerId);
    }

    public Owner create(Owner req) {
        if (ownerRepository.existsByPhoneNumber(req.getPhoneNumber()))
            throw new OwnerDuplicateWithPhoneNumberException(req.getPhoneNumber());
        if (ownerRepository.existsByEmail(req.getEmail()))
            throw new OwnerDuplicateWithEmailException(req.getEmail());

        return ownerRepository.save(req);
    }

    public Employee addEmployee(Long ownerId, Employee employee) {
        Owner owner = ownerRepository.findById(ownerId).orElseThrow(
                () -> {
                    throw new OwnerNotFoundWithIdException(ownerId);
                }
        );
        employee.setOwner(owner);
        return employeeService.createEmployee(employee);
    }

    public void removeEmployee() {

    }

    Owner getById(Long ownerId) {
        return ownerRepository.findById(ownerId)
                .orElseThrow(() -> {
                    throw new OwnerNotFoundWithIdException(ownerId);
                });
    }

}
