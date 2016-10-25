/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additionalquiz;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class AdditionalQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number1 = (int) (System.currentTimeMillis()% 10);
        int number2 = (int) (System.currentTimeMillis()*7%10);
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("what is "+number1+" + " +number2+" ? ");
        
        int answer = input.nextInt();
        
        System.out.println(number1 + " + "+number2 + " = "+answer+" is "+(number1+number2==answer));
        
    }
    
}
