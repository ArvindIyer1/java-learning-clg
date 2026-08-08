import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = inp.nextInt();
        System.out.println("Enter second number :");
        int b = inp.nextInt();
        System.out.println("Sum of two numbers is : " + (a + b));
        System.out.println("Difference of two numbers is : " + (a - b));
        System.out.println("Product of two numbers is : " + (a * b));
        System.out.println("Quotient of two numbers is : " + (a / b));
        System.out.println("Remainder of two numbers is : " + (a % b));
        inp.close();
        
    }
}
