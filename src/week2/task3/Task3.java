package week2.task3;

// tao doi tuong nguoi dung tai khoan ngan hang
class bankUser {

    private String name;    // ten cua chu tai khoan
    private String id;      // ma tai khoan
    private int soTienDu;   // so tien du trong tai khoan
    // constructor
    public bankUser() {
        name = "0000";
        id = "0000";
        soTienDu = 0;
    }

    public bankUser(String name, String id, int soTienDu) {
        this.name = name;
        this.id = id;
        this.soTienDu = soTienDu;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSoTienDu(float soTienDu) {
        this.soTienDu = soTienDu;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public float getSoTienDu() {
        return soTienDu;
    }

    // rut tien
    public void rutTien(int mon) {
        if (mon > this.getSoTienDu()) {
            System.out.println("\ncannot get monney");
            return;
        } else {
            this.soTienDu = this.soTienDu - mon;
        }
    }

    // nap tien 
    public void napTien(int mon) {
        this.soTienDu = mon;
    }
//
    // ham in ra thong tin tai khoan
    public void printAcc() {
        System.out.println("ten: " + name + " id: " + id + " so tien du: " + soTienDu);
    }

    // ham chuyen tien cho tai khoan khac
    public void chuyenTien(int mon, bankUser other) {
        if(other==null||other.name=="0000"){
            System.out.println("\nuser who you want to tranfer money isnot exist!");
            return ;
        }
        if (mon > soTienDu) {
            System.out.println("\ncannot transfer money!");
            return;
        } else {
            soTienDu = soTienDu - mon;
            other.soTienDu = other.soTienDu + mon;
        }
    }
}
 // tao doi tuong ngoi nha 
class House{
    private String color; // mau sac cua ngoi nha
    private int soTang;   // so tang cua ngoi nha
    private String tenChuNha;   // ten cua chu nha
    public House(){
        color="0000";
        soTang=0;
        tenChuNha="0000";
    }
    public House(String color, int soTang, String tenChuNha){
        this.color=color;
        this.soTang=soTang;
        this.tenChuNha=tenChuNha;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public void setTenChuNha(String tenChuNha) {
        this.tenChuNha = tenChuNha;
    }

    public String getColor() {
        return color;
    }

    public int getSoTang() {
        return soTang;
    }

    public String getTenChuNha() {
        return tenChuNha;
    }
    public void changeColor(String color){
        this.color=color;
    }
    public void xayThemTang(int n){ // ham xay them tang cua ngoi nha
        if(n<0) {
            System.out.println("\n cannot add floor");
        }
        this.soTang=this.soTang+n;
    }
    public void phaTang(int n){     // pha bot tang
        if(this.soTang<n||n<0){
            System.out.println("\ncannot destroy house");
            return ;
        }
        else {
            this.soTang=this.soTang-n;
        }
    }
    public void doiChuNha(String chuNhaMoi){        // doi ten chu nha
        if(chuNhaMoi==null||chuNhaMoi=="") {
            System.out.println("\ncannot change own of house");
            return ;
        }
        this.tenChuNha=chuNhaMoi;
    }
    public void print(){        // in ra thong tinn chu nha
        System.out.println("\nten chu nha: "+tenChuNha+" mau son: "+color+" so tang: "+soTang);
    }
}
class Company{
    private String name;    //ten cong ty
    private int number;     // so luong nhan vien
    private String id;      // dia chi cong ty
    public Company(){
        name="000";
        number=0;
        id="000";
    }
    // constructor
    public Company(String name, int num, String id){
        this.name=name;
        this.number=num;
        this.id=id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getId() {
        return id;
    }
    public void saThaiNhanVien(int n){      // sa thai nhan vien
        if(n>this.number||n<=0){
            System.out.println("\nKhong the sa thai nhan vien!");
            return ;
        }
        else {
            this.number=this.number-n;
        }
    }
    public void tuyenNhaVien(int n){        // tuyen them nhan vien
        if(n<=0){
            System.out.println("\nKhong the them nhan vien!");
            return ;
        }
        else {
            this.number=this.number+n;
        }
    }
    public void chuyenDiaChi(String id){       // chuyen dia chi cong ty
        if(id==null||id==""){
            System.out.println("\nKhong the chuyen di chi!");
            return ;
        }else {
            this.id=id;
        }
    }
    public void print(){            // in ra thong tin cong ty
        System.out.println("ten: "+name+" so nhan vien: "+number+" dai chi: "+id);
    }
}
public class Task3 {

}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
