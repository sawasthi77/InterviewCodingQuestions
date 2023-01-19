package interview_prep;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeOperation {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1L,10,1L,"active"));
        employeeList.add(new Employee(10L,102,2L,"inactive"));
        employeeList.add(new Employee(12L,100,1L,"inactive"));
        employeeList.add(new Employee(14L,104,3L,"active"));

//        System.out.println(maxSalaryOfEmployeeList(employeeList));
//        System.out.println(minSalaryOfEmployeeList(employeeList));
        maxSalaryBasedOnDept(employeeList);
    }

    private static int maxSalaryOfEmployeeList(List<Employee> employeeList){
        return employeeList.stream().max(Comparator.comparing(Employee::getSalary)).
                map(employee -> employee.getSalary()).get();
    }

    private static int minSalaryOfEmployeeList(List<Employee> employeeList){
        return employeeList.stream().min(Comparator.comparing(Employee::getSalary))
                .map(employee -> employee.getSalary()).get();
    }

    private static void maxSalaryBasedOnDept(List<Employee> employeeList){
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(c -> c.getDeptid(),
                Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingInt(emp -> emp.getSalary())),Optional::get))));
    }
}
