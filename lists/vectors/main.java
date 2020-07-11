package lists.vectors;

import java.util.List;
import java.util.Vector;

public class main {
    public  static void main(String [] args){
        List<Employee> employeeList= new Vector<>();

        employeeList.add(new Employee("Nishant", "Singh", 204));
        employeeList.add(new Employee("Prashant", "Singh", 288));

        employeeList.forEach(employee -> System.out.println(employee));
    }
}
