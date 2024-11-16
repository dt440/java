import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        n= sc.nextInt();
        for(int i=1;i<=n; i++){
            int x=0;
            x=sc.nextInt();
            if(x==0){
                Student a=new Student(sc.nextInt(), sc.next(), sc.nextInt(), sc.next(),sc.nextDouble());

                System.out.println("Student [id="+a.id+", name="+a.name+", bir="+a.bir+", major="+a.getMajor()+", score="+a.getScore()+"]");
            }
            else if(x==1){
                Teacher a=new Teacher(sc.nextInt(), sc.next(), sc.nextInt(), sc.next(),sc.nextDouble());
                System.out.println("Teacher [id="+a.id+", name="+a.name+", bir="+a.bir+", title="+a.getTitle()+", salary="+a.getSalary()+"]");
            }
        }
    }
}

abstract class Person{
    protected int id;
    protected String name;
    protected int bir;
    public Person(int id,String name,int bir){
        this.id=id;
        this.name=name;
        this.bir=bir;
    }
}
class Student extends Person{
    private String major;
    private double score;

    public String getMajor() {
        return major;
    }

    public double getScore() {
        return score;
    }

    public Student(int id, String name, int bir, String major, double score){
        super(id,name,bir);
        this.major=major;
        this.score=score;
    }
}
class Teacher extends Person{
    private String title;
    private double salary;

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }

    public Teacher(int id, String name, int bir, String title, double salary){
        super(id,name,bir);
        this.title=title;
        this.salary=salary;
    }
}