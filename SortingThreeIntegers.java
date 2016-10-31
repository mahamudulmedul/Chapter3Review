/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingthreeintegers;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Medul
 */
public class SortingThreeIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new  Scanner(System.in);
        System.out.println("Enter Number:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        if(num1>num2){
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }
        if(num2>num3){
            int temp = num3;
            num3 = num2;
            num2 = temp;
        }
        if(num1>num2){
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }
        System.out.println(num1+"<="+num2+"<="+num3);
        
    }
}

    

