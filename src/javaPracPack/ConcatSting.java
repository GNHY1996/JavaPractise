package javaPracPack;

import java.util.Scanner;

public class ConcatSting {
    public static void main(String[] args) {
        /*String n = "nannapaneni";
        String N = "nageswararao";
        int m = 10;test
        int y = 20;
        System.out.println((n + N + " " + (m + y)).isEmpty());

        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
        System.out.println("Enter you category:");
        System.out.println("Your Category is:"+input.nextLine());

        System.out.println("Printing your name and age");

        System.out.println("Enter you name:");

        Scanner input1 = new Scanner(System.in);
       String name=input1.nextLine();
        System.out.println("Enter you age:");
        int n= input1.nextInt();
        System.out.println("Name of employee is "+name+" and his age is "+n);
        int i=1;
        int j=++i;
        int k=j++;
        System.out.println("pre increment of j is : "+j );
        System.out.println("post increment of k is : "+k );
              double d =(1.0/2);
        System.out.println(d);
        int n=10;
        int y=20;
        int max=n>y?n:y;
        System.out.println(max);

      if(true){
          System.out.println("inside the if statement");
      }
      else{
          System.out.println("inside the else statement");
      }

        int i=1;
        while (i<=20){
            System.out.println("number is : "+i);
            i++;
        }*/
        /*int i=1;
        for (i=1; i<=5; i++){
            for (int j=0; j<=i; j++){
            System.out.println("hello i is : "+i+" "+j);

        }
            System.out.println("hello test out 1st for loop i is : "+i);
        }
        System.out.println("hello test out second for loop is : "+i);*/

        /*Scanner input = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n= input.nextInt();
        int sum =0;
        for (int i=1; i<= n/2; i++){

            if (n%i ==0)
                sum+=i;
            System.out.println(sum);*/

      /*  Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int max=n;
        int min=n;
        if (n>0){
            while (true) {
                n= sc.nextInt();
                if (n < 0)
                    break;
                if (n > max)
                    max = n;

                if (n < min)
                    min = n;
            }
            System.out.println("min = "+min+","+"max = "+max);
            }
        else
        {
            System.out.println(n+" "+"is invalid");

    }*/

        /*Scanner input = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n= input.nextInt();
        int sum =0;
        while(n>0){
            sum+=n%100;
            n/=10;
        }
        System.out.println(sum);*/
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n= input.nextInt();
        int result=0;
        int v1=1;
        int v2=1;

        for (int i=1; i<n-2; i++){

            result=v1+v2;
            v1=v2;
            v2=result;

        }
        System.out.println("result is: "+(result==0? 1: result));
    }

}

