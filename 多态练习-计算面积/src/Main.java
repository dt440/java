public class Main{
    public static void main(String[] args) {
        Rectangle r=new Rectangle("长方形","蓝色",3.2,4.5);
        System.out.println("矩形的颜色是："+r.getColor()+",面积是："+r.findArea());
        Circle c=new Circle("圆形","红色",3.4);
        System.out.println("圆形的颜色是："+c.getColor()+",圆形的面积是："+c.findArea()+"01");
    }

}

abstract class GeometricObject{
    private String color;
    private String name;

    public GeometricObject(String name,String color){
        this.color=color;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double findArea();
}

class Circle extends GeometricObject{
    private double radius;

    public Circle(String name,String color,double radius){
        super(name,color);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return radius*radius*Math.PI;
    }
}

class Rectangle extends GeometricObject{
    private double width;


    public Rectangle(String name,String color,double width,double height){
        super(name,color);
        this.width=width;
        this.height=height;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findArea(){
        return width*height;
    }
}