import  java.util.Scanner;
public class pallidrome {
     public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size = ");
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i = 0 ; i< size;i++){
            a[i]= sc.nextInt();
        }
        int i = 0 ,j = size-1;
        boolean flag = true;
        while(i<=j){
            if(a[i]!=a[j]){
                flag = false;
                break;
               
            } i++;
            j--;
        }
        if(flag==true) System.out.println("yes it is ");
        else System.out.print("it is not"); 
    }
}
