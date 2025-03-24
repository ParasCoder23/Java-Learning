package Practice;

public class StringBuilder {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Paras Budhiraja is good boy");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.getClass().getName());

        String s = sb.toString();;
        System.out.println("String is : " + s);

        // We can use class anywhere in same package

        Mobile obj = new Mobile("Oppo", 400);
        Mobile.get(obj);
    }
}
