public class SpecialConcept{
 /*  1 
1 3
1 3 5
1 3 5 7
1 3 5 7 9*/
    public static void main(String[] args ){
        int m = 5;
        for(int i = 1; i<=m;i++){
            for(int j= 1;j<=(2*i-1);j+=2){
                System.out.print(j + " ");
            }System.out.println();
        }
        for(int i = 1;i<=m;i++){
            for(int j =1;j<=i;j++){
                System.out.print(2*j-1 + " ");
            }System.out.println();
        }
        for(int i = 1;i<=m;i++){
            int a = 1;
            for(int j =1;j<=i;j++){
                System.out.print(a + " ");
                a+=2;
            }System.out.println();}
            int a = 1;
            for(int i = 1;i<=m;i++){
              
                for(int j =1;j<=i;j++){
                    System.out.print(a + " ");
                   a++ ;
                }System.out.println();}
   
   
        }



}