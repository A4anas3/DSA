import java.util.Scanner;
public class MaxFreq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the sentence : ");
        String s = sc.next();
        int[] ch = new int[26];
        for(int i = 0;i<s.length();i++){
           int k= (int)s.charAt(i)-97;
           ch[k]++;
        }
        int max = Integer.MIN_VALUE;
        int mx=-1;
        for(int i = 0;i<26;i++){
            if(ch[i]>max){
              max = ch[i];
              mx = i;
            }
        }
        System.out.println("max no is "+ (char)(mx+97));
        sc.close();
    }
    
}
