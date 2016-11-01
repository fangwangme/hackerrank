package Datatypes;

/**
 * Created by fang on 01/11/2016.
 * <p>
 * Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double.
 * For this exercise, we'll work with the primitives used to hold integer values
 * (byte, short, int, and long):
 * <p>
 * A byte is an 8-bit signed integer.
 * A short is a 16-bit signed integer.
 * An int is a 32-bit signed integer.
 * A long is a 64-bit signed integer.
 */

import java.util.Scanner;


public class Datatypes {
    public static void main(String[] argh) {

        final long longNum = (long) Math.pow(2, 63);
        final long intNum = (long) Math.pow(2, 31);
        final long shortNum = (long) Math.pow(2, 15);
        final long byteNum = (long) Math.pow(2, 7);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= 0 - byteNum && x <= byteNum - 1) {
                    System.out.println("* byte");
                }
                if (x >= 0 - shortNum && x <= shortNum - 1) {
                    System.out.println("* short");
                }
                if (x >= 0 - intNum && x <= intNum - 1) {
                    System.out.println("* int");
                }
                if (x >= (-1 - longNum) && x <= longNum) {

                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
