import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestEmployee {

    public static void main(String[] args) {
        Employee e1 = new Employee(123, "Akhil Sai", 200000.0, "Accounts");
        Employee e2 = new Employee(456, "Abhay Gupta", 150000.0, "Software Development");
        Employee e3 = new Employee(512, "Shrinivas Nair", 50000.0, "Administration");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        Map<Integer, Employee> employeeMap = employeeList.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
        employeeMap.forEach((k,v) -> System.out.println(k+":"+v.toString()));
    }
}
