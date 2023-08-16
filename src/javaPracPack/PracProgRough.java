package javaPracPack;

import java.util.Scanner;

public class PracProgRough {
    public static void main(String[] args) {
    /*    Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sum=0; int sum1=0; int sum2=0;int count1=0; int count2=0;
        for(int i=0; i<=A.length();i++){

            sum1=count1++;
        }System.out.println(sum1);
        for(int i=0; i<=B.length();i++){

            sum2=count2++;
        }System.out.println(sum2);

        System.out.println(sum=sum1+sum2);*/




            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            sc.close();
            System.out.println(A.length()+B.length());
            if(A.compareTo(B)>0){
                System.out.println("Yes");
            }
            else{System.out.println("No");}
            String str1=A.substring(0,1).toUpperCase();
            String str2=A.substring(1,A.length()).toLowerCase();
            System.out.print(str1+str2);
            String str3=B.substring(0,1).toUpperCase();
            String str4=B.substring(1,B.length()).toLowerCase();
            System.out.print(" "+(str3+str4));

    }
}
