/*
 * Ferris D.
 * September 7th 2018
 * This program will alculate the area of a scalene triangle using trigonometry
 */

package areaoftriangle;

import javax.swing.JOptionPane;

/**
 * @author fedie2562
 */
public class AreaOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dimensionA = JOptionPane.showInputDialog("Enter length of a");
        String dimensionB = JOptionPane.showInputDialog("Enter length of b");
        String angleC = JOptionPane.showInputDialog("Enter angle C");
        double a=Double.parseDouble(dimensionA);
        double b=Double.parseDouble(dimensionB);
        double angle=Double.parseDouble(angleC);
        double area=(a+b+Math.sin(angle))/2; //Trigonometry
        System.out.println("Area = "+area); //Output answer
    }
    
}
