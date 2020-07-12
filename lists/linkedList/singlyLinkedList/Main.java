package lists.linkedList.singlyLinkedList;

public class Main {
    public static void main(String[] args) {
        Employee nishant = new Employee("Nishant", "Singh", 1);
        Employee prashant = new Employee("Prashant", "Singh", 2);
        Employee vinay = new Employee("Vinay", "Singh", 3);
        Employee anand = new Employee("Anand", "Singh", 4);

        EmployeeSinglyLinkedList list= new EmployeeSinglyLinkedList();

        list.addToFront(nishant);
        list.addToFront(prashant);
        list.addToFront(vinay);
        list.addToFront(anand);

        //output
        list.printList();

        //size of LL
        System.out.println("\nthe size of the list is "+list.getSize());

        //to check if LL is empty or not
        System.out.println("list is empty ? "+list.isEmpty());

        //to remove a node from front of LL
        list.removeFromFront();
    }
}
