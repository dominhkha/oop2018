package week2.task2;

import week2.task1.Task1;


public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numberator;
    private int denominator;
    public Fraction(int numberator, int denominator) {
        if(denominator==0) {
            System.out.println("constructor fail !");
            return ;
        }
        int t=Task1.gcd(numberator, denominator);
        int j=1;
        if(denominator<0) j=-1;
        this.numberator=(numberator*j);
        this.denominator=(denominator*j);
        this.denominator=this.denominator/t;
        this.numberator=this.numberator/t;
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
    }

    public void setNumberator(int numberator) {
        this.numberator = numberator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumberator() {
        return numberator;
    }

    public int getDenominator() {
        return denominator;
    }

    
    public Fraction add(Fraction other) {
        if(other.denominator==0||denominator==0) {
            System.out.println("\ncannot add");
            return null;
        }
        int a=numberator*other.denominator + denominator*other.numberator;
        int b=denominator*(other.denominator);
        int j=Task1.gcd(a, b);
        return new Fraction(a/j,b/j);
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        
    }

    public Fraction subtract(Fraction other) {
        if(other.denominator==0||denominator==0) {
            System.out.println("\ncannot subtract");
            return null;
        }
        int a=numberator*other.denominator - denominator*other.numberator;
        int b=denominator*(other.denominator);
        int j=Task1.gcd(a, b);
        return new Fraction(a/j,b/j);
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        
    }

    public Fraction multiply(Fraction other) {
        if(other.denominator==0||denominator==0) {
            System.out.println("\ncannot multiply");
            return null;
        }
        int a=this.numberator*other.numberator;
        int b=this.denominator*other.denominator;
        int j=Task1.gcd(a,b);
        return new Fraction(a/j,b/j);
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        
    }

    public Fraction divide(Fraction other) {
        if(other.numberator==0||other.denominator==0||denominator==0) {
            System.out.println("\ncannot divide\n");
            return null;
        }
        int a=numberator*other.denominator;
        int b=denominator*other.numberator;
        int j=Task1.gcd(a, b);
        return new Fraction(a/j,b/j);
        
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
    }
    public boolean equals(Fraction Obj){
      Fraction t= this.subtract(Obj);
      if(t.numberator==0) return true;
      return false;
      // return Obj.equals(this);
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
        Fraction ps2=ps.subtract(ps1);
        Fraction ps3=ps.multiply(ps1);
        Fraction ps4=ps.add(ps1);
        Fraction ps5=ps.divide(ps1);
        if(ps.equals(ps1)){
            System.out.println(ps.getNumberator()+"/"+ps.getDenominator()+"="+ps1.getNumberator()+"/"+ps1.getDenominator());
        }
        else System.out.println(ps.getNumberator()+"/"+ps.getDenominator()+"!="+ps1.getNumberator()+"/"+ps1.getDenominator());
        ps2.print();
        ps3.print();
        ps4.print();
        ps5.print();
    }
}
