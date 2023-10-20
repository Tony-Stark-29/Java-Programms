package Queue;

public class QueueLinkedList <Type>
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

    Node front,rear;
    public  void queue(Type data)
    {
        Node newNode=new Node(data);
        if (front==null)
        {
            front=rear=newNode;
        }
        else
        {
            rear.next=newNode;
            rear=newNode;
        }

    }

    public Type dequeue()
    {
        if(rear==null)
        {
            throw new IndexOutOfBoundsException("Queue Underflow");
        }
        else
        {
            Node temp=front;
            front=front.next;
            return temp.data;
        }
    }

    public void print()
    {
        Node temp=front;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
