/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computebmi;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class ComputeBMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter weight in pounds : ");
        double weight = input.nextDouble();
        
        System.out.println("Enter hight in inches : ");
        double hight = input.nextDouble();
        
        final double Kilograms_per_pounds = 0.45359237;
        final double Meter_per_Inches = 0.0254;
        
        
        double WeightInKilogram = weight * Kilograms_per_pounds;
        double HightInInMeter = hight * Meter_per_Inches;
        
        double BMI = WeightInKilogram/(HightInInMeter*HightInInMeter);
        
        
        System.out.println("Your BMI is " + BMI);
        
        if(BMI < 16)
            System.out.println("You are seriously underWeight");
        else if(BMI < 18)
            System.out.println("You are underweight");
        else if(BMI < 24)
            System.out.println("You are normal weight");
        else if(BMI < 29)
            System.out.println("You are overweight");
        else if(BMI < 35)
            System.out.println("You are seriously overweight");
        else
            System.out.println("You are gravely overweight");
    }
    
}
