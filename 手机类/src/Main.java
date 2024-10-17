import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CellPhone c1 = new CellPhone(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        CellPhone c2 = new CellPhone(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());

        System.out.println(c1.equals(c2));
        System.out.println(c1);
        System.out.println(c2);
    }
}

class CellPhone {
    private String model;//型号
    private int memory;//内存大小
    private int storage;//存储空间
    private int price;
    public CellPhone(String model, int memory, int storage, int price) {
        this.model = model;
        this.memory = memory;
        this.storage = storage;
        this.price = price;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CellPhone other = (CellPhone) obj;
        if (memory != other.memory)
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (storage != other.storage)
            return false;
        return true;
    }
    public String toString() {
        return "CellPhone [model:" + model + ", memory:" + memory + ", storage:" + storage + ", price:" + price + "]";
    }
}

