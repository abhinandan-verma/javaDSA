import java.util.Scanner;

public class fibonacciRecusion {

    private static void printFibo(int a,int b,int length){
       
        if(length <= 0){
            return;
        }
       int c = a + b;
       System.out.println(c);
       printFibo(b, c, length -1);
        
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Length of the Fibonacci Series");

        int length = scan.nextInt();

        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        printFibo(a, b, length -2);
        scan.close();
    }
}