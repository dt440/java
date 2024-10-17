import java.util.Scanner;
class TDVector {
    private double x;
    private double y;
    public String toString() {
        return "("+this.x+","+this.y+")";
    }
    public TDVector(){
        x=0.0;
        y=0.0;
    }
public TDVector(double x,double y){
        this.x=x;
        this.y=y;
    }
    public TDVector(TDVector b){
        x=b.x;
        y=b.y;
    }
    public double setY(double z){
        return this.y=z;
    }
    public double setX(double z){
        return this.x=z;
    }
    public TDVector add(TDVector c){
        TDVector a=new TDVector();
        a.x=this.x+c.x;
        a.y=this.y+c.y;
        return a;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}
public class Main {
    public static void main(String[] args) {
        TDVector a = new TDVector();  /* 无参构造，向量的x和y默认为0 */
        Scanner sc = new Scanner(System.in);
        double x,y,z;
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        TDVector b = new TDVector(x, y);  /* 按照参数构造向量的x和y */
        TDVector c = new TDVector(b);  /* 按照向量b构造向量 */
        a.setY(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        c.setX(z);
        a = b.add(c);
        System.out.println(a);
        System.out.println("b.x="+b.getX()+" b.y="+b.getY());
        sc.close();
    }
}