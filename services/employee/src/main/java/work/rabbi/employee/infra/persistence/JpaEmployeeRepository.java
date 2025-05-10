package work.rabbi.employee.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.rabbi.employee.domain.model.Employee;
import work.rabbi.employee.domain.repository.EmployeeRepository;

import java.util.UUID;

@Repository
public interface JpaEmployeeRepository extends JpaRepository<Employee, UUID>, EmployeeRepository {
    // Additional database-specific queries can be added here
}
