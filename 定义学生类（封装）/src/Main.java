import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //调用无参构造方法，并通过setter方法进行设值
        String sid1 = sc.next();
        String name1 = sc.next();
        int age1 = sc.nextInt();
        String major1 = sc.next();
        Student student1 = new Student();
        student1.setSid(sid1);
        student1.setName(name1);
        student1.setAge(age1);
        student1.setMajor(major1);
        //调用有参构造方法
        String sid2 = sc.next();
        String name2 = sc.next();
        int age2 = sc.nextInt();
        String major2 = sc.next();
        Student student2 = new Student(sid2, name2, age2, major2);
        //对学生student1和学生student2进行输出
        student1.print();
        student2.print();
    }
}
class Student{
    private String sid,name,major;
    private int age;
    public  Student(){

}
    public Student(String sid, String name, int age, String major){
        this.sid=sid;
        this.name=name;
        this.age=age;
        this.major=major;
    }
        public void setSid (String sid){
            this.sid = sid;
        }
        public void setName (String name){
            this.name = name;
        }
        public void setAge ( int age){
            this.age = age;
        }
        public void setMajor (String major){
            this.major = major;
        }

    public void print () {
        System.out.println("学号：" + sid + ",姓名:" + name + ",年龄:" + age + ",专业:" + major);
    }
}
