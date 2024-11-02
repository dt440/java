import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i < n; i++) {
            String str = input.next();
            if(str.equals("Circle")) {
                Circle c = new Circle(input.nextDouble());
                System.out.println("The area of " + c.toString() + " is " + c.getArea());
                System.out.println("The perimeter of " + c.toString() + " is "+ c.getPerimeter());
            } else if(str.equals("Cylinder")) {
                Cylinder r = new Cylinder(input.nextDouble(), input.nextDouble());
                System.out.println("The area of " + r.toString() + " is " + r.getArea());
                System.out.println("The volume of " + r.toString() + " is "    + r.getVolume());
            }
        }
    }
}

class Circle{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(){
        this.radius=0;
    }

    public void setRadius(double r){
        this.radius=r;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public String toString(){
        return "Circle(r:"+radius+")";
    }
}

class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius,double height){
        super(radius);
        this.height=height;
    }

    public Cylinder(){
        super();
        this.height=0;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        return 2*Math.PI*getRadius()*(getRadius()+height);
    }

    public double getVolume(){
        return Math.PI*getRadius()*getRadius()*height;
    }

    public String toString(){
        return "Cylinder(r:"+getRadius()+",h:"+height+")";
    }
}