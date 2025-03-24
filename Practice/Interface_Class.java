package Practice;

interface Interface{
    void printData();
    default void getData(){
        System.out.println("Hello in Default Function");
    }
    static void printData2(){
        System.out.println("Hello in Static Function");
    }
}
public class Interface_Class implements Interface{
    public static void main(String[] args) {
        Interface_Class i = new Interface_Class();
        i.printData();
        i.getData();
        Interface.printData2();
    }

    @Override
    public void printData() {
        System.out.println("Hello Everyone!");
    }
}
