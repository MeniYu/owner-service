package io.incondensable.application.dao.repositories;

import io.incondensable.application.business.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author abbas
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("select e from Employee e where e.owner.id = :ownerId")
    List<Employee> findAllByOwnerId(@Param("ownerId") Long ownerId);

}
