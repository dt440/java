import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        Oval oval = new Oval(a,b);
        System.out.println("The area of Oval(a:"+a+",b:"+b+") is "+oval.area());
        System.out.println("The perimeterof Oval(a:"+a+",b:"+b+") is " +oval.perimeter());
    }
}
abstract class Shape{
    protected static final double PI = 3.1415926;

    abstract double area();

    abstract double perimeter();
}
class Oval extends Shape{
    private double a;
    private double b;
    public Oval(){

    }
    public Oval(double a,double b){
        this.a=a;
        this.b=b;
    }

    public double area(){
        return PI*a*b;
    }

    public double perimeter(){
        return 2*PI*Math.sqrt((a*a+b*b)/2);
    }

    public String toString(){
        return "Oval(a:"+a+",b:"+b+")";
    }
}