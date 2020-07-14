package lists.linkedList.doublyLinkedList;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int sizeOfLinkList = 0;

    //for adding the new node at the front of the LL
    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        if (head == null) {
            tail = node;
        } else {
            head.setPrev(node);
        }
        head = node;
        sizeOfLinkList++;
    }

    //for adding elements to the back of the LL
    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setPrev(tail);
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        sizeOfLinkList++;
    }

    //for removing nodes from the front
    public EmployeeNode removeFromFront() {
        if (isEmpty())
            return null;

        EmployeeNode removeNode = head;

        //if there is just one node
        if (sizeOfLinkList == 1) {
            tail = null;
            head = null;
        } else {
            head.getNext().setPrev(null);
            head = head.getNext();
        }
        sizeOfLinkList--;
        System.out.println("the node getting removed is " + removeNode.toString());
        return removeNode;
    }

    //remove a node from end
    public EmployeeNode removeFromEnd() {
        if (isEmpty())
            return null;

        EmployeeNode removeNode = tail;

        if (sizeOfLinkList == 1) {
            head = null;
            tail = null;
        } else {
            tail.getPrev().setNext(null);
            tail = tail.getPrev();
        }
        sizeOfLinkList--;
        System.out.println("the node getting removed is " + removeNode.toString());
        return removeNode;

    }

    //To print the LL
    public void printList() {
        EmployeeNode current = head;
        System.out.print("Head->");
        while (current != null) {
            System.out.print(current + "<->");
            current = current.getNext();
        }
        System.out.print("null");
    }

    //to return size of LL
    public void getSize() {
        System.out.println("\nlist size = " + sizeOfLinkList);
    }

    //to check if LL is empty or not
    public boolean isEmpty() {
        return head == null;
    }
}
