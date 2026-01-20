import java.util.Queue;
import java.util.PriorityQueue;
public class QueueExample {
    public static void main(String[]args){
        Queue <Integer> b= new PriorityQueue<Integer>();
        b.add(3);
        b.add(5);
        b.add(9);
        System.out.println(b);
    }
}
