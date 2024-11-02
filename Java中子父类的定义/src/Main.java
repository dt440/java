
public class Main
{
    public static void main(String[] args)
    {
        Car car = new Car();
        car.SetKind("BMW");
        car.SetSpeed(300);
        car.SetColor("white");
        car.setPassenger(7);
        car.print(car);
        Car c = new Car(100,"BenZi","Blace",5);
        c.print(c);
    }
}

class Vehicle {
    private double speed;
    private String kind;
    private String color;

    // 空参构造方法
    public Vehicle() {
        this.speed = 0.0;
        this.kind = "";
        this.color = "";
    }

    // 有参构造方法
    public Vehicle(double speed, String kind, String color) {
        this.speed = speed;
        this.kind = kind;
        this.color = color;
    }

    // 设置速度
    public void SetSpeed(double speed) {
        this.speed = speed;
    }

    // 获取速度
    public double getSpeed() {
        return this.speed;
    }

    // 设置颜色
    public void SetColor(String color) {
        this.color = color;
    }

    // 获取颜色
    public String getColor() {
        return this.color;
    }

    // 设置类别
    public void SetKind(String kind) {
        this.kind = kind;
    }

    // 获取类别
    public String getKind() {
        return this.kind;
    }
}

class Car extends Vehicle {
    private int passenger;

    // 空参构造方法
    public Car() {
        super();
        this.passenger = 0;
    }

    // 有参构造方法
    public Car(double speed, String kind, String color, int passenger) {
        super(speed, kind, color);
        this.passenger = passenger;
    }

    // 设置座位数
    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    // 获取座位数
    public int getPassenger() {
        return this.passenger;
    }

    // 打印Car对象的属性
    public void print(Car c1) {
        System.out.println(c1.getKind() + "的速度是：" + c1.getSpeed() + "km/h, 颜色是：" + c1.getColor() + "色, 座位数是 ：" + c1.getPassenger() + "个。");
    }
}