package lists.linkedList.singlyLinkedList;

public class EmployeeSinglyLinkedList {
    private EmployeeNode head;
    private int sizeOfLinkList = 0;

    //for adding the new node at the front of the LL
    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        sizeOfLinkList++;
    }

    //for removing nodes from the front
    public EmployeeNode removeFromFront() {
        if (isEmpty())
            return null;

        EmployeeNode removeNode = head;
        head = head.getNext();
        sizeOfLinkList--;
        System.out.println("the node getting removed is " + removeNode.toString());

        return removeNode;
    }

    //To print the LL
    public void printList() {
        EmployeeNode current = head;
        System.out.print("Head->");
        while (current != null) {
            System.out.print(current + "->");
            current = current.getNext();
        }
        System.out.print("null");
    }

    //to return size of LL
    public int getSize() {
        return sizeOfLinkList;
    }

    //to check if LL is empty or not
    public boolean isEmpty() {
        return head == null;
    }
}
