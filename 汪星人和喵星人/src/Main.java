
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        Dog wang = new Dog(name1);
        wang.makeSound();
        if (wang instanceof CanJump) //如果dog对象所在类实现了CanJump接口，则调用jump()方法
            wang.jump();
        Mammal miao = new Mammal() { //匿名类，类中实现了makeSound()方法
             void makeSound() {
                System.out.println(getName() + ":喵喵喵!");
            }
        };
        String name2 = sc.next();
        miao.setName(name2);
        miao.makeSound();
    }
}
interface CanJump{
     void jump();
}

abstract class Mammal{
    protected String name;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    abstract void makeSound();
}
class Dog extends Mammal implements CanJump{

    public  Dog(String name){
        this.name=name;
    }
    public void jump(){
        System.out.println(getName()+" can jump high!");;
    }
    void makeSound(){
        System.out.println(getName()+":汪汪汪!");
    }
}