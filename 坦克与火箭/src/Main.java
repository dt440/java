//在这里给出函数被调用进行测试的例子。例如：
class Car{
    public void move()    {
        System.out.println("running");
    }
}
class Plane{
    public void move()    {
        System.out.println("flying");
    }
}

interface Weapon{
    public abstract void shoot();
}
class Tank extends Car implements Weapon{
    public void shoot(){
        System.out.println("发射大炮");
    }
}
class Fighter extends Plane implements Weapon{
    public void shoot(){
        System.out.println("发射火箭");
    }
}

public class Main{
    public static void main(String argv[]){
        Tank tank = new Tank();
        Fighter fighter = new Fighter();
        tank.move();
        tank.shoot();
        fighter.move();
        fighter.shoot();
        Weapon tank2 = new Tank();
        Weapon fighter2= new Fighter();
        tank2.shoot();
        fighter2.shoot();
    }
}
