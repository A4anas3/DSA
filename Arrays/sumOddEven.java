import java.util.Scanner;
public class sumOddEven {
    public static void input(int[] arr,Scanner sb){
        for(int i = 0; i<arr.length;i++){
            arr[i] = sb.nextInt();
        }
    }
public static int sumi(int[] arr){
    int sum = 0;
    for(int i = 0; i<arr.length;i++){
        if(i%2==0){
        sum+=arr[i];
        }else{
            sum-=arr[i];
        }
    }
    return sum;
}
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
       System.out.print("enter the values 8 = ");
       int[] a = new int[8];
       input(a, obj);

       System.out.print("your sum is = " + sumi(a));
    }
    
}
