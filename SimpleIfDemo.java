/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleifdemo;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class SimpleIfDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Interger : ");
        int number = input.nextInt();
        
        if(number % 5 == 0)
            System.out.println("HiFive");
        if(number % 2 == 0)
            System.out.println("HiEven");
        
    }
    
}
