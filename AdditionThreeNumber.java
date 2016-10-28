/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additionthreenumber;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class AdditionThreeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double number1 = (double) (System.currentTimeMillis() % 100);
        double number2 = (double) (System.currentTimeMillis() * 7 % 100);
        double number3 = (double) (System.currentTimeMillis() * 8 % 100);

        Scanner input = new Scanner(System.in);

        System.out.println("what is " + number1 + " + " + number2 + "+ " + number3+ " ? ");

        double answer = input.nextInt();

        System.out.println(number1 + " + " + number2 +"+ " +number3+ " = " + answer + " is " + (number1 + number2+number3 == answer));
    }

}
