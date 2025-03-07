package homeworks;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        System.out.println("Enter an input string: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();


        for (int i = 0; i < input.length(); i++){
                for (int j = 0; j < input.length() - i   ; j++){
                    System.out.print(input.charAt(j));
                }
                printSpaces(i * 2-1);
                for (int k = input.length() - i -1; k >= 0; k--){
                    if (!(i == 0 && k == input.length() - i -1 && input.charAt(k) == input.charAt(input.length()-1)))
                        System.out.print(input.charAt(k));
                }
                for (int j1 = 1; j1 < input.length()-i; j1++){
                    System.out.print(input.charAt(j1));
                }
                printSpaces(i * 2-1);
                for (int k1 = input.length()- i -1 ; k1 >= 0; k1--){
                    if (!(i == 0 && k1 == input.length()- i -1  && input.charAt(k1) == input.charAt(input.length()-1)))
                        System.out.print(input.charAt(k1));

                }
                System.out.println();
        }
    }

    private static void printSpaces(int count) {
        for(int i = 0; i < count; i++){
            System.out.print(" ");
        }
    }
}
