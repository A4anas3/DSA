
import java.util.Scanner;
//count no of vowel in sentences (input from user) .....charAt(i) is used to get the index char of stringf
public class countVowel{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("ebter the string");
    String s = sc.nextLine();
    int n = s.length();
    int count = 0;
    for(int i = 0;i<n;i++){
        char ch = s.charAt(i);
        if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u' ){
            count++;
        }

    }
    System.out.println(count);
    sc.close();
    }
    
}
