package JLine.src;

import java.util.Scanner;

class JLine {
    private int a,b,c;
    public JLine(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void getSlope(){
        System.out.println("slope is assigned"+" "+-(double)a/b);
    }
    public Boolean isOnLine(int x,int y){
        if(a*x+b*y+c==0){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int x=input.nextInt();
        int y=input.nextInt();
        if(a!=0&&b!=0){
            JLine line = new JLine(a, b, c);
            line.getSlope();
            if(line.isOnLine(x, y))
                System.out.println("Point("+x+","+y+") on line.");
            else
                System.out.println("Point("+x+","+y+") is not on line.");
        }
    }
}


