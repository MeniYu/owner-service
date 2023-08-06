package io.incondensable.application.dao.repositories;

import io.incondensable.application.business.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author abbas
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
