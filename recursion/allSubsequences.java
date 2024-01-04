import java.util.Scanner;

public class allSubsequences {

    public static void subsequences(String str, int idx, String newString){
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // to be
            subsequences(str, idx+1, newString+currChar);
        // not to be
            subsequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String to get Subsequences : ");
        String str = sc.nextLine();

        subsequences(str, 0, "");
        sc.close();
        
    }
}