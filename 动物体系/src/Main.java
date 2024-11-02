import java.util.Scanner;
public class Main{
    public static void main(String args[]) {

        Scanner s = new Scanner (System.in);
        int i = s.nextInt();
        Animal a = null;
        if (i==1) {
            a = new Cat(s.next(), s.next(), s.next());
        } else if (i==2) {
            a = new Dog(s.next(), s.next(), s.nextInt());
        }
        TestAnimal.introduce(a);
        TestAnimal.action(a);
    }
}

abstract class Animal{
    protected String name;
    protected String color;

    public Animal(String name,String color) {
        this.name=name;
        this.color=color;
    }
    public abstract void introduce();
}

class Dog extends Animal{
    private int iq;

    public Dog(String name,String color,int iq){
        super(name,color);
        this.iq=iq;
    }

    @Override
    public void introduce() {
        System.out.println("My name is "+name+", my color is "+color+", my IQ is "+iq);
    }

    public void catchFrisbee(){
        System.out.println("catch frisbee");
    }
}

class Cat extends Animal{
    private String eyecolor;

    public Cat(String name,String color,String eyecolor){
        super(name,color);
        this.eyecolor=eyecolor;
    }

    public void introduce(){
        System.out.println("My name is " + name + ", my color is " + color + ", my eyecolor is " + eyecolor);
    }

    public void catchMouse(){
        System.out.println("catch mouse");
    }
}

class TestAnimal{
    public static void introduce(Animal animal){
        animal.introduce();
    }

    public static void action(Animal animal){
        if(animal instanceof Dog){
            ((Dog)animal).catchFrisbee();
        }
        else if(animal instanceof Cat){
            ((Cat)animal).catchMouse();
        }
    }
}