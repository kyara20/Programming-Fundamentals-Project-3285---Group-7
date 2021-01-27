package codigocesar1;

import java.io.IOException;
import java.util.Scanner;

public class CodigoCesar1 {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String text;
        int code;
        char option;
        //Enter text
        do{
            System.out.println("Enter text: ");
            text = scanner.nextLine();
        } while (text.isEmpty());
        //Enter the offset value
        do{
            System.out.println("Enter code: ");
            code = scanner.nextInt();
        } while (code < 1);
        //Enter the operation of perform: encrypt or decrypt
        do{
           scanner.nextLine();
           System.out.println("(E) encrypt; (D) decrypt?: ");
           option = (char) System.in.read();
        } while (Character.toUpperCase(option) != 'E' && Character.toUpperCase(option) != 'D');
        if (Character.toUpperCase(option) == 'E'){
            System.out.println("Text encrypt: " + encryptCesar(text, code));
        } else {
            System.out.println("Text decrypt: " + decryptCesar(text, code));
        }
    }
    //Method to encrypt the text
    private static String encryptCesar(String text, int code) {
        StringBuilder encrypt = new StringBuilder();
        code = code % 26;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z'){
                if ((text.charAt(i) + code) > 'z'){
                    encrypt.append((char) (text.charAt(i) + code - 26));
                } else {
                    encrypt.append((char) (text.charAt(i) + code));
                }
            } else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z'){
                if ((text.charAt(i) + code) > 'Z'){
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
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z'){
                if ((text.charAt(i) - code) < 'a') {
                    decrypt.append((char) (text.charAt(i) - code + 26));
                } else {
                    decrypt.append((char) (text.charAt(i) - code));
                } 
            } else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z'){
                if ((text.charAt(i) - code) < 'A'){
                    decrypt.append((char) (text.charAt(i) - code + 26));
                } else {
                    decrypt.append((char) (text.charAt(i) - code));
                }
            }
        }
        return decrypt.toString();
    }
    
}
