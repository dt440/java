import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        Flyable[] f = { new Parrot(), new Superman() };

        for (Flyable k : f) {
            k.fly();
        }
        System.out.println(i);

        Bird[] a = { new Parrot(), new Chicken() };

        for ( Bird b : a ) {
            b.sing();
        }

        in.close();
    }
}

/* 请在这里填写答案 */
class Bird{
    public void sing(){
        System.out.println("This bird sings");
    }
}

interface Flyable{
    void fly();
}

class Chicken extends Bird{
    public void sing(){
        System.out.println("Chicken sings");
    }
}

class Superman implements Flyable{
    public void fly(){
        System.out.println("Superman flies");
    }
}

class Parrot extends Bird implements Flyable{
    public void fly(){
        System.out.println("Parrot flies");
    }
    public void sing(){
        System.out.println("Parrot sings");
    }
}