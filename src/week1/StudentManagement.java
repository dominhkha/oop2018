package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    private Student[] ds=new Student[100];
    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    void studentsByGroup() {
        // TODO:
        int i=0,j;
        int k=0;
        String[] tenLop=new String[100];
        boolean[] d = new boolean[100];
        
        for(i=0;i<100;i++) {
            d[i]=false;
        }
        i=0;
        while(ds[i]!=null){
            if(d[i]==false) {
                tenLop[k]=ds[i].getGroup();
                for(j=0;ds[j]!=null;j++){
                    if(d[j]==false&&ds[j].getGroup().equals(tenLop[k])){
                        d[j]=true;
                    }
                }
                k++;
               // System.out.println(k);
            }
            i++;
        }
        for(i=0;i<k;i++){
            System.out.println("cac hoc sinh thuoc lop "+tenLop[i] +" la : ");
            for(j=0;ds[j]!=null;j++){
                if(ds[j].getGroup().equals(tenLop[i])) ds[j].getInfo();
            } 
        } 
        
    }

    void removeStudent(String id) {
        // TODO:
        int i=0;
        for(i=0;ds[i]!=null;i++)
            if(ds[i].getId().equals(id)) break;
        for(int j=i;ds[j]!=null;j++){
            ds[j]=ds[j+1];
        }
    }

    public static void main(String[] args) {
        // TODO:
        // bai 6 : 
        Student stu=new Student("Do Minh Kha","17020827","17020827@vnu.edu.vn");
        stu.getInfo();
        //end
        StudentManagement hs=new StudentManagement();
        // kiem tra same group : 
        /*
        Student stu1 = new Student("Do Minh A","17020827","17020827@vnu.edu.vn");
        Student stu2 = new Student("Do Minh B","17020827","17020827@vnu.edu.vn");
        if(hs.sameGroup(stu1, stu2)) System.out.println(" hai sinh vien "+stu1.getName()+" va "+stu2.getName()+"cung lop");
        else System.out.println(" hai sinh vien "+stu1.getName()+" va "+stu2.getName()+" cung lop");
        */
        hs.ds[0]=new Student();
        hs.ds[1]=new Student();
        hs.ds[2]=new Student();
        hs.ds[3]=new Student();
        hs.ds[3].setId("123");
        hs.ds[0].setName("Do Minh A");
        hs.ds[0].setGroup("N1");
        hs.ds[1].setName("Do Minh B");
        hs.ds[1].setGroup("N2");
        hs.ds[2].setName("Do Minh C");
        hs.ds[2].setGroup("N1");
        hs.removeStudent(hs.ds[3].getId());
        hs.studentsByGroup();
    }
}
