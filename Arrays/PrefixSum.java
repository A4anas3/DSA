import java.util.Scanner;
public class PrefixSum {
    private static void prefixi(int[] a){
        for(int i = 1; i<a.length;i++){
             a[i]+=a[i-1];
        }
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int[] a = new int[8];
        System.out.print("enter the values");
     for(int i = 0 ; i<a.length;i++){
        a[i]= obj.nextInt();
     }
     prefixi(a);
     for(int ele:a){
        System.out.print(ele + " ");
     }
    }
    
}
