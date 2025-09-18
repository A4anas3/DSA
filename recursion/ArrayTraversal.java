import java.util.Scanner;

public class ArrayTraversal {
    private static void print(int[] c ,int a,int b ,Scanner sc){
        if(a==b) return;
        c[a]=sc.nextInt();
        print(c,a+1,b,sc);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[9];
        print(a,0,9,sc);
    }
    
}
