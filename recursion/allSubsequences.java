import java.util.HashSet;
import java.util.Scanner;

public class allSubsequences {

    public static void subsequences(String str, int idx, String newString, HashSet<String> set){
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return ; 
            }
            System.out.println(newString);
            set.add(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // to be
            subsequences(str, idx+1, newString+currChar,set);
        // not to be
            subsequences(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String to get Subsequences : ");
        String str = sc.nextLine();
        HashSet<String> set = new HashSet<>();

        subsequences(str, 0, "",set);
        sc.close();
        
    }
}