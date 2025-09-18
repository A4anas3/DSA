import java.util.Scanner;
class Startswith{
    public void starts(String a, String b){
        System.out.println(a.startsWith(b));
        System.out.print("a endwith b " + a.endsWith(b));
}
}
public class Basic {
    //CONTAINS 
    private static void contain(String a,String b){
        System.out.print("a contain b is " + a.contains(b));
    }
    //COMPARE TO USE IN STRING 
    private static void compare(String a,String b){
        System.out.println("answer is = " + a.compareTo(b));
    }
    //INDEX FIND
    public static void main(String[] args){
     /*  Scanner sc = new Scanner(System.in);
        System.out.print("enter the string  = ");
        String s = sc.nextLine();
        System.out.print("enter the chat = ");
        char c = sc.next().charAt(0);
        System.out.print("index is "+ s.indexOf(c)); */
         
        //COMPARE first ascii difference than length
        compare("abc", "abcd");
        //contain 
        contain("yets","yes");

        // start ensd
        Startswith s = new Startswith();
        s.starts("hello anas ", "hell");
        
    }
}
