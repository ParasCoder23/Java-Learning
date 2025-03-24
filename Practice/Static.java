package Practice;

class Mobile{
    String brand;
    int price;
    static String name;

    public Mobile() {
    }

    static{
        // static blocks calls first because firstly when object created then
        // Class Loading --> first step (therefore static calls first)
        // Objects initialisation --> second step

        System.out.println("in static block");
        name = "SmartPhone";
    }
    public Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
        System.out.println("in constructor");
    }

    public void getData(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void get(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }

}

public class Static {
    public static void main(String[] args) throws ClassNotFoundException{

//        Practice.Mobile[] obj = new Practice.Mobile[2];
//        obj[0] = new Practice.Mobile("Samsung", 200);
//        obj[1] = new Practice.Mobile("Lenovo", 350);
//
//        for(Practice.Mobile o : obj){
//            o.getData();
//        }
//
//        System.out.println(Practice.Mobile.name);
//
//        Practice.Mobile.get(obj[1]);

        // For only Class Loading not wanted to instantiate object
        Class.forName("Practice.Mobile");
        new Mobile().getData(); // Anonymous
    }
}
