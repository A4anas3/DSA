import java.util.Scanner;

public class intoSpiral {
    public static void main(String[] args ){
       Scanner sc = new Scanner(System.in);
      System.out.print("enter the no rows = ");
      int rows = sc.nextInt();
      System.out.print("enter the no col = ");
      int col = sc.nextInt();
      int[][] mat = new int[rows][col];
      System.out.print("enter the values = ");
      for(int i = 0 ; i<rows;i++){
        for(int j = 0 ; j<col ; j++){
            mat[i][j]= sc.nextInt();
        }
      }
      for(int i = 0;i<rows;i++){
        for(int j = 0 ; j<col;j++){
            System.out.print(mat[i][j]+ " ");
        }System.out.println();
      }
      int minr = 0,maxr=rows-1;
      int minc=0,maxc=col-1;
      while(minr<=maxr && minc<=maxc){
        for(int j = minc ; j<=maxc;j++){
            System.out.print(mat[minr][j]+ " ");
        }minr++;
        if(minr>maxr || minc>maxc) break;
        for(int i = minr;i<=maxr;i++){
            System.out.print(mat[i][maxc] + " ");
        }maxc--;
        if(minr>maxr || minc>maxc) break;
        for(int j =maxc;j>=minc;j-- ){
            System.out.print(mat[maxr][j]+ " ");
        }maxr--;
        if(minr>maxr || minc>maxc) break;
        for(int i = maxr;i<=minr;i++){
            System.out.print(mat[i][minc]+ " ");
        }minc++;
      }sc.close();
    }
}
