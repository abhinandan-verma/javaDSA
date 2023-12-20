import java.util.Scanner;

public class stackArray {

    static int max = 5;
    static int[] stack = new int[max];
    static int top = -1;

    private   static void push(int item){
        if(top == max-1){
            System.out.println("Overflow...");
        }else {
            top++;
            stack[top] = item;
            System.out.println(STR."\{stack[top]} pushed successfully");
        }
    }
    private static int pop(){
        if (top == -1){
            System.out.println("Underflow");
            return -1;
        }else {
            int val = stack[top];
            top--;
            return val;
        }
    }
    private static void displayStack(){
        if (top == -1) {
            System.out.println("No stack found :(");
        }else {
            System.out.println(STR."\{stack[top]} <-- top");
            for (int i=top-1;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Stack Using Array");
        int choice = 0;
        while (choice != -1){
            System.out.print("Enter your Choice : ");
            choice = sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.print("Enter the item to be pushed : ");
                    int item = sc.nextInt();
                    push(item);
                    break;
                case 2 :
                    System.out.println(STR."\{pop()} popped successfully");
                    break;
                case 3 : displayStack();
                    break;
                default : System.out.println("Enter legal choice");
                    break;
            }
        }
    }
}
