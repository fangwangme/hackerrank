package StaticInitializerBlock;

/**
 * Created by fang on 01/11/2016.
 *
 * Static initialization blocks are executed when the class is loaded,
 * and you can initialize static variables in those blocks.
 *
 * It's time to test your knowledge of Static initialization blocks.
 * You can read about it here.
 *
 * You are given a class Solution with a main method. Complete the given code so that
 * it outputs the area of a parallelogram with breadth  and height . You should read
 * the variables from the standard input.
 *
 * If B<=0 or H<=0 , the output should be "java.lang.Exception: Breadth and height must be
 * positive" without quotes.
 *
 */

import java.util.*;


public class StaticInitializerBlock {

    private static boolean flag;
    private static int B;
    private static int H;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();

        if (B > 0 && H >0) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }

        scan.close();
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}

