import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HiINC[] hi = new HiINC[n];
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            if (type.equals("bicycle")) {
                hi[i] = new Bicycle(sc.next());
            } else {
                hi[i] = new Car(sc.next(), sc.nextDouble());
            }
        }
        double rent = HiINC.calculateRent(hi, sc.nextInt());
        System.out.printf("%.2f", rent);
    }
}


class HiINC{
    public double getRent(){
        return 0;
    };
    public static double calculateRent(HiINC[] hi, int days){
        double totalRent = 0;
        for (HiINC vehicle:hi){
            totalRent += vehicle.getRent()*days;
        }
        return totalRent;
    };
}

class Car extends HiINC{
    private String plateNumber;
    private double sellingPrice;

    public Car(String plateNumber,double sellingPrice){
        this.plateNumber=plateNumber;
        this.sellingPrice=sellingPrice;
    }

    public double getRent() {
        return sellingPrice*0.001;
    }
}

class Bicycle extends HiINC{
    private String plateNumber;
    public Bicycle(String plateNumber){
        this.plateNumber=plateNumber;
    }

    @Override
    public double getRent() {
        return 12.0;
    }
}
