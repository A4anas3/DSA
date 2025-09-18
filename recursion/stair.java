public class stair {
    public static int count(int n){
        if (n == 1 || n == 3) return n;
        else if (n==2) return 0;
        return count(n-1)+count(n-3);
    }
    public static void main(String[] args){
        int n = 8;
        System.out.print(count(n)+" ");

    }
    
}
