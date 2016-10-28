/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearequation;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class LinearEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b,c,d,e,f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        
        double result = a*d-b*c;
        
        double x = (e*d-b*f)/result;
        double y = (a*f-e*c)/result;
        
        if(result==0)
            System.out.println("The equation has no solution");
        else
            System.out.println("x is "+x+"and"+"y is "+y);
    }
    
}
