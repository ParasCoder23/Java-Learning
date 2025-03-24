package Task;

import java.util.Scanner;

import static java.lang.System.exit;

public class Task1 {
    public static void main(String[] args) {
        SimpleCalculator s = new SimpleCalculator();
        Scanner sc = new Scanner(System.in);
        Boolean running = true;

        while(running) {
            s.displayOperations();
            Integer choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Addition : " + s.add(sc));
                    break;
                case 2:
                    System.out.println("Subtraction : " + s.subtract(sc));
                    break;
                case 3:
                    System.out.println("Multiplication : " + s.multiply(sc));
                    break;
                case 4:
                    try {
                        System.out.println("Division : " + s.divide(sc));
                    }
                    catch(Exception e){
                        System.out.println("Something went wrong " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("We are closing the Calculator");
                    running = false;
                    break;
                default:
                    System.out.println("You have entered invalid choice");
            }
        }
        System.out.println("End of the program");
    }
}
