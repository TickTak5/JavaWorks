package homeworks;

import java.util.Objects;
import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        System.out.println("Hello teacher");

        Scanner scanner = new Scanner(System.in);
        boolean invalid = false;
        String key = "";

        while (!invalid) {
            System.out.println("Please enter the answer key:");
            key = scanner.nextLine();
            if (key.length() < 40) {
                System.out.println("Illegal Input!");
            } else invalid = true;
        }

        String name = " ";
        int toplamS1 = 0, toplamS2 = 0, toplamS3 = 0, toplamS4 = 0;
        int toplamS1y = 0, toplamS2y = 0, toplamS3y = 0, toplamS4y = 0;

        do {
            System.out.print("Enter the name: ");
            name = scanner.nextLine();
            if (name.equals("0")) {
                System.out.println("Program ends bye (:");
                scanner.close();
                return;
            }

            String keyStd = "";
            boolean invalid2 = false;
            while (!invalid2) {
                System.out.println("Please enter the answers of " + name);
                keyStd = scanner.nextLine();
                if (keyStd.length() < 40) {
                    System.out.println("Illegal Input!");
                } else invalid2 = true;
            }

            for (int i = 0; i <= key.length() - 4; i += 4) {
                if (key.charAt(i) == keyStd.charAt(i)) {
                    toplamS1 += 1;
                } else toplamS1y += 1;
            }
            for (int i = 1; i <= key.length() - 3; i += 4) {
                if (key.charAt(i) == keyStd.charAt(i)) {
                    toplamS2 += 1;
                } else toplamS2y += 1;
            }
            for (int i = 2; i <= key.length() - 2; i += 4) {
                if (key.charAt(i) == keyStd.charAt(i)) {
                    toplamS3 += 1;
                } else toplamS3y += 1;
            }
            for (int i = 3; i <= key.length() - 1; i += 4) {
                if (key.charAt(i) == keyStd.charAt(i)) {
                    toplamS4 += 1;
                } else toplamS4y += 1;
            }
            int toplamD = (toplamS1 + toplamS2 + toplamS3 + toplamS4);
            int toplamY = toplamS1y + toplamS2y + toplamS3y + toplamS4y;

            System.out.println(name + " has " + toplamD + " correct and " + toplamY + " incorrect answers in total.");
            System.out.println("The percentage of success is:");
            System.out.println("S1 \tS2 \tS3 \tS4");
            System.out.println("---\t---\t---\t---");
            System.out.println(toplamS1 * 10 + "%\t" + toplamS2 * 10 + "%\t" + toplamS3 * 10 + "%\t" + toplamS4 * 10 + "%");

            toplamS1 = toplamS2 = toplamS3 = toplamS4 = toplamS1y = toplamS2y = toplamS3y = toplamS4y = 0;
        } while (true);
    }
}
