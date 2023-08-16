package javaPracPack;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayStringPrac {
    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);
        System.out.println("enter length of the array :");
        int n = sc.nextInt();
        int[] s = new int[n];

        System.out.println("enter elements of the array");
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        System.out.println("array elements are");
        for (int i=0;i<n;i++){
            System.out.println(s[i]);
        }
        int min = s[0];
        int max = s[0];
        for (int i = 1; i < s.length; i++) {
            max = (s[i] > max) ? s[i] : max;
            min = (s[i] < min) ? s[i] : min;
        }

        System.out.println("max : " + max + ", min : " + min);*/

        String string = "The best of both worlds";
        int count = 0;

        //Counts each character except space
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' ')
                count++;
        }

        //Displays the total number of characters present in the given string
        System.out.println("Total number of characters in a string: " + count);
    }
}

