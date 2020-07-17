package stack;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    //top points to next free position
    private int top;

    //constructor to initialize the stack with its capacity
    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        //if stack is full we will inc the stack size
        if (top == stack.length) {
            System.out.println("\ntried pushing " + employee + " but overflow, increasing size to " + 2 * stack.length);
            //in case we want to inc the size of stack when overflow occurs
            Employee[] newStack = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        System.out.println("pushed " + employee);
        stack[top++] = employee;
    }

    public Employee pop() {
        if (isEmpty())
            System.out.println("No elements left to pop");

        Employee employee = stack[--top];
        //stack[top] = null;
        return employee;
    }

    public void peek() {
        if (isEmpty())
            throw new EmptyStackException();

        System.out.println(stack[top - 1]);
    }

    public void search(Employee toBeFound) {
        if (top == 0) {
            System.out.println("No element present, please enter element First!!!");
        }
        boolean found = false;
        for (int i = top - 1; i >= 0; i--) {
            if (stack[i].equals(toBeFound)) {
                System.out.println("\n" + toBeFound + "present at index " + i);
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("\nDidn't Find " + toBeFound);

    }

    public void searchAccFname(String nameToSearch) {
        boolean found = false;
        for (Employee employee : stack) {
            if (employee != null && employee.getFirstName() == nameToSearch) {
                System.out.println("Found!!!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Name " + nameToSearch + " Not Found :( ");

        }
    }









    /* for(Employee employee : stack) {
            if(employee.getFirstName() == )
        }*/

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println("Stack[" + i + "] " + stack[i]);
        }
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
