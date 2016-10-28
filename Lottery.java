/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class Lottery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lottery = (int) (Math.random()*100);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery you pick(two digits): ");
        
        int guess = input.nextInt();
        
        int lotteryDigit1 = lottery/10;
        int lotteryDigits2 = lottery%10;
        
        int guessDigit1= guess/10;
        int guessDigits2 = guess%10;
        
        System.out.println("The Lottery Digits is "+lottery);
        
        if(guess==lottery)
            System.out.println("Exact match: you win $10,000");
        else if(guessDigits2==lotteryDigit1 && guessDigit1==lotteryDigits2)
            System.out.println("Match all digits: you win $3,000");
        else if(guessDigit1==lotteryDigit1||
                guessDigit1==lotteryDigits2||
                guessDigits2==lotteryDigit1||
                guessDigits2==lotteryDigits2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry,No Match!");
                
    }
    
}
