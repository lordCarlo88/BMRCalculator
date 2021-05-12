package BMRCalculator;

import java.util.Scanner;

public class Conversions {
    //convert height from imperial to metric

    //convert weight from imperial to metric
    //1 pound is 0.453592 kg
    //1kg is 2.2 pounds

    //public Client.getweight()


    public double lbToKg(double weightlbs){
        double kgWeight = weightlbs/2.20462;

        return kgWeight;

    }

    public double inToCm(double heightin){

        double cmHeight = heightin*2.54;

        return cmHeight;
    }

    public void bmrMale(double weight, double height, int age){
        double bmrMale = ( 10*weight) + (6.25*height) - (5*age)+5;
        int BMR1 = (int) bmrMale;
        //    revised harris/benedict equation forMale: (88.4 + 13.4 x weight) + (4.8 x height) – (5.68 x age)
        System.out.printf("%-20s %5s","Base BMR:",BMR1+"\n");
        System.out.printf("%-20s %7s","Sedentary:", BMR1*1.2+"\n");
        System.out.printf("%-20s %7s", "light activity:", BMR1*1.375+"\n");
        System.out.printf("%-20s %7s","Moderate activity:",BMR1*1.55+"\n");
        System.out.printf("%-20s %7s", "Very Active:", BMR1*1.725+"\n");
    }

    public void bmrFemale(double weight, double height, int age) {
        double bmrFemale = (10 * weight) + (6.25 * height) - (5 * age)-161;
        int BMR1 = (int) bmrFemale;
        //    Female: (447.6 + 9.25 x weight) + (3.10 x height) – (4.33 x age)
        System.out.printf("%-20s %5s","Base BMR:",BMR1+"\n");
        System.out.printf("%-20s %7s","Sedentary:", BMR1*1.2+"\n");
        System.out.printf("%-20s %7s", "light activity:", BMR1*1.375+"\n");
        System.out.printf("%-20s %7s","Moderate activity:",BMR1*1.55+"\n");
        System.out.printf("%-20s %7s", "Very Active:", BMR1*1.725+"\n");
    }
}


//    Female: (447.6 + 9.25 x weight) + (3.10 x height) – (4.33 x age)
//    weight in kilograms, height in centimeters, age in years
//
//    Male: 9.99 x weight + 6.25 x height – 4.92 x age + 5
//    Female: 9.99 x weight + 6.25 x height – 4.92 x age – 161
//
//            370 + (21.6 x LBM)
//
//            500 + (22 x LBM)
//            500 + (22 x 72) = 2,084