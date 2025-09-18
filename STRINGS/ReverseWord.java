import java.util.Scanner;
public class ReverseWord {
    private static void reverse(StringBuilder s,int i,int j){
        while(i<j){
          char temp = s.charAt(i);
          s.setCharAt(i, s.charAt(j));
          s.setCharAt(j, temp);
          i++;
          j--;
        }
    }
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("enter the sentence : ");
         String st = sc.nextLine();
         StringBuilder str = new StringBuilder(st);
         int i = 0;
         int j=0;
         while(j< str.length()){
            if(str.charAt(j)!=' '){
                j++;
            }
            else{
                reverse(str,i,j-1);
                j = j+1;
                i = j;

            }
        }reverse(str, i, j-1);
        System.out.println(str);
        sc.close();
    }
    
}
