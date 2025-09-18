package CircularQueue;

import java.util.EmptyStackException;

class caa{
    int e=-1,r=-1,size=0;
    int[] arr=new int[10];
    int n=10;
    public void add(int val){
        if(size==arr.length) throw new StackOverflowError("full");
        if(size==0){
            e=0;
            r=0;
            arr[r]=val;
        } 
        else if(r<n-1){
            arr[++r]=val;
        }else{
            r=0;
            arr[r]=val;

        }
        size++;
    }

    public int delete(){
        if(size==0){
            System.out.println("EMpty");
            return -1;

        }
        int val=arr[e];
        if(e==n-1) e=0;
        else e++;
        size--;
        return val;

    }
    public int peek(){
        if(size==0){
            throw new EmptyStackException();
        }
        return arr[e];
    }

    public void display(){
        if(size==0) throw new EmptyStackException();
        else if(r>=e){
            for(int i=e;i<=r;i++){
                System.out.println(arr[i]);

            }


        }else{
            for(int i=e;i<n;i++){
                System.out.print(arr[i]+"->");
            }
            for(int i=0;i<=r;i++){
                System.out.println(arr[i]+"->");
            }
        }
    }
    boolean isEmpty(){
        return size==0;
    }
    int size(){
        return size;
    }
   
}

public class CircularQueue {
     public static void main(String[] args) {
        caa a= new caa();
        a.add(2);
        a.add(5);
         a.add(2);
        a.add(5);
         a.add(2);
        a.add(5);
         a.add(2);
        a.add(5);
         a.add(2);
        a.add(5);
        a.delete();
         a.add(3);
        a.display();
        System.out.println(a.size());
        
    }
   
    
}
