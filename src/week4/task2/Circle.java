/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 * Viết class Circle thừa kế class Shape
 * 
 * @author dominhkha
 */
public class Circle extends Shape{
    private double radius; 
    public static final double PI = 3.14;  
    /**
     * Phương thức này khởi tạo không tham số 
     * @param  null
     */
    public Circle(){                    
        radius =1.0;
    }
    /**
     * Phương thức khởi tạo với 1 tham số 
     * @param radius 
     */
    public Circle(double radius){       
        this.radius = radius;
    }
    /**
     * Phương thức khởi tạo với 3 tham số
     * Phương thức có gọi phương thức khởi tạo của lớp cha thông qua từ khoá super
     * @param radius
     * @param color
     * @param filled 
     */
    public Circle(double radius, String color, boolean filled){  
        super(color,filled);                                      
        this.radius = radius;
    }
    /**
     * Phương thức lấy giá bán kính của Hình tròn
     * @return  bán kính của Hình tròn
     */
    public double getRadius(){          
        return this.radius;
    }
    /**
     * Phương thức thiết lập bán kính của Hình tròn
     * @param radius 
     */
    public void setRadius(double radius){       
        this.radius = radius;
    }
    /**
     * Phương thức tính diện tích
     * @return Diện tích của Hình tròn
     */
    public double getArea(){                 
        return radius*radius*PI;
    }
    /**
     * Phương thức tính chu vi của Hình tròn
     * @return  Chu vi của Hình tròn
     */
    public double getPerimeter(){            
        return 2*this.radius*PI;
    }
    /**
     * Phương thức lấy thông tin của Hình tròn
     * @return Chuỗi String chứa thông tin của Hình tròn
     */
    public String toString(){               
        return "radius: "+radius+" "+super.toString();
    }
    public static void main(String[] args){
        Circle tron = new Circle(2.5);
        System.out.println("Dien tich: "+tron.getArea());
        System.out.println("chu vi: "+tron.getPerimeter());
        System.out.println(tron.toString());
    }
}

