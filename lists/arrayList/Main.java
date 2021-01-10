package lists.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();//defaultSize is 10

        //to add elements in the list
        employeeList.add(new Employee("Nishant", "Singh", 204));
        employeeList.add(new Employee("Prashant", "Singh", 288));

        //to add element at an index
        employeeList.add(0, new Employee("abc", "xyz", 121));

        //to retrieve an element at a position in the list
        System.out.println(employeeList.get(0));
        System.out.println(employeeList.get(1));

        /*
        to retrieve all elements pf the list
        Note this is an lambda expression and a normal for loop could also work here
        */
        employeeList.forEach(employee -> System.out.println(employee));

        /*
        using  a normal for loop too retrieve the elements
        Note Object is the superclass to everything in java
        */
        Object[] empArr = employeeList.toArray(new Object[0]);
        for (Object emp : empArr) {
            System.out.println(emp);
        }

        //to modify an element at a position
        employeeList.set(0, new Employee("Undercover", "Agent", 420));
        employeeList.forEach(employee -> System.out.println(employee));

        //to check the size of the list
        System.out.println("no of employees are " + employeeList.size());

        /*
        to check is a particular element is present in the list
        if Equals method is present in the class then only the output is displayed else output is usually false
        */
        System.out.println(employeeList.contains(new Employee("Prashant","Singh",288)));

        //to remove a particular element from the list or you can directly do it by the index
        if(employeeList.contains(new Employee("Prashant","Singh",288))){
            employeeList.remove(new Employee("Prashant", "Singh", 288));

            employeeList.forEach(System.out::println);
        }
    }
}
