import java.util.Scanner;
public class ChangeSString {
    public static void main(String[] args){
     Scanner sc  = new Scanner(System.in);
     System.out.print("entyer te string ");
     String s = sc.nextLine();
     String str = "";
     for(int i= 0;i<s.length();i++){
        if(i%2==0)  str+="a";
        else str+=s.charAt(i);
     }
    System.out.print(str);
    sc.close();
    }
}
