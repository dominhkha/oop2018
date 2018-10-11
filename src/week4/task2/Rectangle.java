/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 * Viết class Rectangle 
 * @author dominhkha
 */
  
public class Rectangle extends Shape{
    private double width;           
    private double length;     
    /**
     * Phương thức khởi tạo không có tham số
     */
    public Rectangle(){             
        width =1.0;
        length =1.0;
    }
    
    /**
     * Phương thức khởi tạo với 2 tham số
     * @param width
     * @param length 
     */
    public Rectangle(double width, double length){  
        this.width = width;
        this.length = length;
    }
    /**
     * Phương thức khởi toạ với 4 tham số
     * Phương thức có gọi phương thức khởi tạo của lớp cha thông qua từ khoá super
     * @param width
     * @param length
     * @param color
     * @param filled 
     */
    public Rectangle(double width, double length , String color, boolean filled){   
        super(color, filled);           
        this.width = width;
        this.length = length;
    }
    /**
     * Phương thức lấy giá trị của chiều rộng
     * @return width(chiều rộng)
     */
    public double getWidth(){           
        return this.width;
    }
    /**
     * Phương thức thiết lập giá trị cho chiều rộng
     * @param width 
     */
    public void setWidth(double width){ 
        this.width = width;
    }
    /**
     * Phương thức lấy giá trị của chiều dài
     * @return  length(chiều dài)
     */
    public double getLength(){            
        return this.length;
    }
    /**
     * Phương thức thiết lập giá trị cho chiều dài
     * @param length 
     */
    public void setLength(double length){
        this.length = length;
    }
    /**
     * Phương thức tính diện tích của Hình chữ nhật
     * @return  Diện tích Hình chữ nhật
     */
    public double getArea(){            
        return this.width*this.length;
    }
    /**
     * Phương thức tính chu vi Hình chữ nhật
     * @return  Chu vi Hình chữ nhật
     */
    public double getPerimeter(){       
        return 2*(this.width+this.length);
    }
    /**
     * Phương thức lấy thông tin hình chữ nhật
     * @return Chuỗi String chứa thông tin hình chữ nhật
     */
    public String toString(){           
        return "width: "+width+" "+"length: "+length+" "+super.toString();
    }
    public static void main(String[] args){
        Rectangle cNhat = new Rectangle(2,4);
        System.out.println("Chu vi: "+cNhat.getPerimeter());
        System.out.println("Dien tich: "+cNhat.getArea());
        System.out.println(cNhat.toString());
    }
}

