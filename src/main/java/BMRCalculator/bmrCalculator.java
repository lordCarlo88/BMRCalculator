package BMRCalculator;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class bmrCalculator {
    Conversions conversions = new Conversions();

    public void run(){

        System.out.println("What is the client's name?");
        Scanner userInput = new Scanner(System.in);
        String name = userInput.nextLine();

        System.out.println("what is the client's height in inches?");
        double height = Double.parseDouble(userInput.nextLine());
        double cmHeight = conversions.inToCm(height);
        System.out.println("Your Height in centimeters is: "+cmHeight);

        System.out.println("What is the client's weight in pounds?");
        double weight = Double.parseDouble(userInput.nextLine());
        double kgWeight = conversions.lbToKg(weight);
        System.out.println("DAAYYUUM!");
        System.out.println("Your mass in kilograms is: "+ kgWeight+"!!!");


        System.out.println("What is the client's age?");
        int age = Integer.parseInt(userInput.nextLine());

        System.out.println("What is your gender? [M/F]");
        String gender = userInput.nextLine();
        String upGender = gender.toUpperCase(Locale.ROOT);
        if(upGender.equals("M")){

            Client client = new Client(name, gender, cmHeight, kgWeight, age);

             conversions.bmrMale(client.getWeight(), client.getHeight(), client.getAge());

        }else if(upGender.equals("F")){

            Client client = new Client(name, gender, cmHeight, kgWeight, age);

            conversions.bmrFemale(client.getWeight(), client.getHeight(), client.getAge());

        }else{
            System.out.println("Invalid Option");
        }
    }


    public static void main(String[] args) {
        bmrCalculator bmrc = new bmrCalculator();

        bmrc.run();

    }







}

