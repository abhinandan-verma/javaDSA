package javaBasics;

public class typeCastP1 {
    public static void main(String[] args) {

        byte b = 4;
        char c ='a';
        short s = 51;
        int i = 100;
        float f = 3.14f;
        double d = 99.9954;

       double result  = (f*b) + (i%c) - (d*s);
        System.out.println(result);

    }
}
