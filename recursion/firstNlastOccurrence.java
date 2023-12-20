import java.util.Scanner;

// Time Complexity -> O[n]
public class firstNlastOccurrence {

    private static int first = -1;
    private static int last = -1;

    private static void findOccurrence(String s, int index, char element){
        if (index  == s.length()){
            System.out.println("first index : "+first);
            System.out.println("last index : "+last);
            return;
        }
        char currChar = s.charAt(index);
        if (currChar == element){
            if (first == -1){
               first = index;
            }else {
               last = index;
            }
        }
        findOccurrence(s,index+1,element);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string here : ");
        String str = sc.next();
        System.out.print("Enter the letter to find Occurrence : ");
        char ch = sc.next().charAt(0);

        findOccurrence(str,0,ch);
    }
}
