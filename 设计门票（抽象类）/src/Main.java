import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Ticket a = new WalkupTicket(in.nextInt());
        System.out.println(a.toString());
        Ticket b = new AdvanceTicket(in.nextInt(), in.nextInt());
        System.out.println(b.toString());
        Ticket c = new StudentAdvanceTicket(in.nextInt(), in.nextInt(), in.nextInt());
        System.out.println(c.toString());
    }
}


abstract class Ticket {
    private int number;
    public Ticket(int number){
        this.number=number;
    }
    public abstract int getPrice();
    public String toString(){
        return "Number:"+number+",Price:"+getPrice();
    }
}

class WalkupTicket extends Ticket {
    public WalkupTicket(int number) {
        super(number);
    }

    public int getPrice() {
        return 50;
    }
}
    class AdvanceTicket extends Ticket {
        protected int leadTime;

        public AdvanceTicket(int number, int leadTime) {
            super(number);
            this.leadTime = leadTime;
        }

        public int getPrice() {
            if (leadTime > 10) {
                return 30;
            } else {
                return 40;
            }
        }

        public int getLeadTime() {
            return leadTime;
        }
    }
    class StudentAdvanceTicket extends AdvanceTicket {
        private int height;

        public StudentAdvanceTicket(int number, int leadTime, int height) {
            super(number, leadTime);
            this.height = height;
        }

        public int getPrice() {
            if (height > 120) {
                if (getLeadTime() > 10) {
                    return 20;
                } else {
                    return 30;
                }
            } else {
                return super.getPrice() / 2;
            }
        }

        public int getLeadTime() {
            return super.leadTime;
        }
    }

