package LinkedListDemo;



public class LinkedList_Imp
{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertAtBegining(4);
        list.insertAtBegining(2);
        list.insertAtBegining(1);
        list.displayList();
        System.out.println();
        list.insertAtPosition(3,2);
        list.displayList();

        list.deleteAtPosition(2);

        System.out.println();
        list.displayList();

        System.out.println(Integer.toString(list.get(2)));
        list.update(1,0);
        System.out.println( list.contains(4));
        System.out.println(list.search(4));

        list.displayList();

    }



}
