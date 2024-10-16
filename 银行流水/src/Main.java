import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance1= sc.nextInt();
        int withdraw1=sc.nextInt();
        int deposit1=sc.nextInt();
        BankAccount Blance1=new BankAccount();
        Blance1.getbalance(balance1);
        Blance1.getWithdraw(withdraw1);
        Blance1.getDeposit(deposit1);
        if(balance1-withdraw1>0){
            System.out.println("账户的初始余额是:"+balance1);
            System.out.println("取款后,账户的余额是:"+(balance1-withdraw1));
            System.out.println("存款后,账户的余额是:"+(balance1-withdraw1+deposit1));
        }
        else if(balance1<0||withdraw1<0||deposit1<0){
            System.out.println("输入的数据不能为负数");
        }
        else if(balance1-withdraw1<0){
            System.out.println("账户余额不足");
            System.out.println("账户的初始余额是:"+balance1);
        }
    }
}
class BankAccount{
    private int balance,withdraw,deposit;
    public BankAccount(){

    }
    public void getbalance(int balance){
        this.balance=balance;
    }
    public int getWithdraw(int withdraw){
        return balance-withdraw;
    }
    public int getDeposit(int deposit){
        return balance-withdraw+deposit;
    }
}