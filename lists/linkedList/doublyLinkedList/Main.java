package lists.linkedList.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        Employee nishant = new Employee("Nishant", "Singh", 1);
        Employee prashant = new Employee("Prashant", "Singh", 2);
        Employee vinay = new Employee("Vinay", "Singh", 3);
        Employee anand = new Employee("Anand", "Singh", 4);

        EmployeeDoublyLinkedList employeeDoublyLinkedList= new EmployeeDoublyLinkedList();
        employeeDoublyLinkedList.addToFront(nishant);
        employeeDoublyLinkedList.addToFront(prashant);
        employeeDoublyLinkedList.addToFront(vinay);
        employeeDoublyLinkedList.addToFront(anand);

        employeeDoublyLinkedList.printList();
    }
}
