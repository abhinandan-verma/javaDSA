package recursion;

import java.util.Scanner;

public class printFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for getting Factorial");
        int n = sc.nextInt();

        // factorial1(1, n, 1);
        System.out.println("factorial is "+factorial2(n));
        sc.close();
    }

    public static void factorial1(int i,int n,int fact){
        if (i == n) {
            fact *= n;
            System.out.println("Factorial is "+fact);
            return;
        }
        fact *= i;
        factorial1(i+1, n, fact);
        System.out.println(i+"  "+fact);
    }

    public static int factorial2(int n){
        if(n <= 0){
            return 1;
        }
        return n*factorial2(n -1);
    }
}
