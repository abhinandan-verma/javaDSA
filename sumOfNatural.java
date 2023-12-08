import java.util.Scanner;

public class sumOfNatural {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Natural no. for getting Sum");

        int n = sc.nextInt();
        
      //  calculateSum(1, n, 0);
      System.out.println("sum is "+calculateSum2(n));
        sc.close();
    }

   public static void calculateSum(int i,int n,int sum){
    if (i == n) {
        sum += n;
        System.out.println("the sum is = "+sum);
        return;
    }
    sum += i;
    calculateSum(i+1, n, sum);
    System.out.println(i);
   }

   private static int calculateSum2(int n){
    if (n <= 0) {
        return 0;
    }
    return n + calculateSum2(n-1);
   }
}