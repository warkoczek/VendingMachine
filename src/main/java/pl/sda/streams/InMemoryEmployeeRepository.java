package pl.sda.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryEmployeeRepository {

    private List<Employee> employeeList;

    public InMemoryEmployeeRepository() {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, 2000d, "Risk Department", Employee.DayJob.FULL_TIME));
        employeeList.add(new Employee(2, 2600d, "Head Department", Employee.DayJob.FULL_TIME));
        employeeList.add(new Employee(3, 2700d, "Risk Department", Employee.DayJob.FULL_TIME));
        employeeList.add(new Employee(4, 3000d, "Risk Department", Employee.DayJob.FULL_TIME));
        employeeList.add(new Employee(5, 5000d, "Credit Department", Employee.DayJob.PART_TIME));

    }

    public Double getSalarySum(){

        Double salarySum = employeeList.stream()
                .map(e -> e.getSalary())
                .collect(Collectors.summingDouble(Double :: doubleValue));

        return salarySum;
    }
}
