/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectunit2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 * @author Quilca Evelyn
 * @author Potosi Daniel
 * @author Quishpe Tania 
 * @author Portero Carla
 */
public class Functions {
    
public static void main(String[] args) throws IOException {
    // TODO code application logic here
    
        Scanner input = new Scanner(System.in);
        
        boolean mainLoop = true;
        int option;

        do {
            System.out.println("        WELCOME TO OUR MENU     ");
            System.out.println("__________  PROGRAMMER  ____________");
            System.out.println(">>>>  Kyara Pilataxi <<<<");
            System.out.println(">>>>  Carla Portero  <<<<");
            System.out.println(">>>>  Daniel Potosi  <<<<");
            System.out.println(">>>>  Evelyn Quilca  <<<<");
            System.out.println(">>>>  Tania Quisphe  <<<<");
            System.out.println();
            System.out.println(" ======  CHOOSE AN OPTION  ====== ");
            System.out.println("1. Rectangle Area ");
            System.out.println("2. Inches to Millimeters ");
            System.out.println("3. Yards to Meters ");
            System.out.println("4. Miles to Kilometers ");
            System.out.println("5. Distance between two points");
            System.out.println("6. Encrypted code");
            System.out.println("7. EXIT  ");

            System.out.println("Enter you menu option -->");
           

        Scanner input = new Scanner(System.in);
        System.out.print("Enter of the ID Number: ");
        idNumber= input.nextLine();

        
        System.out.println(validateId(idNumber, sum));
        
        if (validateId(idNumber,sum)){
            System.out.println("The idNumber " + idNumber + " is valid ");
        } else {
           System.out.println("The idNumber " + idNumber + " is NOT valid "); 
        }
        
    }

    private static boolean validateId(String idNumber, int sum) throws NumberFormatException {
        boolean validId = false;
        String digitsProvince = idNumber.substring(0,2);
        if(idNumber.length()!= 10 || Integer.parseInt(digitsProvince) > 24 ||
                Integer.parseInt(digitsProvince) < 0 || 
                Integer.parseInt(String.valueOf(idNumber.charAt(2))) > 6)
            validId = false;
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
                validId = true;
            else
                if(sum%10==0 && idNumber.charAt(idNumber.length()-1)=='0')
                    validId = true;
                else          validId = false;
        }
        return validId;
    }
                    validId = false;
        }
        return validId;
    }
}
        
            switch (option) {
                case 1:
                    comptAreaOfRectangle (input);
                    break;

                case 2:
                    double inches;
                    double millimeters;
                    inches = printTheInchesToConvert(input);
                    millimeters = calculateInchesToMillimeters(inches);
                    printResult(inches, millimeters);
                    break;

                case 3:
                    double yards;
                    double meters;
                    yards = printTheYardsToConvert(input);
                    meters = calculateYardsToMeters(yards);
                    printResult1(yards, meters);
                    break;

                case 4:
                    double miles;
                    double kilometers;
                    miles = printTheMilesToConvert(input);
                    kilometers = calculateMilesToKilometers(miles);
                    printResult2(miles, kilometers);
                    break;

                case 5:
                    computeDistance(input);
                    break;
                case 6:h
                    int sum=0;
        String idNumber;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter of the ID Number: ");
        idNumber= input.nextLine();

        
        System.out.println(validateId(idNumber, sum));
        
        if (validateId(idNumber,sum)){
            System.out.println("The idNumber " + idNumber + " is valid ");
        } else {
           System.out.println("The idNumber " + idNumber + " is NOT valid "); 
        }
        
    }

    private static boolean validateId(String idNumber, int sum) throws NumberFormatException {
        boolean validId = false;
        String digitsProvince = idNumber.substring(0,2);
        if(idNumber.length()!= 10 || Integer.parseInt(digitsProvince) > 24 ||
                Integer.parseInt(digitsProvince) < 0 || 
                Integer.parseInt(String.valueOf(idNumber.charAt(2))) > 6)
            validId = false;
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
                validId = true;
            else
                if(sum%10==0 && idNumber.charAt(idNumber.length()-1)=='0')
                    validId = true;
                else
                    validId = false;
        }
        return validId;
    }
}
        
                    Scanner scanner = new Scanner(System.in);
                    String text;
                    int code;
                    //Enter text
                    do {
                        System.out.println("Enter text: ");
                        text = scanner.nextLine();
                    } while (text.isEmpty());
                    //Enter the offset value
                    do {
                        System.out.println("Enter code: ");
                        code = scanner.nextInt();
                    } while (code < 1);
                    //Enter the operation of perform: encrypt or decrypt
                    do {
                        scanner.nextLine();
                        System.out.println("(E) encrypt; (D) decrypt?: ");
                        option = (char) System.in.read();
                    } while (Character.toUpperCase(option) != 'E' && Character.toUpperCase(option) != 'D');
                    if (Character.toUpperCase(option) == 'E') {
                        System.out.println("Text encrypt: " + encryptCesar(text, code));
                    } else {
                        System.out.println("Text decrypt: " + decryptCesar(text, code));
                    }

                    break;
                case 7:
                    System.out.println("GOOD BYE MY FRIEND");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }
        } while (option != 7);

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
        private static void computeDistance(Scanner input) {
        double X1;
        double Y1;
        double X2;
        double Y2;
        double distance;
        System.out.println("Enter the X coordinate of the first point -> ");
        X1 = input.nextDouble();
        System.out.println("Enter the Y coordinate of the first point -> ");
        Y1 = input.nextDouble();
        System.out.println("Enter the X coordinate of the second point -> ");
        X2 = input.nextDouble();
        System.out.println("Enter the Y coordinate of the second point -> ");
        Y2 = input.nextDouble();
        distance = Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));
        System.out.printf("The distance between two points is -> " + distance);
    }

    private static void printResult2(double miles, double kilometers) {
        System.out.println(miles + " miles equal to " + kilometers + " kilometers ");
    }

    private static double calculateMilesToKilometers(double miles) {
        double kilometers;
        kilometers = miles * 1.6093;
        return kilometers;
    }

    private static double printTheMilesToConvert(Scanner input) {
        double miles;
        System.out.println("Enter the miles to convert -> ");
        miles = input.nextDouble();
        return miles;
    }

    private static void printResult1(double yards, double meters) {
        System.out.println(yards + " yards equal to " + meters + " meters ");
    }

    private static double calculateYardsToMeters(double yards) {
        double meters;
        meters = yards * 0.9144;
        return meters;
    }

    private static double printTheYardsToConvert(Scanner input) {
        double yards;
        System.out.println("Enter the yards to convert -> ");
        yards = input.nextDouble();
        return yards;
    }

    private static void printResult(double inches, double millimeters) {
        System.out.println(inches + " inches equal to " + millimeters + " millimeters ");
    }

    private static double printTheInchesToConvert(Scanner input) {
        double inches;
        System.out.println("Enter the inches to convert -> ");
        inches = input.nextDouble();
        return inches;
    }

    private static double calculateInchesToMillimeters(double inches) {
        double millimeters;
        millimeters = inches * 25.4;
        return millimeters;
    }

    //Method to encrypt the text
    private static String encryptCesar(String text, int code) {
        StringBuilder encrypt = new StringBuilder();
        code = code % 26;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                if ((text.charAt(i) + code) > 'z') {
                    encrypt.append((char) (text.charAt(i) + code - 26));
                } else {
                    encrypt.append((char) (text.charAt(i) + code));
                }
            } else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                if ((text.charAt(i) + code) > 'Z') {
                    encrypt.append((char) (text.charAt(i) + code - 26));
                } else {
                    encrypt.append((char) (text.charAt(i) + code));
                }
            }
        }
        return encrypt.toString();
    }

    //Method to decrypt the text
    private static String decryptCesar(String text, int code) {
        StringBuilder decrypt = new StringBuilder();
        code = code % 26;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                if ((text.charAt(i) - code) < 'a') {
                    decrypt.append((char) (text.charAt(i) - code + 26));
                } else {
                    decrypt.append((char) (text.charAt(i) - code));
                }
            } else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                if ((text.charAt(i) - code) < 'A') {
                    decrypt.append((char) (text.charAt(i) - code + 26));
                } else {
                    decrypt.append((char) (text.charAt(i) - code));
                }
            }
        }
        return decrypt.toString();
    }
}
    

   
