package lists.linkedList.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        Employee nishant = new Employee("Nishant", "Singh", 1);
        Employee prashant = new Employee("Prashant", "Singh", 2);
        Employee vinay = new Employee("Vinay", "Singh", 3);
        Employee anand = new Employee("Anand", "Singh", 4);

        EmployeeDoublyLinkedList employeeDoublyLinkedList= new EmployeeDoublyLinkedList();

        //add elements to the front of LL
        System.out.println("add to front");
        employeeDoublyLinkedList.addToFront(nishant);
        employeeDoublyLinkedList.addToFront(prashant);
        employeeDoublyLinkedList.addToFront(vinay);
        employeeDoublyLinkedList.addToFront(anand);

        employeeDoublyLinkedList.printList();
        employeeDoublyLinkedList.getSize();

        //add elements to the back of LL
        System.out.println("\nadd to back");
        employeeDoublyLinkedList.addToEnd(nishant);
        employeeDoublyLinkedList.addToEnd(prashant);
        employeeDoublyLinkedList.addToEnd(vinay);
        employeeDoublyLinkedList.addToEnd(anand);

        employeeDoublyLinkedList.printList();
        employeeDoublyLinkedList.getSize();

        // remove elements from the front of the LL
        System.out.println("\nremoving elements from front");
        employeeDoublyLinkedList.removeFromFront();
        employeeDoublyLinkedList.removeFromFront();
        employeeDoublyLinkedList.removeFromFront();
        employeeDoublyLinkedList.removeFromFront();
        employeeDoublyLinkedList.removeFromFront();
        employeeDoublyLinkedList.printList();
        employeeDoublyLinkedList.getSize();

        // remove elements from the Back of the LL
        System.out.println("\nremoving elements from back");
        employeeDoublyLinkedList.removeFromEnd();
        employeeDoublyLinkedList.removeFromEnd();
        employeeDoublyLinkedList.removeFromEnd();
        employeeDoublyLinkedList.removeFromEnd();
        employeeDoublyLinkedList.printList();
        employeeDoublyLinkedList.getSize();

    }
}
