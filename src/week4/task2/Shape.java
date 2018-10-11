/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 * Viết class Shape
 * @author dominhkha
 */
  
public class Shape {
    private String color;                   
    private boolean filled;                 
     
    /**
     * Phương thức khởi tạo không có tham số
     */
    public Shape(){                             
        color = "red";
        filled = true;
    }
    /**
     * Phương thức khởi tạo với 2 tham số  String color, boolean filled
     * @param color
     * @param filled 
     */
    public Shape(String color, boolean filled){ 
        this.color=color;
        this.filled=filled;
    }
    /**
     * Phương thức lấy tên màu
     * @return  Tên màu
     */
    public String getColor(){                   
        return color;
    }
    /**
     * Phương thức thiết lập tên màu
     * @param color 
     */
    public void setColor(String color){         
        this.color=color;
    }
    /**
     * Phương thức kiểm tra hình đã đầy hay chưa
     * @return true/false
     */
    public boolean isFilled(){                  
        return filled;
    }
    /**
     * Thiết lập filled
     * @param filled 
     */
    public void setFilled(boolean filled){      
        this.filled=filled;
    }
    /**
     * Phập thức lấy thông tin của hình
     * @return Thông tin của hình
     */
    public String toString(){                   
        return "Color: "+this.color+" "+"filled:"+this.filled;  
    }
    public static void main(String[] args){
        Shape shape = new Shape("red",true);
        shape.setColor("green");
        shape.setFilled(false);
        System.out.println(shape.toString());
    }
}

