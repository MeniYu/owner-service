package io.incondensable.application.mappers.employee;

import io.incondensable.application.business.domain.Employee;
import io.incondensable.application.web.dto.employee.query.EmployeeFindResponseDTO;
import org.mapstruct.Mapper;

/**
 * @author abbas
 */
@Mapper(componentModel = "spring")
public interface QueryEmployeeMapper {

    EmployeeFindResponseDTO entityToDto(Employee employee);

}
