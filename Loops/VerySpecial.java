public class VerySpecial{
    public static void main(String[] args){
      int m =5;
      for(int i = 1;i<=2*m-1;i++){
        for(int j = 1; j<=2*m-1;j++){
            int a=i ;
            int b=j;
            if(i>m) a= 2*m-i;
            if(j>m) b= 2*m-j;
          //  System.out.print(Math.min(a,b)+ " ");
         //  System.out.print(Math.max(a,b)+ " ");
         System.out.print(m+1 -Math.min(a,b)+ " ");
        }System.out.println();
      }
    }
}