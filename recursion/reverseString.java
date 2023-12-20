import java.util.Scanner;

public class reverseString {

    private static void printRev(String string, int index){
        if (index == 0){
            System.out.print(string.charAt(index));
            return;
        }
        System.out.print(string.charAt(index));
        printRev(string,index-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String to reverse");
        String string = sc.nextLine();
        printRev(string,string.length()-1);
    }
}
