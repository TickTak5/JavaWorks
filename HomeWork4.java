package homeworks;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        int number;
        int total = 0;
        System.out.print("Enter an integer number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        while(number != 0){
            do {
                number = number / 2;
                total = total + 1;

            }while (number > 0) ;

            if (number < 0){
                System.out.println("The number of bits: Illegal input ");

            }else System.out.println("The number of bits: " + total);
            total = 0;
            System.out.print("Enter an integer number: ");
            number = scanner.nextInt();

            if (number == 0){
                System.out.println("Program ends. Bye");
            }
        }
    }
}
