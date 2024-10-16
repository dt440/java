import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String k="off";
        int speed=1;
        String on="off";
        double radius=5.0;
        String color="white";
        Fan Fan1=new Fan();
        Fan1.get(speed,on,radius,color);
        int ispeed=sc.nextInt();
        String ion= sc.next();
        double iradius=sc.nextDouble();
        String icolor=sc.next();
        Fan iFan=new Fan(ispeed,ion,iradius,icolor);
        iFan.get(ispeed,ion,iradius,icolor);
        System.out.println("\n-------\nDefault\n-------");
        System.out.println("speed "+speed+"\ncolor "+color+"\nradius "+radius+"\nfan is "+k);
        System.out.println("-------\nMy Fan\n-------");
        if(ion.equals("True")) k = "on";
        System.out.println("speed "+ispeed+"\ncolor "+icolor+"\nradius "+iradius+"\nfan is "+k);
    }
}
class Fan{
    private int speed;
    private String on;
    private double radius;
    private String color;
    public Fan(){}
    public void get(int speed,String on,double radius,String color){
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }
    public Fan(int Speed,String On,double Radius,String Color)
    {

    }
}