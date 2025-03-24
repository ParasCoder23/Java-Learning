package Task;

import java.util.Scanner;

public class SimpleCalculator {
    void displayOperations(){
        System.out.println("Select Operation : ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }

    public double add(Scanner sc){
        System.out.println("Enter 2 Numbers :");
        Double n1 = sc.nextDouble();
        Double n2 = sc.nextDouble();
        return n1+n2;
    }

    public double subtract(Scanner sc){
        System.out.println("Enter 2 Numbers :");
        Double n1 = sc.nextDouble();
        Double n2 = sc.nextDouble();
        return n1-n2;
    }

    public double multiply(Scanner sc){
        System.out.println("Enter 2 Numbers :");
        Double n1 = sc.nextDouble();
        Double n2 = sc.nextDouble();
        return n1 * n2;
    }

    public double divide(Scanner sc) throws ArithmeticException{
        System.out.println("Enter 2 Numbers :");
        Double n1 = sc.nextDouble();
        Double n2 = sc.nextDouble();
        if(n2 == 0){
            throw new ArithmeticException("n2 Should not be 0");
        }
        return n1/n2;
    }
}
