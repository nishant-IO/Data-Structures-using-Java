package stack;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);

        //adding 10 elements so as to trigger our first overflow
        for (int i = 1; i <= 5; i++) {
            stack.push(new Employee(Character.toString((char) (64 + i)), i));
        }

        System.out.println("\nStack before pop-");
        stack.printStack();

        //this will add a new element and cause an overflow which is dealt with in the push()
        stack.push(new Employee("random", 11));

        System.out.println("\nPopped element is " + stack.pop());

        stack.push(new Employee("Nishant",11));
        stack.printStack();


        stack.search(new Employee("ishant",111));
        stack.searchAccFname("ishant");

        System.out.print("\nPeek--> ");
        stack.peek();
    }
}
