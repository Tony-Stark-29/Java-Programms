package Stack;

public class LinkedList_Stack<Type>
{

    class Node
    {
        Type data;
        Node next;

        Node(Type data)
        {
            this.data=data;
            this.next=null;
        }
    }

    Node top;
    LinkedList_Stack()
    {
        top=null;
    }
    public void push(Type data)
    {

        Node newNode=new Node(data);
        if(top==null)
        {
            top=newNode;
        }
        else
        {
            newNode.next=top;
            top=newNode;
        }


    }

    public Type pop()
    {

        if (top==null)
        {
            throw new IndexOutOfBoundsException("(Stack Underflow)Stack is empty");
        }
        Node temp=top;
        top=top.next;
        return temp.data;
    }

    public  void display()
    {
        Node temp=top;
        while (temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }



}
