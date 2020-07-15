package stack;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);

        //adding 10 elements so as to trigger our first overflow
        for (int i = 1; i <= 10; i++) {
            stack.push(new Employee(Character.toString((char) (64+i)), i));
        }

        System.out.println("\nStack before pop-");
        stack.printStack();

        //this will add a new element and cause an overflow which is dealt with in the push()
        stack.push(new Employee("Nishant", 11));

        System.out.println("\nafter pop ");
        stack.pop();

        stack.push(new Employee("random", 11));
        System.out.println("\nStack is ");
        stack.printStack();

        System.out.print("\nPeek--> ");
        stack.peek();
    }
}
