package newsort;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reverseQueue {
    public static void main(String[] args){
        Queue<Integer> a = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size");
        int no= sc.nextInt();
        for(int i=0;i<no;i++){
            a.add(sc.nextInt());
        }
        Stack<Integer> s=new Stack<>();
        while(a.size()!=0){
            s.push(a.remove());
        }
        while(s.size()!=0){
            a.add(s.pop());
        }
        System.out.println(a.peek());
        while(a.size()!=0){
            System.err.println(a.remove()+" ");
        }
        sc.close();




    }
}
