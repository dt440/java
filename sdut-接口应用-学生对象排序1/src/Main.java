
import java.util.*;
public class Main {
    public static void main(String[] args)  {
        List<Student> list=new ArrayList<Student>();
        list.add(new Student(10,"wangli",89,78,88));
        list.add(new Student(28,"Katefd",89,68,88));
        list.add(new Student(35,"Caoyue",69,78,86));
        list.add(new Student(36,"zhansa",69,78,83));
        list.add(new Student(47,"wanhua",98,88,88));
        list.add(new Student(52,"wanhai",69,88,89));
        list.add(new Student(63,"liwuab",89,78,88));
        Collections.sort(list);
        for(Student stu:list)
        {
            System.out.println(stu);
        }
    }
}

/* 请在这里填写完整的Student类的设计代码 */
//请按如下提示完善Student类的设计
//内含如下属性：学号（int id)、姓名（String name)、数学成绩（int math)、英语成绩（int english)、计算机成绩（int cs)。


class Student implements Comparable<Student> {
    int id;
    String name;
    int math;
    int english;
    int cs;

    //补充代码段1

    public Student(int id,String name,int math,int english,int cs){
        this.id=id;
        this.name=name;
        this.math=math;
        this.english=english;
        this.cs=cs;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", math=" + math +
                ", english=" + english +
                ", cs=" + cs +
                '}';
    }

    //补充代码段2
    public int compareTo(Student o){
        if(this.math!=o.math){
            return this.math-o.math;
        } else if (this.english!=o.english) {
            return o.english-this.english;
        }else if(this.cs!=o.cs){
            return this.cs-o.cs;
        }
        else{
            return this.id-o.id;
        }
    }
}