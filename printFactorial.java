import java.util.Scanner;

public class printFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for getting Factorial");
        int n = sc.nextInt();

        factorial(1, n, 1);
        
    }

    public static void factorial(int i,int n,int fact){
        if (i == n) {
            fact *= n;
            System.out.println("Factorial is "+fact);
            return;
        }
        fact *= i;
        factorial(i+1, n, fact);
        System.out.println(i+"  "+fact);
    }
}
