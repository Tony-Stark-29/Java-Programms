package Stack;

public class LinkedList_Stack_Implementation
{
    public static void main(String[] args) {

        LinkedList_Stack<Integer> stack1=new  LinkedList_Stack<Integer>();

        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);

        System.out.println(stack1.pop());

        stack1.display();

    }
}
