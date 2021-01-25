package projectunit1;

import java.io.IOException;
import java.util.Scanner;

public class ProjectUnit1 {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        boolean mainLoop = true;
        int option;

        do {
            System.out.println("        WELCOME TO OUR MENU     ");

            System.out.println(" ======  CHOOSE AN OPTION  ====== ");
            System.out.println("1. ValidID ");
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
                    break;

                case 2:
                    int area;
                    int base;
                    int height;
                    System.out.println("Enter base -> ");
                    base = input.nextInt();
                    System.out.println("Enter height -> ");
                    height = input.nextInt();
                    area = base * height;
                    System.out.println("The rectangle area is --> " + area);
                    break;

                case 3:
                    double inches;
                    double millimeters;
                    System.out.println("Enter the inches to convert -> ");
                    inches = input.nextDouble();
                    millimeters = inches * 25.4;
                    System.out.println(inches + " inches equal to " + millimeters + " millimeters ");
                    break;

                case 4:
                    double yards;
                    double meters;
                    System.out.println("Enter the yards to convert -> ");
                    yards = input.nextDouble();
                    meters = yards * 0.9144;
                    System.out.println(yards + " yards equal to " + meters + " meters ");
                    break;

                case 5:
                    double miles;
                    double kilometers;
                    System.out.println("Enter the miles to convert -> ");
                    miles = input.nextDouble();
                    kilometers = miles * 1.6093;
                    System.out.println(miles + " miles equal to " + kilometers + " kilometers ");
                    break;

                case 6:
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
