package 求圆面积.src;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int k,d;//k=c2.r,d=c3.r
        k=sc.nextInt();
        d=sc.nextInt();
        Circle c1=new Circle();
        System.out.println(c1.toString());
        System.out.println(c1.getArea()+"");
        Circle c2=new Circle();
        System.out.println(c2.toString());
        System.out.println(c2.getArea()+"");
        c2.setRadius(k);
        System.out.println(c2.toString());
        System.out.println(c2.getArea()+"");
        Circle c3=new Circle(d);
        System.out.println(c3.toString());
        System.out.println(c3.getArea()+"");
        sc.close();
    }
}
class Circle {
    private int radius;

    public Circle() {
        this.radius = 2;
        System.out.println("This is a constructor with no para.");
    }

    public Circle(int radius) {
        if (radius <= 0) {
            radius = 2;
        } else {
            this.radius = radius;
        }
        System.out.println("This is a constructor with para.");
    }

    public void setRadius(int radius) {
        if (radius <= 0) {
            radius = 2;
        } else {
            this.radius = radius;
        }
    }

    public int getRadius() {
        return radius;
    }

    public String getArea() {
        double area=radius * radius * Math.PI;
        return String.format("%.2f",area);
    }

    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}