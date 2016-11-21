package Array1;

/**
 * Created by fangwang on 11/21/16.
 */

import java.util.*;


public class Array1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];

        for(int i = 0 ; i < n; i++){
            int val = scan.nextInt();
            a[i] = val;
        }

        scan.close();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
