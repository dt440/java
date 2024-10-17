import java.util.Scanner;
class Box{
private boolean full;
private int width;
private int height;
private int lenght;

public Box(int width,int height,int lenght) {
    full = false;
    this.width = width;
    this.height = height;
    this.lenght = lenght;
}

public boolean isFull() {
    return full;
}

public void setFull(boolean full) {
    this.full = full;
}

public int getWidth() {
    return width;
}

public void setWidth(int width) {
    this.width = width;
}

public int getHeight() {
    return height;
}

public void setHeight(int h) {
    this.height = height;
}

public int getLenght() {
    return lenght;
}

public void setLenght(int lenght) {
    this.lenght = lenght;
}

public int getVolumn() {
return width*height*lenght;
}


public String toString(){
    return "Box is " + (full ? "full" : "empty") + ", The Volumn is " + getVolumn();
}
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int w = input.nextInt();
        int h = input.nextInt();
        int l = input.nextInt();
        Box box1 = new Box(w,h,l);
        System.out.println(box1.toString());
        box1.setWidth(5);
        box1.setFull(box1.isFull());
        System.out.println(box1.toString());
    }
}