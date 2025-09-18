import java.util.Scanner;
public class EvenOddSort {
    private static void input(int[] a,Scanner sc){
        for(int i = 0; i<a.length;i++){
            a[i]= sc.nextInt();
        }
    }
    private static void EvenOddSorti(int[] a){
        int i =0,j=a.length-1;
        while(i<=j){
             if(a[i]%2==0){
                i++; 
               }else if(a[j]%2==1){
                j--;
               }
            else {
                 int temp =a[i];
                 a[i]= a[j];
                a[j]= temp; 
            i++;
        j--;
               }
              
        }
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the size");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.printf("enter the values = ");
        input(arr, obj);
      EvenOddSorti(arr);
      System.out.println("your sorted array = ");
      for(int ele:arr){
        System.out.print(ele + " ");
      }
obj.close();
    }
}
