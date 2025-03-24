package Practice;

enum Status{
    Running, Failed, Pending, Success
}

enum Laptop{
    Macbook(2000), XPS(2500), ThinkPad(1500);

    private int price;

    Laptop(int price) {
        this.price = price;
    }

    int getPrice(){
        return this.price;
    }
}
public class Enum {
    public static void main(String[] args) {
        Status st = Status.Pending;
        System.out.println(st);

        Status[] ss = Status.values();

        for(Status s : ss){
            System.out.println(s + " : " + s.ordinal());
        }

        Laptop[] lap = Laptop.values();

        for(Laptop laptop : lap){
            System.out.println(laptop + " : " + laptop.getPrice());
        }
    }
}
