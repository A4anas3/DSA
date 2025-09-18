
import java.util.Scanner;

public class Pattern {
    private static void pattern(int m, int n){
        for(int i = 0;i<m;i++){
            for(int j= 0 ; j<n;j++){
                System.out.print((i+1) + " ");
            }System.out.println();
        }
    }
    public static void main( String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the no of rows ");
      int rows = sc.nextInt();
      System.out.print(" Enter the no column = ");
      int columns = sc.nextInt();
      System.out.println(" your pattern is = ");
      pattern(rows,columns);
      sc.close();

    }
}
