/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingthreeintegers;

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
        int num1;
        int num2;
        int num3;

        String n = JOptionPane.showInputDialog(null, "input NUM 1 ");
        num1 = Integer.parseInt(n);
        String u = JOptionPane.showInputDialog(null, "input NUM 2 ");
        num2 = Integer.parseInt(u);
        String m = JOptionPane.showInputDialog(null, "input NUM 3 ");
        num3 = Integer.parseInt(m);

        if (num1 <= num2 && num2 <= num3) {
            System.out.println(num1 + "<=" + num2 + "<=" + num3);
        }
        if (num2 <= num1 && num1 <= num3) {
            System.out.println(num2 + "<=" + num1 + "<=" + num3);
        }
        if (num3 <= num1 && num1 <= num2) {
            System.out.println(num3 + "<=" + num1 + "<=" + num2);
        }

        
    }
}

    

