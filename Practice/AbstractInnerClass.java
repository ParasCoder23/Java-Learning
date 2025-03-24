package Practice;

abstract class AbstractA{
    abstract public void show();
}
public class AbstractInnerClass {
    public static void main(String[] args) {
        AbstractA obj1 = new AbstractA() {
            @Override
            public void show() {
                System.out.println("in show method");
            }
        };
        // Here we are not creating object of abstract class whereas we are creating an inner class
        obj1.show();
    }
}
