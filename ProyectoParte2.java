/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.parte.pkg2;

import java.util.Scanner;

/**
 *
 * @author 10
 */
public class ProyectoParte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> The are of a Rectangle");
            System.out.println("2. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    comptAreaOfRectangle (input);
                    break;
            }
        } while (option != 0);
    }

    private static void comptAreaOfRectangle (Scanner input) {
        System.out.println("Enter rectangle");
        int base;
        int height;
        int areas;
        System.out.println("Enter base ->");
        base = input.nextInt();
        System.out.println("Enter altura");
        height = input.nextInt();
        int area6 = base * height;
        System.out.println("The area of a rectangle: " + area6);
    }
}

        