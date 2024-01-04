
import java.util.Scanner;

public class printNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the lentgh of the Number line");
        int n = scan.nextInt();

        printNum(n);        
        scan.close();
    }

    public static void printNum(int n){
        if (n <= 0) {
            return;
        }

        System.out.print(n + "    ");
        printNum(n - 1);
    }
}
