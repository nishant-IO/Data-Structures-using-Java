package stack;

public class MainForLL {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        for (int i = 0; i <5; i++) {
            stack.push(new Employee(Character.toString((char) (65+i)), i));
        }

        stack.printStack();

        System.out.println("\ncalled pop() ");
        System.out.println(stack.pop());

        System.out.println("called peek()");
        System.out.println(stack.peek());


        stack.printStack();
    }
}
