/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 * Viết class Tao thừa kế lớp HoaQua
 * @author Dell
 */
public class Tao extends HoaQua{
    private String buyer;
    private float cost;
    /**
     * Phương thức khởi tạo ko tham sô
     */
    public Tao(){
        super();
        this.buyer="dominhkha";
        this.cost=0;
    }
    /**
     * Phương thức khởi tạo có 4 tham số
     * Phương thức có gọi phương thức khởi tạo 2 tham số của superclass
     * @param shape
     * @param color
     * @param buyer
     * @param cost 
     */
    public Tao(String shape, String color, String buyer, float cost){
        super(shape,color);
        this.cost=cost;
        this.buyer=buyer;
    }
    /**
     * Phương thức lấy tên ng mua
     * @return buyer
     */

    public String getBuyer() {
        return buyer;
    }
    /**
     * Phương thức thiết lập tên ng mua
     * @param buyer 
     */

    public void setNguoiMua(String buyer) {
        this.buyer = buyer;
    }
 /**
  * Phương thức lấy giá của Táo
  * @return cost
  */
    public float getCost() {
        return cost;
    }
/**
 * Phương thức thiết lập giá của quả Táo
 * @param cost 
 */
    public void setCost(float cost) {
        this.cost = cost;
    }
    /**
     * Phương thức thay đổi giá của quả Táo
     * @param newCost 
     */
    public void changeCost(float newCost){
        this.cost=newCost;
    }
    /**
     * Phương thức thay đổi tên người mua
     * @param newBuyer 
     */
    public void changeBuyer(String newBuyer){
        this.buyer=newBuyer;
    }
    /**
     * Phương thức lấy thông tin của quả Táo
     * Phương thưc có goi phương thức toString của superclass
     * @return thông tin quả Táo
     */
    public String toString(){
        return super.toString()+" "+"Nguoi mua: "+this.buyer+" "+"Gia: "+this.cost;
    }
    public static void main(String[] args){
        Tao tao = new Tao("Circle","red","dominhkha",4000);
        System.out.println(tao.toString());
        tao.changeBuyer("minhkhado");
        tao.changeCost(500);
        Tao tao1 = new Tao();
        System.out.println(tao1.toString());
    }
}
