import java.util.Scanner;

class Player{
    String name;
    Player(String name){
        this.name = name;
    }
    int show() {  //出拳方法
        int show = ( int ) (Math.random() * 10 ) %3  +1;
        return show ;
    }
}
/* 请在这里填写答案 */
class ComputerPlayer extends Player{
    public ComputerPlayer(String name){
        super(name);
        this.name=name;
    }
}
class PersonPlayer extends Player{
    public PersonPlayer(String name){
        super(name);
        this.name=name;
    }
    int show(){
        Scanner sc=new Scanner(System.in);
        int show=sc.nextInt();
        return show;
    }
}
class Game{
    int A;
    int B;
    public Game(Player A,Player B){
        this.A=A.show();
        this.B=B.show();
    }
    public void start(){
        if(A==B){
            System.out.println("A Draw.");
        } else if ((A==1&&B==2)||(A==2&&B==3)||(A==3&&B==1)) {
            System.out.println("Winner is personPlayer.");
        }else {
            System.out.println("Winner is computerPlayer.");
        }
    }
}
public class Main {

    public static  void main(String[] args) {
        ComputerPlayer c = new ComputerPlayer ("computer");
        PersonPlayer  p = new PersonPlayer("player ") ;
        Game g = new Game( c ,p );
        g.start();
    }
}