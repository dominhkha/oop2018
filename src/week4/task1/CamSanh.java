/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 * Viết class CamSanh thừa kế lớp Cam
 * @author dominhkha
 */
public class CamSanh extends Cam{
    private int quantity; 
    private float weight;
    /**
     * Phương thức khởi tạo không có tham số
     */
    public CamSanh(){
        super();
        this.quantity=0;
        this.weight=0;
    }
    /**
     * Phương thức khởi tạo có 6 tham số : String origin, String ngayBan, String shape, String color, int quantity, float weight
     * Phương thức có gọi hàm khởi tạo của superclass
     * @param origin
     * @param ngayBan
     * @param shape
     * @param color
     * @param quantity
     * @param weight 
     */
    public CamSanh(String origin, String ngayBan, String shape, String color, int quantity, float weight){
        super(origin,ngayBan,shape,color);
        this.quantity=quantity;
        this.weight=weight;
    }
 /**
  *  Phương thức lấy số lượng quả Cam Sanh
  * @return số lượng quả Cam Sanh
  */
    public int getQuantity() {
        return quantity;
    }
/**
 * Phương thức thiết lâp số lượng quả Cam Sanh
 * @param quantity 
 */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
/**
 * Phương thức thiết lập cân nặng của quả Cam Sanh
 * @return cân nặng
 */
    public float getWeight() {
        return weight;
    }
/**
 * Phương thức thiết lập cân nặng của quả Cam Sanh
 * @param weight 
 */
    public void setWeight(float weight) {
        this.weight = weight;
    }
    /**
     * Phương thức làm tăng cân nặng của quả Cam Sanh
     * @param x 
     */
    public void increaseWeight(float x){
        this.weight=this.weight+x;
    }
    /**
     * Phương thức làm tăng số lượng của quả Cam Sanh
     * @param x 
     */
    public void increaseQuantity(int x){
        this.quantity=this.quantity+x;
    }
    /**
     * Phương thức lấy thông tin của quả Cam Sanh
     * @return thông tin của quả Cam Sanh
     */
    public String toString(){
        return super.toString()+" "+"So Luong : "+this.quantity+" "+"Can nang: "+this.weight;
    }
    public static void main(String[] args){
        CamSanh camSanh=new CamSanh("Singapore","11/10/2018","Circle","green",10,2);
        System.out.println(camSanh.toString());
        camSanh.doiNgayBan("12/10/2018");
        camSanh.lamChin();
        System.out.println(camSanh.toString());
    }
}
