import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Book b1 = new Book(s.next(),s.nextInt(), s.next(), s.nextInt());
        Book b2 = new Book(s.next(),s.nextInt(),s.next(),s.nextInt());
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.equals(b2));
    }
}
class Book{
    private String name;
    private int price;
    private String author;
    private int edition;
    public Book(String name,int price,String author,int edition){
        this.name=name;
        this.price=price;
        this.author=author;
        this.edition=edition;
    }
    public String toString(){
        return "name："+name+",price："+price+",author："+author+",edition："+edition;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return edition == book.edition &&
                name.replaceAll("\\s+", "").equalsIgnoreCase(book.name.replaceAll("\\s+", "")) &&
                author.replaceAll("\\s+", "").equalsIgnoreCase(book.author.replaceAll("\\s+", ""));
    }
}