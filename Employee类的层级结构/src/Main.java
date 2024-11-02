import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Employee[] e = new Employee[3];
        e[0] = new SalariedEmployee(in.next(), in.next(), in.nextDouble());
        e[1] = new HourlyEmployee(in.next(), in.next(), in.nextDouble(), in.nextDouble());
        e[2] = new CommissionEmployee(in.next(), in.next(), in.nextDouble(), in.nextDouble());
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i].getSalary());
            System.out.println(e[i]);
        }
    }
}

class Employee {
    private String name;
    private String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return 0.0; // This should be overridden by subclasses
    }

    public String toString() {
        return "[name=" + name + ",id=" + id ;
    }
}

class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, String id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getSalary() {
        return monthlySalary;
    }

    public String toString() {
        return "SalariedEmployee" + super.toString() + "][monthSalary=" + monthlySalary + "]";
    }
}

class HourlyEmployee extends Employee {
    private double hourSalary;
    private double workHours;

    public HourlyEmployee(String name, String id, double hourSalary, double workHours) {
        super(name, id);
        this.hourSalary = hourSalary;
        this.workHours = workHours;
    }

    public double getHourSalary() {
        return hourSalary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public double getSalary() {
        return hourSalary * workHours;
    }

    public String toString() {
        return "HourlyEmployee" + super.toString() + "][hourSalary=" + hourSalary + ",workhour=" + workHours + "]";
    }
}

class CommissionEmployee extends Employee {
    private double commissionRatio;
    private double sales;

    public CommissionEmployee(String name, String id, double commissionRatio, double sales) {
        super(name, id);
        this.commissionRatio = commissionRatio;
        this.sales = sales;
    }

    public double getCommissionRatio() {
        return commissionRatio;
    }

    public double getSales() {
        return sales;
    }

    public double getSalary() {
        return commissionRatio * sales;
    }

    public String toString() {
        return "CommissionEmployee" + super.toString() + "][commissionRatio=" + commissionRatio + ",sale=" + sales + "]";
    }
}
