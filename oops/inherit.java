package oops;
class anas{
    public int a;
    public int b;
    public int c;
}
class haru extends  anas{
    public int e;
    private int d;
    haru(int a,int b,int c,int d,int e){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
    }
} 
public class inherit {
    public static void main(String[] args) {
        haru s=new haru(1,2,3 , 4, 5);
        System.out.println(s.a);
    }
}
