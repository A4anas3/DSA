package StackI;

import java.util.EmptyStackException;

import lnkedList.print;

public class StackArray {
    private int[] arr;
    private int f=-1;
    private int r=-1;
    private int size=0;

    public StackArray(int size) {
      arr= new int[size];
    }
    
    void add(int val){
        if(r==arr.length) throw new StackOverflowError("stack overflow");
        if(f==-1 && r==-1){
            f=0;
            r=0;
            arr[r]=val;
            size++;

        }else{
            arr[++r]=val;
            size++;
        }

    }
    int remove() throws  EmptyStackException{
        if(size==0) throw new EmptyStackException();
        else{
int val=arr[f++];
size--;
return val;
        }
    }

    int peek(){
        if(size==0) throw new EmptyStackException();
        int val = arr[r];
        return val;
    }
    boolean isEmpty(){
        if(size ==0) return true;
        return false;
    }
    public void display(){
        if(size==0) throw new EmptyStackException();
        
        for(int i=f;i<=r;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        StackArray s = new StackArray(5);
        s.add(8);
        // System.out.println(s.remove());
         s.display();
           
    }
	
}
