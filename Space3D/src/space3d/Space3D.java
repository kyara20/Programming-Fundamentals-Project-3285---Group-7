package space3d;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 * @author Quilca Evelyn
 * @author Potosi Daniel
 * @author Quishpe Tania. 
 * @author Portero Carla
 */
public class Space3D {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        boolean mainLoop = true;
        int option;

        do {
            System.out.println("        WELCOME TO OUR MENU     ");
            System.out.println("__________  PROGRAMMERS  ____________");
            System.out.println(">>>>  Kyara Pilataxi <<<<");
            System.out.println(">>>>  Carla Portero  <<<<");
            System.out.println(">>>>  Daniel Potosi  <<<<");
            System.out.println(">>>>  Evelyn Quilca  <<<<");
            System.out.println(">>>>  Tania Quisphe  <<<<");
            System.out.println("_____________________________________ ");
            System.out.println(" ======  CHOOSE AN OPTION  ====== ");
            System.out.println("1. Valid ID ");
            System.out.println("2. Rectangle Area ");
            System.out.println("3. Inches to Millimeters ");
            System.out.println("4. Yards to Meters ");
            System.out.println("5. Miles to Kilometers ");
            System.out.println("6. Distance between two points");
            System.out.println("7. Encrypted code");
            System.out.println("8. EXIT  ");

            System.out.println("Enter you menu option -->");
            option = input.nextInt();

            switch (option) {
                case 1:
                    int sum=0;
                    String idNumber;
                    
                    System.out.print("Enter of the ID Number: ");
                    idNumber= input.nextLine();
                    System.out.println(validateId(idNumber, sum));
        
                    if (validateId(idNumber,sum)){
                    System.out.println("The idNumber " + idNumber + " is valid ");
                } else {
                    System.out.println("The idNumber " + idNumber + " is NOT valid "); 
                }
                    
                    break;
                    
                case 2:
                    comptAreaOfRectangle (input);
                    break;

                case 3:
                    double inches;
                    double millimeters;
                    inches = printTheInchesToConvert(input);
                    millimeters = calculateInchesToMillimeters(inches);
                    printResult(inches, millimeters);
                    break;

                case 4:
                    double yards;
                    double meters;
                    yards = printTheYardsToConvert(input);
                    meters = calculateYardsToMeters(yards);
                    printResult1(yards, meters);
                    break;

                case 5:
                    double miles;
                    double kilometers;
                    miles = printTheMilesToConvert(input);
                    kilometers = calculateMilesToKilometers(miles);
                    printResult2(miles, kilometers);
                    break;

                case 6:
                    computeDistance(input);
                    break;
                    
                case 7:
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
                    
                case 8:
                    System.out.println("GOOD BYE MY FRIEND");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }
        } while (option != 8);

    }
    //Valid ID
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
    //Rectangle Area
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
       //Compute Distance between two points
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
       //Miles to Kilometers transformer
        private static void printResult2(double miles, double kilometers) {
            System.out.println(miles + " miles equa
