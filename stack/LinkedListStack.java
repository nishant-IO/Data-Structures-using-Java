package stack;

import java.util.LinkedList;

public class LinkedListStack {

    private LinkedList<Employee> stack;

    public LinkedListStack() {
        stack = new LinkedList<Employee>();
    }

    public void push(Employee employee) {
        stack.push(employee);
        System.out.println("Pushed " + employee);
    }

    public Employee pop() {

        System.out.print("\nPopped ");
        return stack.pop();
    }

    public Employee peek() {
        System.out.print("\nTop --> ");
        return stack.peek();
    }

    public void printStack() {
        for (Employee employee : stack) {
            System.out.println("Employee " + employee);
        }
    }

    public Boolean isEmpty() {
        return stack.isEmpty();
    }
}
