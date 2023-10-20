package LinkedList;

public class ListImplementation
{
    public static void main(String[] args) {
        LinkedList list1=new LinkedList();

       list1.insertToBegining(3);
        list1.insertToBegining(1);
        list1.insertToEnd(4);
        list1.insertToEnd(6);

        list1.insertAtPosition(1,2);
        list1.insertAtPosition(4,5);

        list1.deleteAtPosition(3,4);

        list1.display();
        System.out.println("Length : "+list1.getlength());

        list1.reverse();
        list1.display();

    }
}
