/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectunit2;

/**
 *
 * @author Kyara Lizeth
 */
public class ProjectUnit2 {

    /**
     * @param vector
     */
    static void bubbleSort(int[] vector) {
        // TODO code application logic here
        boolean flag = false;
        int assistant;
        while (!flag){
            flag = true;
            for (int x = 0; x < 19; x++){
               if ( vector [x] > vector [x +1]){
                assistant = vector [x+1]; 
                vector [x+1] = vector [x];
                vector [x] = assistant;
                flag = false;
               }
            }
        }
    }
    public static void main (String[]args){
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
    }

 
   
   
            

