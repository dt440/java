import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pupil zhangsan=new Pupil();
        zhangsan.setSchool(sc.next());
        System.out.println("我的学校是"+zhangsan.getSchool());
        zhangsan.breathe();
        zhangsan.eat();
        zhangsan.sleep();
        zhangsan.think();
    }
}
interface Biology{
     public void breathe();
}
interface Animal{
      public void  eat();
      public void sleep();
}
class Person implements Animal,Biology{
    public void think(){
        System.out.println("我喜欢思考");
    }

        public void breathe() {
            System.out.println("我喜欢呼吸新鲜空气");
        }


        public void eat() {
            System.out.println("我会按时吃饭");
        }
    public void sleep(){
        System.out.println("早睡早起身体好");
    }
}
class Pupil extends Person{
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    private String school;

}