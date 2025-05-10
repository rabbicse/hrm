package work.rabbi.employee.application.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import work.rabbi.employee.domain.model.Employee;
import work.rabbi.employee.domain.repository.EmployeeRepository;

@Service
@AllArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public Employee createEmployee(String firstName, String lastName) {
        Employee employee = Employee.builder()
                .firstName(firstName)
                .lastName(lastName)
                .build();
        return employeeRepository.save(employee);
    }
}
