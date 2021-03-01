/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        boolean mainLoop = true;
        int option;

        do {
            System.out.println("        WELCOME TO OUR MENU     ");

            System.out.println(" ======  CHOOSE AN OPTION  ====== ");
            System.out.println("1. Coordenadas Ordenadas ");
            System.out.println("2. Inverse of a matrix ");
            System.out.println("3. EXIT  ");

            System.out.println("Enter you menu option -->");
            option = input.nextInt();

            switch (option) {

                case 1 ->{
                          boolean flag = false;
                          boolean assistant;
                          boolean[] vector = null;
                              flag = true;
           for (int x = 0; x < 19; x++){
               if ( vector [x +1] > vector [x]){
                assistant = vector [x+1]; 
                vector [x+1] = vector [x];
                vector [x] = assistant;
                flag = false;
               }
            }           
        System.out.println("----------- PROGRAMMER ---------- ");
        System.out.println("♥ Kyara Lizeth Pilataxi Sarabia ♥ ");
        System.out.println();
        System.out.println("List of : ");
        System.out.println();
        System.out.println("ABSCISSA " + "\t"  +  " ORDERED ");
        
        int [] abscissa = new int [50];
        int [] ordered = new int [50];
        for (int i = 0; i < 20; i++){
            abscissa [i] = -100 + (int) (Math.random() * (200+1));
            ordered [i] = -100 + (int) (Math.random() * (200+1));
            }
            bubbleSort ( abscissa );
            bubbleSort ( ordered );
                
            for (int i = 0; i < 20; i++){
                System.out.println("\n" + abscissa [i] +"  \t  "+ " , " + "  \t  " + ordered [i]);
            }     
        }   
            
                case 2 -> {
                System.out.println("-- Quilca Quilca Evelyn Mishel --");
		int a,b;
		System.out.println("Enter the order your matriz will have: ");
		a=scanner.nextInt();		
		int [][]matrix=new int[a][a];
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				System.out.print("Enter a value for the position A["+i+"]["+j+"]:");
				matrix[i][j]=scanner.nextInt();
			}
		}		
		System.out.println();
		System.out.println("Matrix A");
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				System.out.print(matrix[i][j]+" ");
			}
		System.out.println();
		}
		int MT[][]=new int[a][a];
		System.out.println();
		
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				if(matrix[0][0]==1){
			
		
		
				}
				else{
					if(matrix[0][0]==0){	
			}
		}
		}
		}
		int diagonal=0;
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				if(matrix[i][j]==matrix[i][i]&&i==j){		
					   
		        }
		    }
		}

	}	
            case 3 -> {
                    System.out.println("------- Good Bye -------");
                    System.exit(0);
               }

                default -> System.out.println("Invalid option\n\n\n");            
        } while (option != 3);
        }
        }
}

