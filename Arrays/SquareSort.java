import java.util.Scanner;
public class SquareSort {
    private static void SquareSorti(int[] a){
        for(int i = 0; i<a.length;i++){
            a[i]*=a[i];
        }
      for(int i = 0; i<a.length;i++){
        for(int j = i+1;j<a.length;j++){
            if((a[i])>(a[j])){
                int temp = a[i];
                a[i]= a[j];
                a[j]= temp;
            }

        }
      }
        }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print(" enter the value = ");
        int size = obj.nextInt();
        int [] sc = new int[size];
        System.out.print("enter the values = ");
        for(int i= 0;i<size;i++){
            sc[i]= obj.nextInt();
        }
        SquareSorti(sc);
        for(int ele:sc){
            System.out.print(ele + " ");
        }
        obj.close();

    }
}
