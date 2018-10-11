/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 * Viết lớp Square thừa kế lớp Rectangle
 * @author dominhkha
 */
   
public class Square extends Rectangle {
   /**
    * Phương thức khởi tạo không có tham số
    */
    public Square(){                    
        super(1.0,1.0);
    }
    /**
     * Phương thức khởi tạo với 1 tham số : double side
     * @param side 
     */
    public Square(double side){          
        super(side,side);
    }
    /**
     * Phương thức khởi tạo với 3 tham số: double side, String color, boolean filled
     * Phương thức có goi phương thức khởi tạo của lớp cha
     * @param side
     * @param color
     * @param filled 
     */
    public Square(double side, String color, boolean filled){ 
        super(side, side,color,filled);                       
    }
    /**
     * Phương thức trả về độ dài của cạnh Hình vuông
     * @return  Giá trị trả về của thương thức getLength() của lớp cha
     */
    public double getSide(){              
        return super.getLength();
    }
    /**
     * Phương thức thiết lập giá trị của cạnh Hình vuông
     * @param side 
     */
    public void setSide(double side){      
        super.setLength(side);
        super.setWidth(side);
    }
    /**
     * Phương thức thiết lập chiều rộng của Hình vuông
     * @param side 
     */
    public void setWidth(double side){    
       super.setWidth(side);
    }
    /**
     * Phương thức thiết lập chiều dài của Hình vuông
     * @param side 
     */
    public void setLength(double side){     
        super.setWidth(side);
    }
    /**
     * Phương thức lấy thông tin của Hình vuông
     * @return  Giá trá trả về của phương thức toString của lớp cha
     */
    public String toString(){              
        return super.toString();
    }
    public static void main(String[] args){
        Square vuong = new Square(5);
        System.out.println("Chu vi: "+vuong.getPerimeter());
        System.out.println("Dien tich: "+vuong.getArea());
        System.out.println(vuong.toString());
    }
}
