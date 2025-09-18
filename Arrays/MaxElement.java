import java.util.Scanner;
class Max{
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max){
             smax = max;  -
                max=arr[i];
            }
            else if( arr[i]>smax && arr[i]!=max){
                smax= arr[i];
            }
        } return smax;
    }
}
public class MaxElement {
    public static void main(String[] args){
        
        Scanner obj = new Scanner(System.in);
        System.out.print("please enter the length of array = ");
        int n = obj.nextInt();


        int[] array = new int[n];

        System.out.println("enter the no in array = ");
        for(int i = 0; i<n;i++){
            array[i] = obj.nextInt();
        }
        System.out.println("largest no is =" + (Max.max(array)));
      

        obj.close();
    }
}
