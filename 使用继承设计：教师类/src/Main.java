
class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void work(){

    }
    void show() {
        System.out.print(name+" "+age+" ");
    }
}
class Teacher extends Person{
    private String name;
    private int age;
    private final String xy;
    public Teacher(String name,int age,String xy){
        super(name,age);
        this.name=name;
        this.age=age;
        this.xy=xy;
    }
    public void show(){
        System.out.println(name+" "+age+" "+xy);
    }
    public void work(){
        System.out.println("教师的工作是教学。");
    }
}

public class Main {

    public static void main(String[] args) {

        Teacher t = new Teacher("Li",40,"信工院");
        t.show();
        t.work();
    }
}