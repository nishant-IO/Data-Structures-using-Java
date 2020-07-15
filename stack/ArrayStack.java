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

            System.out.println("\ntried pushing "+employee+" but overflow, increasing size to "+2*stack.length);
            //in case we want to inc the size of stack when overflow occurs
            Employee[] newStack = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;

        }
        System.out.println("pushed "+employee);
        stack[top++] = employee;
    }

    public Employee pop() {
        if (isEmpty())
            System.out.println("No elements left to pop");

        System.out.println("\nPopped element is "+stack[top-1]);
        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public void peek() {
        if (isEmpty())
            throw new EmptyStackException();
        System.out.println(stack[top - 1]);
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println("Stack["+i+"] " + stack[i]);
        }
    }

    public boolean isEmpty() {
        return top == 0;
    }

}
