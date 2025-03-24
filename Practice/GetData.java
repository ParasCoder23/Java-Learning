package Practice;

interface AData{
    public void show();
}

class BData implements AData{
    public void show(){
        System.out.println("in show");
    }
}
public class GetData {
    public static void main(String[] args) {
        AData obj1 = new BData();
        obj1.show();
    }
}
