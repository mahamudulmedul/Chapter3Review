/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkingevennumber;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class CheckingEvenNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Interger: ");
        int e = input.nextInt();
        if(e%2==0)
            System.out.println("Is " +e+ "even number ? "+(e%2==0));

    }

}
