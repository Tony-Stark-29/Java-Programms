package LinkedList;



public class LinkedList
{

    Node head;

    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }


    public int getlength()
    {
        Node temp=head;
        int count=0;
        while (temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }

    public void deleteAtPosition(int pos, int val)
    {
        if(pos==0)
        {
            head=head.next;
        }
        else
        {
            Node next,prev;
            prev=head;
            for(int i=0;i<pos;i++)
            {
                prev=prev.next;
            }

        }
    }

    public void reverse()
    {

        

    }


    public void insertToBegining(int val)
    {
        Node newNode=new Node(val);
        if (head==null)
        {
             head=newNode;
             return;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }

    }
    public void insertToEnd(int val)
    {
        Node newNode= new Node(val);
        if (head==null)
        {
            head=newNode;
        }
        else
        {
            Node temp=head;
            for (int i=0;i<getlength()-1;i++)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public void insertAtPosition(int pos, int val)
    {
        Node newNode= new Node(val);
        if (head==null)
        {
            head=newNode;
        }
        else
        {
            Node prev=head,next;
            for (int i = 0; i < pos - 1; i++)
            {
                prev=prev.next;
            }
            next=prev.next;
            prev.next=newNode;
            newNode.next=next;
        }
    }

    public void display()
    {

        Node temp=head;

        while(temp!=null)
        {

            System.out.print(temp.data+" " );
            temp=temp.next;

        }
        System.out.println();

    }


}
