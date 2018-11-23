package week11;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args){
        Generic<Integer> list = new Generic<Integer>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        list.print();
    }
}
class Generic<T>{
    private  ArrayList<T> array;
    private int i=0;
    private int NUM1=100;
    public Generic(){
        this.array= new ArrayList<T>();
        
    }
    
    public void add(T o){
        this.array.add(o);
        i++;
    }
    public void print(){
        for(int j=0;j<i;j++){
            System.out.println(this.array.get(j));
        }
    }
}

