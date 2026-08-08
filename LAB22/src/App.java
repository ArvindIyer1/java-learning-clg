import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a random number :");
        int num = inp.nextInt();
        System.out.println(num++);
        System.out.println(++num);
        System.out.println(num--);
        System.out.println(--num);

        // System.out.println("Enter first number :");
        // int a = inp.nextInt();
        // System.out.println("Enter second number :");
        // int b = inp.nextInt();
        // System.out.println("Enter third number :");
        // int c = inp.nextInt();
        // if(a > b && a > c){
        //     System.out.println("A is the greatest number which is " + a);
        // }else if(b > a && b > c){
        //     System.out.println("B is the greatest number which is " + b);
        // }else{
        //     System.out.println("C is the greatest number which is " + c);
        // }
        inp.close();
    }
}
