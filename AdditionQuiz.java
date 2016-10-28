/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additionquiz;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class AdditionQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int number1 = (int) (Math.random()*100);
        int number2 = (int) (Math.random()*100);
        
        
      /*  if(number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }*/
            
            System.out.println("What is " + number1 + " - " + number2 + "? ");
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();
            
            if( number1- number2 == answer)
                System.out.println("Your Answer is Connect");
            else
                System.out.println("your answer is worng\n " + number1 + " - " + number2 + " should be " + (number1 - number2));
    }
    
}
