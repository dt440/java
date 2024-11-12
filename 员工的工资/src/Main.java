import java.util.Scanner;
class Employee{
    int salary;
    public int getSalary(){
        return salary;
    }
}

class Manager extends Employee{//经理
    int managerSalary;
    public Manager(int managerSalary){
        this.managerSalary=managerSalary;
    }
    public int getSalary() {
    return this.managerSalary;
    }
}
class Salesman extends Employee{//销售人员
    int salemanSalary;
    int salemanRaise;
    public  Salesman(int salemanSalary,int salemanRaise) {
        this.salemanSalary = salemanSalary;
        this.salemanRaise = salemanRaise;
    }
    public int getSalary(){
        return this.salemanSalary+this.salemanRaise;
    }
}
class Worker extends Employee{//工人
    int workerEveryday;
    int workerDays;
    public Worker(int workerEveryday,int workerDays) {
        this.workerEveryday = workerEveryday;
        this.workerDays = workerDays;
    }
    public int getSalary() {
        return this.workerDays*this.workerEveryday;
    }
}

public class Main{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int managerSalary = scan.nextInt();
        int salemanSalary = scan.nextInt();
        int salemanRaise = scan.nextInt();
        int workerEveryday = scan.nextInt();
        int workerDays = scan.nextInt();

        Employee e1 = new Manager(managerSalary);
        Employee e2 = new Salesman(salemanSalary, salemanRaise);
        Employee e3 = new Worker(workerEveryday, workerDays);

        System.out.println(e1.getSalary());
        System.out.println(e2.getSalary());
        System.out.println(e3.getSalary());

        scan.close();
    }
}
