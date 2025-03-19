package homeworks.homeWork3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

        System.out.print("Please enter your loan type: ");
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();

        switch (type){
            case 1:
                calculateCarLoan();
            case 2:
                calculateStudentLoan();
            case 3:
                calculateHomeMortgageLoan();
        }
    }

    private static void calculateHomeMortgageLoan() {
        System.out.print("Enter the home price: ");
        Scanner scanner = new Scanner(System.in);
        int homePrice = scanner.nextInt();

        System.out.print("Enter the loan amount: ");
        int loan = scanner.nextInt();
        if (loan > (homePrice * 0.80)){
            System.out.println("The home mortgage loan cannot be given for that \n" +
                    "home!");
            return;
        }

        System.out.print("Enter the year of the residence was built ");
        int residenceYear = scanner.nextInt();

        System.out.print("Enter the number of years as an integer ");
        int years = scanner.nextInt();

        if(2017 - residenceYear <= 1 ){
            double annualInterestRate = 4.5;
            double monthlyInterestRate = (annualInterestRate / 100) / 12;
            double monthlyPayment = (loan * monthlyInterestRate) / (1- Math.pow((1 + monthlyInterestRate), -years * 12));

            System.out.println("The monthly payment is " + String.format("%.2f" ,monthlyPayment) + " TL");


        }else if(2017 - residenceYear <= 5){
            double annualInterestRate = 6.5;
            double monthlyInterestRate = (annualInterestRate / 100) / 12;
            double monthlyPayment = (loan * monthlyInterestRate) / (1- Math.pow((1 + monthlyInterestRate), -years * 12));

            System.out.println("The monthly payment is " + String.format("%.2f" ,monthlyPayment) + " TL");

        } else if (2017 - residenceYear <= 10) {
            double annualInterestRate = 8.5;
            double monthlyInterestRate = (annualInterestRate / 100) / 12;
            double monthlyPayment = (loan * monthlyInterestRate) / (1- Math.pow((1 + monthlyInterestRate), -years * 12));

            System.out.println("The monthly payment is " + String.format("%.2f" ,monthlyPayment) + " TL");

        }else System.out.println("The home mortgage loan cannot be given for the buildings older than 10 \n" +
                "years.");
    }

    private static void calculateStudentLoan() {
        System.out.print("Enter your year of birth: ");
        Scanner scanner = new Scanner(System.in);
        int birth = scanner.nextInt();

        if(2017 - birth < 18 || 2017 - birth > 30){
            System.out.println("The student loan cannot be given for the people \n" +
                    "younger than 18 or older than 30.");
            return;
        }

        System.out.print("Enter the total years in college: ");
        int collegeYears = scanner.nextInt();
        if (collegeYears > 5){
            System.out.println("The student loan cannot be given for the students with more than 5 years in \n" +
                    "college.");
            return;
        }
        System.out.print("Enter the loan amount: ");
        int loan = scanner.nextInt();
        if(loan > 15000){
            System.out.println("The student loan cannot be higher than 15000");
            return;
        }
        System.out.print("Enter number of years as an integer: ");
        int years = scanner.nextInt();

        double annualInterestRate = 6.8;
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        double monthlyPayment = (loan * monthlyInterestRate) / (1- Math.pow((1 + monthlyInterestRate), -years * 12));

        System.out.println("The monthly payment is " + String.format("%.2f" ,monthlyPayment) + " TL");

        if (monthlyPayment > 500){
            System.out.println("The student loan cannot be given to you!");
        }
    }

    private static void calculateCarLoan() {
        System.out.print("Do you have a regular job?(Y/N): ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();

        if (answer.equals("Y") || answer.equals("y")) {
            System.out.print("Enter your salary: ");
            int salary = scanner.nextInt();

            System.out.print("Enter the model year of the car: ");
            int model = scanner.nextInt();
            if (model - 2017 > 5) {
                System.out.print("The car loan cannot be given for the cars more than 5 years old");
                return;
            }

            System.out.print("Enter the vehicle price: ");
            int price = scanner.nextInt();

            System.out.print("Enter the loan amount: ");
            int loan = scanner.nextInt();
            if (loan > (price / 2f)) {
                System.out.print("The car loan cannot be given for that vehicle!");
                return;
            }

            System.out.print("Enter number of years as an integer: ");
            int years = scanner.nextInt();
            if (years > 4) {
                System.out.print("The car loan cannot be given for more than 4 years!");
                return;
            }

            double annualInterestRate = 5.75;
            double monthlyInterestRate = (annualInterestRate / 100) / 12;
            double monthlyPayment = (loan * monthlyInterestRate) / (1- Math.pow((1 + monthlyInterestRate), - years * 12));

            System.out.println("The monthly payment is " + String.format("%.2f" ,monthlyPayment) + " TL");

            if (monthlyPayment > salary / 2f){
                System.out.println("The car loan cannot be given to you!");
            }else System.out.println("The car loan can be given to you.");
        }
    }
}
