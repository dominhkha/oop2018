package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String id;
    private String group;
    private String email;
    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name="student";
        id="000";
        group="INT22041";
        email="uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        name=n;
        id=sid;
        email=em;
        group="INT22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        name=s.name;
        id=s.id;
        group=s.group;
        email=s.email;
    }

    String getInfo() {
        // TODO:
        System.out.print( "ten: "+ name+"\n"+"id: " +id+"\n"+"group: " +group+"\n"+"email: "+email);
        return null; // xóa dòng này sau khi cài đặt
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setGroup(String group){
        this.group=group;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getName(){
        return name;
    }
     public String getId(){
        return id;
    }
    public String getGroup(){
        return group;
    }
    public String getEmail(){
        return email;
    }
}
