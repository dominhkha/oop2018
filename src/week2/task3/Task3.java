package week2.task3;

class bankUser {

    private String name;
    private String id;
    private int soTienDu;

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
    public void rutTien(int mon){
        if(mon>this.getSoTienDu()) {
            System.out.println("\ncannot get monney");
            return ;
        }
        else {
            this.soTienDu=this.soTienDu-mon;
        }
    }
    public void napTien(int mon){
        
    }
}

public class Task3 {

}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
