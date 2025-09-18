package stack;
import java.util.Scanner;
import java.util.Stack;

public class copy {
    public static Stack<Integer> reve(Stack<Integer>a ,Stack<Integer>b){
        if(a.isEmpty()) return b;
        b.push(a.pop());
        return reve(a,b);

    }
    public static void main(String[] args){
        Stack<Integer>a = new Stack<>();
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<6;i++){
            a.push(sc.nextInt());

        }
        Stack<Integer>rev = new Stack<>();
        while(!a.isEmpty()){
            System.out.println(a.peek());
            rev.push(a.pop());


        }
        a= reve(rev,a);
        
        while(!a.isEmpty()){
            System.out.println(a.pop());
           


        }
        System.out.println(a.size());
    }
    
}
