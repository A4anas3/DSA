import java.util.Scanner;
public class printi {
    public static void printi(int n ){
        if (n==0) return;
    
        System.out.print( n);
        printi(n-1);
        System.out.print( n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printi(n);

    }
    
}


