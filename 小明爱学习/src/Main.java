public class Main {

    public static void main(String[] args) {
        Student xiaoming = new Student();
        xiaoming.learn(new JavaCourse("Java")); //学习Java课程
        xiaoming.learn(new PythonCourse("Python"));//学习Python课程
    }

}

class Student{
    public void learn(Course course){
    course.show();
        System.out.println("study study hard,day day up");
    }
}
//抽象类
abstract class Course{
    private String courseName;
    //定义抽象方法
    public abstract void show();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
//Java课程继承Course
class JavaCourse extends Course{
//构造方法
public JavaCourse(String courseName) {
    super(courseName);
}
//重写show方法
public void show(){
    System.out.println("this is Java course,far far ");
}
}
class PythonCourse extends Course{
//构造方法

public PythonCourse(String courseName) {
    super(courseName);
}
//重写show方法
    public void show() {
        System.out.println("this is Python course,very clear");
    }
}




