/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 * Viết class Cam thừa kế class HoaQua
 * @author dominhkha
 */
public class Cam extends HoaQua {
    private String origin;
    private String ngayBan;
    /**
     * Phương thức khởi tạo không có tham sô
     */
    public Cam(){
        super();
        origin="Viet Nam";
        ngayBan="9/11/1999";
    }
    /**
     * Phương thức khởi tạo với 4 tham sô: String origin, String ngayBan, String shape, String color
     * Phương thức có gọi phương thức khởi tạo 2 tham số của lớp cha
     * @param origin
     * @param ngayBan
     * @param shape
     * @param color 
     */
    
    public Cam(String origin, String ngayBan, String shape, String color){
        super(shape,color);
        this.origin=origin;
        this.ngayBan=ngayBan;
    }
    /**
     * Phương thức thiết lập nguồn gốc cho Cam
     * @param origin 
     */
    public void setOrigin(String origin){
        this.origin=origin;
    }
    /**
     * Thiết lập ngày bán cho Cam
     * @param ngayBan 
     */
    public void setNgayBan(String ngayBan){
        this.ngayBan=ngayBan;
    }
    /**
     * 
     * Phương thức lấy nguồn gốc của Cam
     * @return Nguồn gốc
     */
    public String getOrigin(){
        return this.origin;
    }
    /**
     * Phương thức lấy ngày bán của Cam
     * @return Ngày bán
     */
    public String getNgayBan(){
        return this.ngayBan;
    }
    /**
     * Phương thức Làm chín Cam
     */
    public void lamChin(){
        super.setColor("Yellow");
    }
    /**
     * Phương thức thay đổi nguồn gốc cho Cam
     * @param origin 
     */
    public void changeOrigin(String origin){
        this.origin=origin;
    }
    /**
     * Phương thức đổi ngày bán cho Cam
     * @param NgayBan 
     */
    public void doiNgayBan(String NgayBan){
        this.ngayBan=NgayBan;
    }
    /**
     * Phương thức lấy thông tin của Cam
     * Phương thức có gọi hàm toString của lớp cha
     * @return  Thông tin của Cam
     */
    public String toString(){
        return super.toString()+" "+"xuat xu: "+this.origin+" "+"Ngay Ban: "+this.ngayBan;
    }
    public static void main(String[] args){
        Cam cam = new Cam("America","12/10/2018","Circle","green");
        cam.doiNgayBan("11/20/2018");
        cam.lamChin();
        System.out.println(cam.toString());
    }
}
