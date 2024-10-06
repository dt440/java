package 计算圆柱体.src;

import java.util.Scanner;
public class 计算圆柱体 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double r=scanner.nextDouble();
        double h=scanner.nextDouble();
        Circle c = new Circle(r);
        Column column=new Column();
        column.setBottom(c);
        column.setHeight(h);
        System.out.printf("底面面积和周长分别为：%.2f %.2f\n",column.getBottom().getArea(),column.getBottom().getLength());
        System.out.printf("体积为：%.2f\n",column.getVolume());
        scanner.close();
    }
}
class Circle{
    double radius,Height;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getLength(){
        return 2*Math.PI*radius;
    }
}
class Column{
    private Circle bottom;
    private double Height;

    public void setBottom(Circle bottom) {
        this.bottom = bottom;
    }

    public Circle getBottom() {
        return bottom;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public double getHeight() {
        return Height;
    }
    public double getVolume(){
        return Height*bottom.getArea();
    }
}
