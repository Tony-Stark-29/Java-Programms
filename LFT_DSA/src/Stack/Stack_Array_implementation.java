package Stack;

public class Stack_Array_implementation
{
    public static void main(String[] args)
    {

        arrayStack s1=new arrayStack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        System.out.println("top : "+s1.gettop());

        s1.display();

        System.out.println(s1.pop());
        System.out.println("top : "+s1.gettop());
        s1.display();

        System.out.println(s1.peek());
        System.out.println("top : "+s1.gettop());
        s1.display();

    }
}
