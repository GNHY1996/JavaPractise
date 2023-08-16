package javaPracPack;

import javax.management.ListenerNotFoundException;
import java.util.Scanner;

public class PractiseClass1 {
    public static void main(String[] args) {
       /* String n="Ran om Test";
        String Rev="";
        for (int o=n.length()-1; o>=0;o--){
            Rev+=n.charAt(o);
            System.out.println(Rev);
        }*/

       /* Scanner input = new Scanner(System.in);
        System.out.println("enter a STRING : ");
        String S = input.nextLine();
        int n=input.nextInt();

        boolean isPalindrome = true;
        for (int i = 0, j = S.length() - 1; i < j; i++, j--) {
            if ((S.charAt(i) == S.charAt(j)))
                continue;
            isPalindrome = false;
            break;
        }
        System.out.println(isPalindrome?"palindrome" : "not palindrome");*/
        /*Scanner input = new Scanner(System.in);
        System.out.println("enter no of rows to print : ");
        int n=input.nextInt();
        int i=1; int j=1;

        for (i=1; i<=n; i++) {
            for (j = 1; j <= i; j++){
                System.out.print(i );


        }
        System.out.print(" ");
        }*/
       /* Scanner input = new Scanner(System.in);
        System.out.println("enter no of rows to print : ");
        int n=input.nextInt();
        int i=1; int j=1;
        for (i=1; i<=n; i++){
            for (j=1; j<=n-i; j++)
                System.out.print(" ");
            for (j=1;j<=i;j++)
                System.out.print("*");

            System.out.println();
        }*/

       /* Scanner input = new Scanner(System.in);
        System.out.println("enter no of rows to print : ");
        int n=input.nextInt();
        int i=1; int j=1;
        for (i=1; i<=n; i++){
            for (j=1; j<=n-i; j++)
                System.out.print(" ");
            for (j=1;j<=2*i-1;j++)
                if(i==n)
                System.out.print("*");
                else
                    if(j==1 || j==(2*i)-1)
                    System.out.print("*");
                    else
                        System.out.print(" ");

            System.out.println();

    }*/
        Scanner input = new Scanner(System.in);
        System.out.println("enter no of rows to print : ");
        int n=input.nextInt();
        for (int i=1; i<=n; i++) {
            if(i==n || i==1)
            for (int j = 1; j <= n; j++)
                System.out.print("*");
                else
                for (int j = 1; j <= n; j++)
                    if (j == 1 || j == n)
                        System.out.print(" ");
                    else
                        System.out.print("*");

                System.out.println();


        }
    }
}
