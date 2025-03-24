package Practice;

public class Wrapper {
    public static void main(String[] args) {
        int number = 34;
        Integer num = 4;

        num = number; // Auto-boxing primitive variable to reference variable
        System.out.println(num);

        num = 5;
        number = num.intValue(); // Instead of this we can do this simply by below line
        number = num; // Auto-outboxing reference variable to primitive variable

        System.out.println(number);

        String num2 = "12";
        int num3 = Integer.parseInt(num2);

        System.out.println(num3 * 2);
    }
}
