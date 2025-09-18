import java.util.Scanner;
public class y90Clockwise {
    private static void prinit(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j= 0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }
    public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);
    System.out.print("eter the no  of rows = ");
    int rows = sc.nextInt();
    System.out.print("enter the no col  =");
    int col = sc.nextInt();
    int [] [] mat = new int[rows][col];
    for(int i = 0; i<rows;i++){
        for(int j= 0 ; j<col;j++){
            mat[i][j] = sc.nextInt();
        }
    }
    System.out.println("your output = ");
    prinit(mat);
    if(rows==col){
       for(int i = 0 ; i<rows;i++){
          for(int j = 0 ; j<i;j++){
            int temp= mat[i][j];
            mat[i][j]=mat[j][i];
            mat[j][i]= temp;
        }
    }
    for(int i =0;i<rows;i++){
        int a= 0,b=col-1;
      while(a<=b){
        int temp= mat[i][a];
        mat[i][a]= mat[i][b];
        mat[i][b]=temp;
        a++;
        b--;
      }
    }
    prinit(mat);
}else{
   System.out.print(" it is impoosible ");
}sc.close();

    }
}
