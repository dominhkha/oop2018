package week2.task1;

import java.util.Scanner;

public class Task1 {
    public static int gcd(int a, int b) {
        if(a<0&&b>0) a=-1*a;
        else if(a>0&&b<0) b=-1*b;
        else if(a<0&&b<0){
            a=-1*a;
            b=-1*b;
        }
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if(a==0||b==0) return a+b;
        if(a>b) return gcd(a%b,b);
        else return gcd(a,b%a);
        
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if(n==0) return 0;
        if(n==1) return 1;
        else if(n>1) return fibonacci(n-1)+fibonacci(n-2);
        return 0;
    }
    public static void main(String[] args){
        int a,b;
        a=10;
        b=20;
        
        int c=gcd(a,b);
        System.out.println("Result: "+c);
        System.out.println("Fibonacci : "+fibonacci(4)); // 0 1 1 2 3
    }
}
