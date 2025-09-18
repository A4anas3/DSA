package oops;
class animal{
    public void eat(){
        System.err.println("eatfood");
    }
    public void sleep(){
        System.err.println("sleep");
    }
}
class monkey extends animal{
    public void eat(){
        System.out.println("moneky eat");
    }

}
class lion extends animal{
    public void eat(){
        System.out.println("lion eat");
    }

}
class implement{
    public void allow(animal a){
        a.eat();
       // a.sleep();
       
    }

}
public class override {
    public static void main(String[] args) {
        lion l = new lion();
        monkey m=new monkey();
        implement i=new implement();
        i.allow(m);
        i.allow(l);

        
    }
}

    

