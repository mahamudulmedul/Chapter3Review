/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbooleanoperators;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class TestBooleanOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer:");
        int number = input.nextInt();

        System.out.println("is " + number
                + "\n\tdivisible by 2 and 3?"
                + (number % 2 == 0 && number % 3 == 0)
                + "\n\tdivisible by 2 or 3?"
                + (number % 2 == 0 || number % 3 == 0)
                + "\n\tdivisible by 2 or 3 ,but not both?"
                + (number % 2 == 0 ^ number % 3 == 0));
    }

}
