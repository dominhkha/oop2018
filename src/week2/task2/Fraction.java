package week2.task2;

import week2.task1.Task1;


public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numberator;
    private int denominator;
    public Fraction(int numberator, int denominator) {
        if(denominator==0) {
            System.out.println("setter fail !");
            return ;
        }
        int j=1;
        if(denominator<0) j=-1;
        this.numberator=numberator*j;
        this.denominator=denominator*j;
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
    }

    public Fraction add(Fraction other) {
        if(other.denominator==0||denominator==0) {
            System.out.println("\ncannot add");
            return null;
        }
        int a=numberator*other.denominator + denominator*other.numberator;
        int b=denominator*(other.denominator);
        int j=Task1.gcd(a, b);
        Fraction t=new Fraction(a/j,b/j);
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        return t;
    }

    public Fraction subtract(Fraction other) {
        if(other.denominator==0||denominator==0) {
            System.out.println("\ncannot add");
            return null;
        }
        int a=numberator*other.denominator - denominator*other.numberator;
        int b=denominator*(other.denominator);
        int j=Task1.gcd(a, b);
        Fraction t=new Fraction(a/j,b/j);
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        return t;
    }

    public Fraction multiply(Fraction other) {
        if(other.denominator==0||denominator==0) {
            System.out.println("\ncannot multiply");
            return null;
        }
        int a=numberator*other.numberator;
        int b=denominator*other.denominator;
        int j=Task1.gcd(a, b);
        Fraction t=new Fraction(a/j,b/j);
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        return t;
    }

    public Fraction divide(Fraction other) {
        if(other.numberator==0||other.denominator==0||denominator==0) {
            System.out.println("\ncannot divide\n");
            return null;
        }
        int a=numberator*other.denominator;
        int b=denominator*other.numberator;
        int j=Task1.gcd(a, b);
        Fraction t= new Fraction(a/j,b/j);
        return t;
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
    }
    public boolean equals(Fraction other){
        int j=Task1.gcd(numberator,denominator);
        int k=Task1.gcd(other.numberator,other.denominator);
        Fraction t1=new Fraction(numberator/j,denominator/j);
        Fraction t2=new Fraction(other.numberator/k,other.denominator/k);
        return t1.equals(t2);
    }
    public void print(){
        if(denominator==0){
            System.out.println("\ncannot print");
            return ;
        }
        if(numberator==0) System.out.println("0");
        else if(denominator==1) System.out.println(numberator);
        else {
            System.out.println(numberator+"/"+denominator);
        }
    }
    public static void main(String[] args){
        Fraction ps=new Fraction(1,2);
        Fraction ps1=new Fraction(5,2);
        System.out.println("kjjj");
        Fraction ps2=ps.subtract(ps1);
        ps2.print();
    }
}
