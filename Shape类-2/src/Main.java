import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a= sc.nextDouble();
        double c= sc.nextDouble();
        double k= sc.nextDouble();
        double r=sc.nextDouble();
        Square square=new Square(a);
        Rectangle rectangle=new Rectangle(c,k);
        Circle circle=new Circle(r);
        System.out.println(String.format("%.2f %.2f",square.Perimeter(),square.Area()));
        System.out.println(String.format("%.2f %.2f",rectangle.Perimeter(),rectangle.Area()));
        System.out.println(String.format("%.2f %.2f",circle.Perimeter(),circle.Area()));
    }
}
abstract class Shape{
    abstract double Perimeter();
    abstract double Area();
}
class Square extends Shape{
    private double a;
    public Square(double a){
        this.a=a;
    }
    public double Area(){
        return a*a;
    }
    public double Perimeter(){
        return a*4;
    }
}
class Rectangle extends Shape{
    private double c;
    private double k;
    public Rectangle(double c,double k){
        this.c=c;
        this.k=k;
    }
    public double Area(){
        return c*k;
    }
    public double Perimeter(){
        return c*2+k*2;
    }
}
class Circle extends Shape{
    private double r;
    public Circle(double r){
        this.r=r;
    }
    public double Area(){
        return r*r*3.1415926;
    }
    public double Perimeter(){
        return 2*3.1415926*r;
    }
}