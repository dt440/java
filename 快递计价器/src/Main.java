import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Express[] ex = new Express[n];
        for (int i = 0; i < ex.length; i++) {
            if (sc.next().equals("SL"))
                ex[i] = new SLExpress(sc.nextInt());
            else
                ex[i] = new DDExpress(sc.nextInt());
        }

        System.out.println(CaicaiStation.calculate(ex));
        sc.close();
    }
}
/* 请在这里填写答案 */
abstract class Express{
     protected int weight;

     public Express(int weight){
         this.weight=weight;
     }
    public int getWeight() {
      return weight;
    }
    public abstract int getTotal();
}

class SLExpress extends Express{
    public SLExpress(int weight) {
        super(weight);
    }
    public int getTotal(){
        return (weight-1)*2+12;
}
}
class DDExpress extends Express{
    public DDExpress(int weight){
        super(weight);
    }
    public int getTotal(){
        return 5+(weight-1)*1;
    }
}

class CaicaiStation{
    public static int calculate(Express[] ex){
        int sum=0;
        for(Express e:ex){
            sum+=e.getTotal();
        }
        return sum;
    }
}