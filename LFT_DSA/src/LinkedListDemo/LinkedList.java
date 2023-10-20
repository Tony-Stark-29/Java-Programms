package LinkedListDemo;


import javax.management.AttributeNotFoundException;
import java.util.Iterator;

public class LinkedList  
{
    node head;




    class node
    {
        int data;
        node next;

        node(int val)
        {
            data=val;
            next=null;
        }
    }
    LinkedList()
    {
        head=null;
    }
    public void insertAtBegining(int val)
    {
        node newNode=new node(val);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
           newNode.next=head;
            head=newNode;
        }

    }

    public void displayList()
    {
        node elm=head;
        while(elm!=null)
        {
            System.out.print(elm.data+",");
            elm=elm.next;
        }
    }

    public void insertAtPosition(int val,int pos)
    {
        if(pos==0)
        {
            System.out.println("List is empty - inserting at begining");
            insertAtBegining(val);
            return;
        }
        node newNode=new node(val);
        node temp=head;
        for(int i=1;i<pos;i++)
        {
            temp=temp.next;
            if(temp==null)
                throw new IndexOutOfBoundsException("Invalid Position");
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public void deleteAtPosition(int pos)
    {
         node next=head;
         node prev=null;

         if(head==null)
         {
             throw new IndexOutOfBoundsException("Deletion Attempt on Eepty List");

         }

         if(pos==0)
         {
             head=head.next;
             return;
         }

         for(int i=1;i<=pos;i++)
         {
             prev=next;
             next=next.next;
         }

         prev.next=next.next;


    }

    public int get(int pos)
    {
        node temp=head;
        if(head==null)
        {
            throw new IndexOutOfBoundsException("Empty List");
        }
        for (int i=0;i<=pos;i++)
        {
            temp=temp.next;
        }

        return temp.data;
    }

    public void update(int pos, int val)
    {
        node temp=head;
        if(pos==0)
        {
            head.data=val;
            return;
        }

        for(int i=0;i<=pos;i++)
        {
            temp=temp.next;
        }
        temp.data=val;
    }

    public boolean contains(int val)
    {
        node temp=head;
        while(temp.next!=null)
        {
            if(temp.data==val)
            {
                return true;
            }
        }
        return false;
    }

    public int search(int val)
    {
        node temp=head;
        int index=0;

        while(temp.data!=val)
        {
            temp=temp.next;
            index++;
        }
        return index;
    }



}
