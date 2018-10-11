/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 * Viết class CamThanhPhong thừa kế class Cam
 * @author Dell
 */
public class CamThanhPhong extends Cam{
    private String tatse;
    private String nguoiBan;
    /**
     * Phương thức khởi tạo không có tham số
     */
    public CamThanhPhong(){
        super();
        this.tatse="sour";
        this.nguoiBan="dominhkha";
    }
    /**
     * Phương thức khởi tạo với 6 tham số: String origin, String ngayBan, String shape, String color, String tatse, String nguoiBan
     * Phương thức có  gọi phương thức khởi tạo của superclass
     * @param origin
     * @param ngayBan
     * @param shape
     * @param color
     * @param tatse
     * @param nguoiBan 
     */
    public CamThanhPhong(String origin, String ngayBan, String shape, String color, String tatse, String nguoiBan){
        
        super( origin,ngayBan,shape,color);
        this.tatse=tatse;
        this.nguoiBan=nguoiBan;
    }
    /**
     * Phương thức thiết lập mùi vị
     * @param tatse 
     */
    public void setTatse(String tatse){
        this.tatse=tatse;
    }
    /**
     *  Phương thức lây tatse
     * @return tatse
     */
    public String getTatse(){
        return this.tatse;
    }
    /**
     * Phương thức thiết lập người bán
     * @param nguoiBan 
     */
    public void setNguoiBan(String nguoiBan){
        this.nguoiBan=nguoiBan;
    }
    /**
     * Phương thức lấy tên ng bán
     * @return nguoiBan
     */
    public String getNguoiBan(){
        return this.nguoiBan;
    }
    /**
     * Phương thức lấy thông tin Cam Thanh Phong
     * Phương thức có gọi phương thức toString của superclass
     * @return  Thông tin Cam Thanh Phong
     */
    public String toString(){
        return super.toString()+" "+"Nguoi ban: "+nguoiBan+" "+"Mui vi: "+tatse;
    }
    /**
     * Phương thức thay đổi người bán
     * @param nguoiBan 
     */
    public void thayDoiNguoiBan(String nguoiBan){
        this.nguoiBan=nguoiBan;
    }
    /**
     * Phương thức bơm hoá chất để hoa quả ngon hơn
     */
    public void themHoaChat(){
        tatse="delicious";
    }
    public static void main(String[] args){
        CamThanhPhong ctp = new CamThanhPhong("Austraylia","11/10/1028","Circle","green","good","minhkhado");
        System.out.println(ctp.toString());
        ctp.thayDoiNguoiBan("Do Minh Kha");
        ctp.changeOrigin("Việt Nam");
        System.out.println(ctp.toString());
        
    }
}
