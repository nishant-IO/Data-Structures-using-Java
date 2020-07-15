package stack;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);

        //adding 10 elements so as to trigger our first overflow
        for (int i = 1; i <= 10; i++) {
            String fname = "A";
            stack.push(new Employee(fname, i));
        }

        System.out.println("\nbefore pop ");
        System.out.println("\nStack is ");
        stack.printStack();

        stack.push(new Employee("nishant", 11));
        System.out.println("\nafter pop ");
        stack.pop();
        stack.push(new Employee("random", 11));
        System.out.println("\nStack is ");
        stack.printStack();

        System.out.print("\nPeek--> ");
        stack.peek();
    }
}
