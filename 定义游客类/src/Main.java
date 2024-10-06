import java.util.Scanner;
class Tourist{
    int age;
     int age(){
        return age;
    }
    void show(){
         if(age<18||age>60){
             System.out.println("年龄为："+age+"，免费");
         }
         else{
             System.out.println("年龄为："+age+"，价格为20元");
         }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tourist v = new Tourist();
        v.age = input.nextInt();
        v.show();
    }
}
