package javaPracPack;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPrac {
    public static void main(String[] args) {


    int[] numbers = {2, 4, 4, 4, 5, 5, 5, 6, 6, 69, -3};

    Scanner inputt = new Scanner(System.in);
        System.out.println("enter value of search element : ");
    int searchElement = inputt.nextInt();
    System.out.println("number of occurences of given number is : "+getOccurence(numbers, searchElement));

}
    public static int getOccurence(int[] numbers, int searchElement) {
        int occ = 0;
        for (int i = 0; i < numbers.length; i++ )
            if (searchElement == numbers[i])
                occ++;
        return occ;
    }

}


