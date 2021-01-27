/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdistance;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ProjectDistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

              
 double x1;
 double y1;
 double x2;
 double y2;
 double distance;

 Scanner entrada = new Scanner(System.in);
  
 System.out.println("enter the x coordinate of the first point: ");
 x1 = input.nextDouble();
   
 System.out.println("enter the y coordinate of the first pointo: ");
 y1 = input.nextDouble();
  
 System.out.println("enter the x coordinate of the second point: ");
 x2 = input.nextDouble();
  
 System.out.println("enter the y coordinate of the second point: ");
 y2 = input.nextDouble();

 distance = Math.sqrt( (x2 - x1)(x2 - x1) + (y2 - y1)(y2 - y1) );

 System.out.printf("The distance between two point is: %.2f\n", distance);
    }
}

    


    
   

