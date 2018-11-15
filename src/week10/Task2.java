package week10;

import java.util.Random;

public class Task2 {
    public static void main(String[] args){
        floatNumber t = new floatNumber();
        int n=1000;
        Random rand = new Random();
        for(int i=0;i<n;i++){
            float x=rand.nextFloat();
            t.append(x);
        }
        t.bubbleSort();
        t.print();
    }
    
}
class floatNumber{
    private float[] a;
    private int n;
    public floatNumber(){
        a=new float[1000];
        n=0;
    }
    public void append(float x){
        a[n]=x;
        n++;
    }
    public void bubbleSort(){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[j]<a[i]){
                    float c=a[i];
                    a[i]=a[j];
                    a[j]=c;
                }
            }
        }
    }
    public void print(){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
