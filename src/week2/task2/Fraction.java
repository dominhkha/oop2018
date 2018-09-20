package week2.task2;

import week2.task1.Task1;


public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numberator;
    private int denominator;
    public Fraction(int numerator, int denominator) {
        if(denominator==0) {
            System.out.println("setter fail !");
            return ;
        }
        this.numberator=numberator;
        this.denominator=denominator;
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
    }

    public Fraction add(Fraction other) {
        if(other.denominator==0) return null;
        int a=numberator*other.denominator+denominator*other.numberator;
        int b=denominator*(other.denominator);
        int j=Task1.gcd(a, b);
        Fraction t=new Fraction(a/j,b/j);
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        return t;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        return null;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        return null;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        return null;
    }
}
