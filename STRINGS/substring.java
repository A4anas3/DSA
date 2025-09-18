import java.util.Scanner;
class substring{
    private void subtring(String s,int i){
        for(int j = i+1;j<=s.length();j++)
        System.out.println(s.substring(i,j));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the nho : ");
        int n = sc.nextInt();
        System.out.print("enter the string : ");
        String a = sc.nextLine();
        String s = sc.nextLine();
        
        substring st = new substring();
        st.subtring(s,n);
        sc.close();

        

    }
}