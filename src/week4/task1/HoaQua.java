/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 * Viết class HoaQua
 * @author dominhkha
 */
public class HoaQua {
    private String shape;
    private String color;
    
    /**
     * Phương thức khởi tạo không cô tham số
     */
    public HoaQua(){
        shape="Circle";
        color="red";
    }
    /**
     * Phương thức khởi tạo với 2 tham số: String shape, String color
     * @param shape
     * @param color 
     */
    public HoaQua(String shape, String color){
        this.shape=shape;
        this.color=color;
    }
    /**
     * Phương thức thiết lập giá trị cho shape
     * @param shape 
     */
    public void setShape(String shape){
        this.shape=shape;
    }
    /**
     * Phương thức lấy hình dạng hoa quả
     * @return Hình dạng hoa quả
     */
    public String getShape(){
        return this.shape;
    }
    /**
     * Phương thức thiết lập màu cho hoa quả
     * @param color 
     */
    public void setColor(String color){
        this.color=color;
    }
    /**
     * Phương thức lấy màu của hoa quả
     * @return màu của hoa quả
     */
    public String getColor(){
        return this.color;
    }
    /**
     * Phương thức lấy thông tin của hoa quả
     * @return 
     */
    public String toString(){
        return "Hinh Dang: "+this.shape+" "+"Mau sac: " +this.color;
    }
    /**
     * Phương thức thay đổi nguồn gốc của hoa quả
     * @param neworigin 
     */
    public void changeColor(String color){
        this.color=color;
    }
    public static void main(String[] args){
        HoaQua qua = new HoaQua("Circle","green");
        System.out.println(qua.toString());
        qua.changeColor("red");
        System.out.println(qua.toString());
    }
}
