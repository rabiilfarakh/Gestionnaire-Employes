package dao;

import model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeDAO {

    void addEmployee(Employee employee);

    Optional<Employee> getEmployee(Integer idEmployee);

    List<Employee> getAllEmployes();

    void deleteEmployee(Integer idEmployee);

    void updateEmployee(Employee employee);

    List<Employee> searchEmployees(String value);

    List<Employee> filterEmployees(String department);
}
