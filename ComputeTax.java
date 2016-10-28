/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computetax;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class ComputeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(("0-single filiter,1-married jointly,\n"
                + "2-married saperately,3-head of household\n")
                + "Enter filling status: ");
        int status = input.nextInt();

        System.out.println("Enter taxable income: ");
        double income = input.nextDouble();

        double tax = 0;

        if (status == 0) {
            if (income <= 8350) {
                tax = income * 0.10;
            } else if (income == 33950) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            } else if (income == 82250) {
                tax = 8350 * 0.10 + (33950 - 8350) * .15 + (income - 33950) * .25;
            } else if (income == 171550) {
                tax = 8350 * 0.10 + (33950 - 8350) * .15 + (82250 - 33950) * .25 + (income - 82250) * .28;
            } else if (income == 372950) {
                tax = 8350 * 0.10 + (33950 - 8350) * .15 + (82250 - 33950) * .25 + (income - 82250) * .28 + (income - 17150) * .35;
            } else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15+ (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28+ (372950 - 171550) * 0.33 +
                        (income - 372950) * 0.35;
            }
        }
            else if (status == 1){
                    
                    }
            else if(status == 2){
                    
                    }
            else if(status==3){
                    
                    }
                    else{
                    System.out.println("Error: invalid status");
                    System.exit(0);
                    }
            System.out.println("Tax is:"+(tax*100)/100.0);
            
        
    }

}
