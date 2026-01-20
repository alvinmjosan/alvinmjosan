import java.util.Stack;
public class StackExample{
    public static void main(String[]args){
        Stack <Integer> a=new Stack <Integer> ();
        a.push(1);
        a.push(5);
        a.push(8);
        System.out.println(a.peek());
    }
}