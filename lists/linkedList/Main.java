package lists.linkedList;

import lists.linkedList.doublyLinkedList.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Employee nishant = new lists.linkedList.doublyLinkedList.Employee("Nishant", "Singh", 1);
        Employee prashant = new lists.linkedList.doublyLinkedList.Employee("Prashant", "Singh", 2);
        Employee vinay = new lists.linkedList.doublyLinkedList.Employee("Vinay", "Singh", 3);
        Employee anand = new Employee("Anand", "Singh", 4);
        Employee random = new Employee("A", "", 1);
        Employee random1 = new Employee("B", "", 2);
        Employee random2 = new Employee("C", "", 3);

        LinkedList<Employee> list= new LinkedList<>();
        list.addFirst(nishant);
        list.addFirst(prashant);
        list.addFirst(vinay);
        list.addFirst(anand);

        // list.addFirst adds to front of the LL and list.add / list.addLast adds at the end of the LL
        list.add(random);
        list.add(random1);
        list.add(random2);

        //removing elements

        //Retrieves and removes the last element of this deque
        list.removeFirst();
        //Retrieves and removes the First element of this deque
        list.removeLast();

        //for output as there in no predefined print function
        System.out.print("Head<->");
        for (Employee employee : list) {
            System.out.print(employee+"<->");
        }
        System.out.print("null");


    }
}