import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Furniture f = new Furniture(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println(f.getHeight());
        System.out.println(f.getLength());
        System.out.println(f.getWidth());
    }
}
 class Furniture{
    private int Height,Length,Width;
    public Furniture(int Length,int Width,int Height){
        this.Length=Length;
        this.Width=Width;
        this.Height=Height;
    }
    public int getHeight(){
        return this.Height;
    }
     public int getLength(){
         return this.Length;
     }
     public int getWidth(){
         return this.Width;
     }
}
