package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    private Student[] ds=new Student[100];
    public boolean sameGroup(Student s1, Student s2) {
        // TOD5 O:
       if(s1.getGroup()==null) s1.setGroup(""); // xu ly null
       if(s2.getGroup()==null) s2.setGroup(""); // xu ly null
       return s1.getGroup().equals(s2.getGroup());
    }
    
    void studentsByGroup() {
        // TODO:
        int i=0,j;
        int k=0;
        String[] tenLop=new String[100]; // khoi tao tap ten cac lop
        boolean[] d = new boolean[100]; // danh dau mot sinh vien da thuoc ten lop co trong mang tenLop hay chua
                                        // neu d[i] true co nghia la lop cua sinh vien i da duoc them vao danh sach cac lop                         
        for(i=0;ds[i]!=null;i++) {
            d[i]=false;
            if(ds[i].getGroup()==null) ds[i].setGroup(""); // xu ly null: neu group=null thi gan cho no la rong
        }
        i=0;
        // thuc hien tach ten lop
        while(ds[i]!=null){
            if(d[i]==false) {
                tenLop[k]=ds[i].getGroup();
                for(j=0;ds[j]!=null;j++){
                    if(d[j]==false&&ds[j].getGroup().equals(tenLop[k])){
                        d[j]=true;   // danh dau sv j co the cung lop voi sv khac hoac ten lop cua sv do duoc cho vao danh sach lop
                    }
                }
                k++;
            }
            i++;
        }
        // in ra cac sinh vien thuoc tung lop
        for(i=0;i<k;i++){
            if(tenLop[i]=="") System.out.println("\ncac sinh vien khong co lop la : ");
            else System.out.println("\ncac hoc sinh thuoc lop "+tenLop[i] +" la : ");
            for(j=0;ds[j]!=null;j++){
                if(ds[j].getGroup().equals(tenLop[i])) ds[j].getInfo();
            } 
        } 
        
    }

    void removeStudent(String id) {
        // TODO:
        int i=0;
        String id1 = new String(id);
        for(i=0;ds[i]!=null;i++)
            if(ds[i].getId().equals(id1)) break; // neu co sinh vien co id can xoa thi bo ham for
        for(int j=i;ds[j]!=null;j++){
            ds[j]=ds[j+1]; // xoa sinh vien do bang cach gan tham chieu ds[j] = ds[j+1] bang vong lap for
        }
    }

    public static void main(String[] args) {
        // TODO:
        // bai 6 : 
        
        System.out.println("\nIn ra Info: ");
        // khoi tao voi 3 tham so
        Student stu=new Student("Do Minh Kha","17020827","17020827@vnu.edu.vn"); 
        System.out.println("Ten cua sinh vien la : "+stu.getName());
        System.out.println("Toan bo thong tin cua sinh vien: ");
        stu.getInfo();
        //end
        
        StudentManagement hs=new StudentManagement();
        System.out.println("\n------ kiem tra same group----------\n ");
        Student stu1 = new Student("Do Minh A","17020827","17020827@vnu.edu.vn"); // khoi tao co tham so
        Student stu2 = new Student("Do Minh B","17020827","17020827@vnu.edu.vn");
       // stu1.setGroup(null);
       stu1.setGroup("INT22041"); // cai dat group
       stu2.setGroup("INT22042");
        if(hs.sameGroup(stu1, stu2)) System.out.println("hai sinh vien "+stu1.getName()+" va "+stu2.getName()+"cung lop");
        else System.out.println("hai sinh vien "+stu1.getName()+" va "+stu2.getName()+" khac lop");
        
        System.out.println("\n---- Student By Group------");
        hs.ds[0]=new Student();    // khoi tao khong co tham so
        hs.ds[1]=new Student();    // khoi tao khong co tham so
        hs.ds[2]=new Student();    // khoi tao khong co tham so
        hs.ds[3]=new Student(stu); // khoi tao sao chep stu
        hs.ds[0].setName("Do Minh A");
        hs.ds[0].setGroup("N1");
        hs.ds[1].setName("Do Minh B");
        hs.ds[1].setGroup(null);
        hs.ds[2].setName("Do Minh C");
        hs.ds[2].setGroup("N1");
        hs.removeStudent(hs.ds[3].getId()); // xoa bo sinh vien 3 qua id
        hs.studentsByGroup();               // thuc hien ham studentsBygroup
    }
}
