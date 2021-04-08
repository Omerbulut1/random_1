package STEP7_RANDOM;
import java.util.Random;
public class A1_RANDOM_Dice {
    public static void main(String[] args) {

        Random inputRandom=new Random();

        int dice, dice_array[]={0,0,0,0,0,0};


        for (int i=0;i<6000;i++){
            dice= inputRandom.nextInt(6)+1;
            if (dice==1)
                dice_array[0]++;
            else if (dice==2)
                dice_array[1]++;
            else if (dice==3)
                dice_array[2]++;
            else if(dice==4)
                dice_array[3]++;
            else if (dice==5)
                dice_array[4]++;
            else
                dice_array[5]++;

        }
        for (int j=0;j<6;j++){
            System.out.println(j+1 + ". zarin gelme sayisi=  " +dice_array[j]);
        }




    }
}
