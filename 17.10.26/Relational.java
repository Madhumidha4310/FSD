package Fundamentals;

import java.util.Scanner;

public class Relational {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        System.out.print("Enter the First number: ");
        int a = src.nextInt();

        System.out.print("Enter the Second number: ");
        int b = src.nextInt();

        Operate re = new Operate();

        System.out.println();

        re.same(a, b);
        re.notsame(a, b);
        re.greater(a, b);
        re.lesser(a, b);
        re.greaterorequal(a, b);
        re.lesserorequal(a, b);

        src.close();
    }
}

class Operate {

    public void same(int a, int b) {
        System.out.println(a + " == " + b + ": " + (a == b));
    }

    public void notsame(int a, int b) {
        System.out.println(a + " != " + b + ": " + (a != b));
    }

    public void greater(int a, int b) {
        System.out.println(a + " > " + b + ": " + (a > b));
    }

    public void lesser(int a, int b) {
        System.out.println(a + " < " + b + ": " + (a < b));
    }

    public void greaterorequal(int a, int b) {
        System.out.println(a + " >= " + b + ": " + (a >= b));
    }

    public void lesserorequal(int a, int b) {
        System.out.println(a + " <= " + b + ": " + (a <= b));
    }
}