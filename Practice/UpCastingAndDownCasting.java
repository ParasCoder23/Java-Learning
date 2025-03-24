package Practice;

class A{
    public void show(){
        System.out.println("Hello in Practice.A");
    }
}

class B extends A{
    @Override
    public void show() {
        System.out.println("Hello in Practice.B");
    }
}

public class UpCastingAndDownCasting {
    public static void main(String[] args) {
        A obj1 = new A(); // Hello in Practice.A
        obj1.show();
        B obj2 = new B(); // Hello in Practice.B
        obj2.show();

        A obj3 = new B(); // Hello in Practice.B --> Object of Practice.B class but reference of Practice.A class
        obj3.show();

        A obj4 = (A) new B(); // Upcasting --> moving from Practice.B to Practice.A(Parent)
        obj4.show();

        B obj5 = (B) obj4 ;// DownCasting --> moving from Practice.A to Practice.B
        obj5.show();
    }

}
