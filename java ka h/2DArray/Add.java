import java.util.Scanner;
//Q2. Write a program to add two matrices and save the result in one of the given matrices.
public class Add {
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
        System.out.print("enter the nbo of rows2 = ");
        int rows_2 = sc.nextInt();
        System.out.print("enter the no of column 2= ");
        int column_2 = sc.nextInt();
         int[][] matrix_2 = new int[rows_2][column_2];
        System.out.print("enter the values first roll no then ");
        for(int i = 0; i<rows_2;i++){
          for(int j=0;j<column_2;j++){
              matrix_2[i][j]=sc.nextInt();
          }
        }
     //   int[][] finali = new int[rows_1][column_1];
        if(rows_1==rows_2 && column_1==column_2){
            for(int i = 0; i<rows_1;i++){
                for(int j = 0; j<column_1;j++){
                  matrix[i][j]= (matrix[i][j]+ matrix_2[i][j]); 
                }
            }
            for(int i = 0 ; i<rows_1;i++){
                for(int j = 0;j<column_1;j++){
                    System.out.print(matrix[i][j] + " ");
                }System.out.println();
            }
        }
        else{
            System.out.print(" it is not possible ");
        }

     sc.close();
    }
}
