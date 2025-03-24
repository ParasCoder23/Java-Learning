package Practice;

class AnonymousA{
    public void show() {
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        AnonymousA obj = new AnonymousA()
        {
            public void show(){
                System.out.println("in new Show");
            }
        }; // This calls show method in the class --> anonymous inner class
        // We are not creating object of Anonymous class, hence we are creating object of inner class
        obj.show();
    }
}
