package javaBasics;

import java.util.Scanner;

public class javaBasics {
    public static void main(String[] args) {
        // Input type
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String str2 = sc.next();
//        int a = sc.nextInt();
 //       float f = sc.nextFloat();

        // Type Conversion
        // byte->short->int->float->long->double

        // Type Casting = explicit typecasting
//        int a = (int) f;
//        System.out.println(a);
        char ch = '@';
        System.out.println((int) ch);

        // Type Promotion
// java automatically converts char, short, byte to int before evaluating expression

        int $ = 24;
        System.out.println($);

    }
}
