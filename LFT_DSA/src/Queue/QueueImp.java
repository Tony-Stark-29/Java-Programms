package Queue;

public class QueueImp
{
    public static void main(String[] args) {
        QueueLinkedList<Integer> q1=new QueueLinkedList<>();

        q1.queue(1);
        q1.queue(2);
        q1.queue(3);

        q1.print();

        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());

        q1.print();

     }
}
