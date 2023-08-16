package javaPracPack;

public class TwoDArrayPrac {
    public static void main(String[] args) {

        int[][] numbers={{1,2,3,4}, {5,6,7,8},{9,10,11,12}};

        for (int i=0; i<3;i++){
            int sum=0;
            for (int h=0; h<4;h++){
                sum +=numbers[i][h];
                System.out.println("sum for h loop is : "+sum);
            }System.out.println("sum for i loop is : "+sum);
        }

        for (int k=0; k<4;k++){
            int sum1=0;
            for (int l=0; l<3;l++){
                sum1 +=numbers[l][k];
                System.out.println("sum for l loop is : "+sum1);
            }System.out.println("sum for k loop is : "+sum1);
        }



    }
}
