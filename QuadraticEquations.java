/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequations;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class QuadraticEquations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b,c: ");
        double a = input.nextDouble();
        double b= input.nextDouble();
        double c = input.nextDouble();
        
        double d = b * b - 4 * a* c;
        
        double root1 = (double)((-b+Math.pow(d, .5)/2*a));
        double root2 = (double)((-b-Math.pow(d, .5)/2*a));
        
        if(d>0)
            System.out.println("The roots are: "+root1+"and"+root2);
        else if(d==0)
            System.out.println("The root is "+root1);
        else
            System.out.println("The equation has no real roots");
    }
    
}
