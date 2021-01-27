/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validid;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ValidId {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int suma=0;
        String numeroCedula;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su numero de cedula: ");
        numeroCedula= teclado.nextLine();

        
        String digitosProvincia = numeroCedula.substring(0,2);
        if(numeroCedula.length()!= 10 || Integer.parseInt(digitosProvincia) > 24 || Integer.parseInt(digitosProvincia) < 0 || Integer.parseInt(String.valueOf(numeroCedula.charAt(2))) > 6)
            System.out.println("Invalid number");
        else{
            int a[]=new int [numeroCedula.length()/2];
            int b[]=new int [(numeroCedula.length()/2)];
            int c=0;
            int d=1;
            for (int i = 0; i < numeroCedula.length()/2; i++) 
            {
                a[i]=Integer.parseInt(String.valueOf(numeroCedula.charAt(c)));
                c=c+2;
                if (i < (numeroCedula.length()/2)-1) {
                  b[i]=Integer.parseInt(String.valueOf(numeroCedula.charAt(d)));
                  d=d+2;
                }
            }

            for (int i = 0; i < a.length; i++) 
            {
                a[i]=a[i]*2;
                if (a[i] >9)
                  a[i]=a[i]-9;
                suma=suma+a[i]+b[i];
            } 
            int aux=suma/10;
            int dec=(aux+1)*10;
            if ((dec - suma) == Integer.parseInt(String.valueOf(numeroCedula.charAt(numeroCedula.length()-1))))
                System.out.println("Correct number");
            else
                if(suma%10==0 && numeroCedula.charAt(numeroCedula.length()-1)=='0')
                  System.out.println("Correct number");
                else
                  System.out.println("Invalid number");
        }

    }
    
}
