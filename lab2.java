import java.util.Scanner;

public class lab2 {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter first number :");
    int a  = inp.nextInt();
    int b = inp.nextInt();
    int temp = a;
    a = b;
    b = temp;
    System.out.print("Swapped numbers are ");
    System.out.println(a);
    System.out.println(b);

    
  }

}
