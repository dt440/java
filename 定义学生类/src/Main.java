import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name1=sc.next();
        double score1=sc.nextDouble();
        Student stu1=new Student();
        stu1.setName(name1);
        stu1.setscore(score1);
        String name2=sc.next();
        double score2=sc.nextDouble();
        Student stu2=new Student(name2,score2);
        stu2.getname(name2);
        stu2.getscore(score2);
        System.out.println("stu1: name="+name1+",score="+score1);
        System.out.println("stu2: name="+name2+",score="+score2);
    }
}
class Student{
    private String name;
    private Double score;
    public Student(){

    }
public void setName(String name){
        this.name=name;
}
public void setscore(double score){
        this.score=score;
}
public Student(String name,double score){

}
public void getname(String name){
        this.name=name;
}
public void getscore(double score){
        this.score=score;
}
}