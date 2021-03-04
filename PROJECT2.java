/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author USUARIO
 */
public class PROJECT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int sum=0;
        String idNumber;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter of the ID Number: ");
        idNumber= input.nextLine();

        
        String digitsProvince = idNumber.substring(0,2);
        if(idNumber.length()!= 10 || Integer.parseInt(digitsProvince) > 24 || 
                Integer.parseInt(digitsProvince) < 0 || 
                Integer.parseInt(String.valueOf(idNumber.charAt(2))) > 6)
            System.out.println("Invalid number");
        else{
            int a[]=new int [idNumber.length()/2];
            int b[]=new int [(idNumber.length()/2)];
            int c=0;
            int d=1;
            for (int i = 0; i < idNumber.length()/2; i++) 
            {
                a[i]=Integer.parseInt(String.valueOf(idNumber.charAt(c)));
                c=c+2;
                if (i < (idNumber.length()/2)-1) {
                  b[i]=Integer.parseInt(String.valueOf(idNumber.charAt(d)));
                  d=d+2;
                }
            }

            for (int i = 0; i < a.length; i++) 
            {
                a[i]=a[i]*2;
                if (a[i] >9)
                  a[i]=a[i]-9;
                sum=sum+a[i]+b[i];
            } 
            int aux=sum/10;
            int dec=(aux+1)*10;
            if ((dec - sum) == Integer.parseInt(String.valueOf(idNumber.charAt(idNumber.length()-1))))
                System.out.println("Correct number");
            else
                if(sum%10==0 && idNumber.charAt(idNumber.length()-1)=='0')
                  System.out.println("Correct number");
                else
                  System.out.println("Invalid number");
        }
    }
}
