//produc of evry elemnent
import java.util.ArrayList;
import java.util.Scanner;
public class Product {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
   System.out.print("please enter tyhe size = ");
        int size = sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
    for(int i= 0 ; i<size;i++){
        arr.add(i,sc.nextInt());
    }
 
    long a = 1;
    for(int ele :arr){
        a*=ele;
    }
    System.out.print("output is = "+ a);
    sc.close();
    }
    
}
