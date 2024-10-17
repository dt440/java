import java.util.Scanner;

class Rectangle{
    private double w,h;
    public Rectangle(double w,double h){
        this.w=w;
        this.h=h;
    }
    public double getArea(){
       return w*h;
    }
    public double getPerimeter(){
        return w+w+h+h;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double w = input.nextDouble();
        double h = input.nextDouble();
        Rectangle myRectangle = new Rectangle(w, h);
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getPerimeter());

        input.close();
    }
}
