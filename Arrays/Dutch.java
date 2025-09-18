import java.util.Scanner;
public class Dutch {
    public static void input(int[] arr,Scanner sc ){
     for(int i = 0; i< arr.length;i++){
        arr[i] = sc.nextInt();
     }
    }
    public static void sort(int[] srr){
        int low =0,mid=0,high= srr.length-1;
      while(mid<=high){
       if(srr[mid]==0){
        int temp = srr[low];
        srr[low] = srr[mid];
        srr[mid] = temp;
        low++;
        mid++;
       }
       else if(srr[mid]==1){
        mid++;
       }
       else {
        int temp = srr[high];
        srr[high] = srr[mid];
         srr[mid]= temp;
         high--;
       }
}
    }

    public static void main(String[] args ){
      Scanner sc = new Scanner(System.in);
      int [] a = new int[6];
      input(a, sc);
      sort(a);
      for(int i = 0 ; i<6;i++){
        System.out.print(a[i] + " ");
      }
    }
}
