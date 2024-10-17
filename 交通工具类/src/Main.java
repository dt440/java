import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String kind1=sc.next();
        double speed1=sc.nextInt();
        String Color1=sc.next();
        String kind2=sc.next();
        double speed2=sc.nextInt();
        String Color2=sc.next();
        System.out.println("第一辆是"+kind1+"，时速为"+speed1+"km/h，颜色为"+Color1);
        System.out.println("第二辆是"+kind2+"，时速为"+speed2+"km/h，颜色为"+Color2);

    }
}