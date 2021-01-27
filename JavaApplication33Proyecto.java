
package javaapplication33.proyecto;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class JavaApplication33Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do{
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> The are of a Rectangle");
            System.out.println("2. -> Exit");
            
            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Enter rectangle");
                    int base;
                    int height;
                    int areas;
                    System.out.println("Enter base ->");
                    base = input.nextInt();
                    System.out.println("Enter altura");
                    height = input.nextInt();
            int area6 = base*height; 
            System.out.println("The area of a rectangle: "+area6);
                    break;
            }
        }while(option!=0);
    }
    
}
