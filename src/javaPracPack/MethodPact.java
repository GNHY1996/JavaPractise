package javaPracPack;

import java.util.Arrays;
import java.util.Scanner;

public class MethodPact {
    public static void main(String[] args) {
       /* Scanner inputt=new Scanner(System.in);
        System.out.println("enter value of x : ");
        int  x= inputt.nextInt();
        System.out.println("enter value of y : ");
        int y=inputt.nextInt();
        System.out.println("sum value is : "+(x+y));


        }

    static int sum(int x,int y){
        return (x+y);*/



    /*    int v=1;
        increment(v);
        System.out.println(v);

}

    public static void increment(int v) {
        v++;
        System.out.println(v);

    }*/

/*int [] numbers={1,2,3,9,8,8,7,0,44,22,33,22,-1};
      Arrays.sort(numbers);
     
//        System.out.println(hello);
        for (int num:numbers){
            System.out.println(num);
        }*/

        int [] numbers={1,2,4,8,-9,3,4};
        int product=1;
        int sum=0;
        float average;
        for (int i=0; i< numbers.length;i++){
            sum = sum+numbers[i];
            product=product*numbers[i];

        }
        average=((float)sum)/ numbers.length;
        System.out.println("sum : "+sum+", product : "+product+", average : "+average);
    }
}
