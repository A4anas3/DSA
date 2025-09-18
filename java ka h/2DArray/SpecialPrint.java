import java.util.Scanner;
public class SpecialPrint {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the nbo of rows1 = ");
    int rows_1 = sc.nextInt();
    System.out.print("enter the no of column 1= ");
    int column_1 = sc.nextInt();
     int[][] matrix = new int[rows_1][column_1];
    System.out.print("enter the values first roll no then ");
    for(int i = 0; i<rows_1;i++){
      for(int j=0;j<column_1;j++){
          matrix[i][j]=sc.nextInt();
      }
    }
    for(int i =0 ;i<rows_1;i++){
        for(int j=0;j<column_1;j++){
            if(i==j || i+j ==rows_1-1) System.out.print(matrix[i][j]+ " ");
            else System.out.print(" " + " ");
        }System.out.println();
    }
}
}