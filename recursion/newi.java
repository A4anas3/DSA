import java.util.Scanner;
public class newi {
    public static void printi(int x,int n){
        if (n==0) return;
    
        System.out.print(x);
        printi(x+1,n-1);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printi(1,n);

    }
    
}
