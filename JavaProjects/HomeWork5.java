package homeworks;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        System.out.println("Please enter an integer number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("değer: " + calculateTerm(number)  );
    }
    public static int calculateTerm(int n){
            if (n == 1) return 0;
            if (n == 2) return 1;

            int a = 0, b = 1, temp;
            for (int i = 3; i <= n; i++){
                temp = (4 * b) - a;
                a = b;
                b = temp;
            }
            return b;
    }
}
