package STEP7_RANDOM;
import java.util.Scanner;
import java.util.Random;
public class A2_RANDOM_Predicted_Number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random inputRandom=new Random();
        int sayac=0,randomNum,predictedNum,fNum;
        randomNum= inputRandom.nextInt(100)+1;

        do {
            System.out.println("prectid a number");
            predictedNum=input.nextInt();
            fNum=Math.abs((randomNum-predictedNum));
            sayac++;

            if (fNum>0 && fNum<=5){
                System.out.println("cok yakinsin");
            }
            else if (fNum>5 && fNum<=10){
                System.out.println("daha yakin olabilirsin");
            }
            else if (fNum>10 && fNum<=20){
                System.out.println("biraz uzaksin");
            }
            else if (fNum>20 && fNum<=50){
                System.out.println("uzaksin");

            }
            else if(fNum>50){
                System.out.println("cok cok uzaksin");
            }


        }while(fNum!=0);
        System.out.println("dogru cebap bravo!!!!!====>" + predictedNum + "," + sayac+ "kadar denemede buldunuz");

    }
}
