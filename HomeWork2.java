package homeworks;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.print("Enter an amount in double, for example 11.56: ");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        int total = 0;
        double lastMoney = 0d;
        System.out.println(Math.floor(money));

        double lastMoney2 = 0;
        lastMoney2 =money - Math.floor(money);
        System.out.println((float) lastMoney2);


        do {
            if (money - 200d >= 0){
                money = (int) (money - 200);
                total = total+1;
                lastMoney = money;
            }
        }while((lastMoney) - 200d >= 0);
        System.out.println(total + " 200TLs");
        total = 0;

        do {
            if (lastMoney - 100d >= 0){
                lastMoney = lastMoney - 100d;
                total = total+1;
            }
        }while((lastMoney) - 100d >= 0);
        System.out.println(total + " 100TLs");
        total = 0;

        do {
            if (lastMoney - 50d >= 0){
                lastMoney = lastMoney - 50d;
                total = total+1;
            }
        }while((lastMoney) - 50d >= 0);
        System.out.println(total + " 50TLs");
        total = 0;

        do {
            if (lastMoney - 20 >= 0){
                lastMoney = lastMoney - 20f;
                total = total+1;
            }

        }while(lastMoney - 20d >= 0);
        System.out.println(total + " 20TLs");
        total = 0;

        do {
            if (lastMoney - 10 >= 0){
                lastMoney = lastMoney - 10f;
                total = total+1;
            }
        }while(lastMoney - 10f >= 0);
        System.out.println(total + " 10TLs");
        total = 0;

        do {
            if (lastMoney - 5 >= 0){
                lastMoney = lastMoney - 5f;
                total = total+1;
            }
        }while(lastMoney - 5 >= 0);
        System.out.println(total + " 5TLs");
        total = 0;

        do {
            if (lastMoney - 1 >= 0){
                lastMoney = lastMoney - 1f;
                total = total+1;
            }
        }while(lastMoney - 1 >= 0);
        System.out.println(total + " 1Tls");
        total = 0;


        do {
            if (lastMoney2 - 0.50d >= 0){
                lastMoney2 = lastMoney2 - 0.50d;
                total = total+1;
            }
        }while(lastMoney2 - 0.50d >= 0);
        System.out.println(total + " 50Krs");
        total = 0;

        do {
            if (lastMoney2 - 0.25d >= 0){
                lastMoney2 = lastMoney2 - 0.25d;
                total = total+1;
            }
        }while(lastMoney2 - 0.25d >= 0);
        System.out.println(total + " 25Krs");
        total = 0;

        do {
            if (lastMoney2 - 0.10d >= 0){
                lastMoney2 = lastMoney2 - 0.10d;
                total = total+1;
            }
        }while(lastMoney2 - 0.10d >= 0);
        System.out.println(total + " 10Krs");
        total = 0;

        do {
            if (lastMoney2 - 0.05d >= 0){
                lastMoney2 = lastMoney2 - 0.05d;
                total = total+1;
            }
        }while(lastMoney2 - 0.05d >= 0);
        System.out.println(total + " 5Krs");
        total = 0;

        do {
            if (lastMoney2 - 0.01d >= 0){
                lastMoney2 = lastMoney2 - 0.01d;
                total = total+1;
            }
        }while(lastMoney2 - 0.01d >= 0);
        System.out.println(total + " 1Krs");




    }
}
