package io.incondensable.application.mappers;

import io.incondensable.application.business.domain.Employee;
import io.incondensable.application.web.dto.employee.EmployeeCreateRequestDto;
import io.incondensable.application.web.dto.employee.EmployeeFindResponseDTO;
import org.mapstruct.Mapper;

/**
 * @author abbas
 */
@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeFindResponseDTO entityToDto(Employee employee);

    Employee dtoToEntity(EmployeeCreateRequestDto req);

}
