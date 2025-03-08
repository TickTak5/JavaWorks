package homeworks;

import javax.swing.text.AttributeSet;
import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        int wordCount = 0;
        int letterCount = 0;
        int offset = 0;

        System.out.println("Welcome to my program.");
        String choose = "";

        do {
            System.out.print("Please enter an input string: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            boolean inWord = false;

            if (input.equals("stat")){
                printStat(wordCount,letterCount);
                continue;
            }

            for (int i = 0; i < input.length(); i++){
                char currentChar = input.charAt(i);
                if (Character.isLetter(currentChar)){
                    letterCount++;
                }

                if (Character.isWhitespace(currentChar)){
                    inWord = false;
                }else if (!inWord){
                    wordCount++;
                    inWord = true;
                }
            }
           if (input.equals("exit") || input.equals("quit")){
               System.out.println("program ends bye.");
               scanner.close();
               return;
           }else {
               System.out.println("Please choose an option:");
               System.out.println("1. Change case");
               System.out.println("2. Count vowels and consonants");
               System.out.println("3. Capitalize first letters");
               System.out.println("4. Encrypt or Decrypt");
               choose = scanner.nextLine();
           }

            switch (choose) {
                case "1":
                    String input2 = changeCase(input);
                    System.out.println(input2);
                    break;

                case "2":
                    countVC(input);
                    break;

                case "3":
                    String input3 = capitalize(input);
                    System.out.println(input3);
                    break;

                case "4":
                    boolean validOffset = false;
                    while(!validOffset){
                        System.out.print("Enter an offset value: ");
                        scanner = new Scanner(System.in);
                        offset= scanner.nextInt();

                        if (offset > 25 || offset < -25){
                            System.out.println("invalid offset value!");
                            break;
                        }else{
                            validOffset = true;
                        }
                    }
                    if (offset <= 25 && offset >= -25){
                        String input4 = encryptOrDecrypt(input , offset);
                        System.out.println("source: " + input.toUpperCase());
                        System.out.println("processed: " + input4);
                    }
                    break;

                default:
                    System.out.println("invalid option, try again. ");
                    break;
            }
        } while(!choose.equals("exit") && !choose.equals("quit"));
    }

    private static void printStat(int wordCount, int letterCount) {
        System.out.println("The number of words: " + wordCount);
        System.out.println("The number of alphabetic letters: " + letterCount);
    }

    private static String encryptOrDecrypt(String input, int offset) {
        input = input.toUpperCase();
        StringBuilder sb = new StringBuilder();

        for (char ch : input.toCharArray()){
            if (ch >= 'A' && ch <= 'Z'){
                int newChar = ((ch - 'A' + offset) % 26 + 26) % 26 + 'A';
                sb.append((char)newChar);
            }else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    private static String capitalize(String input) {
        StringBuilder newInput = new StringBuilder();
        for (int i = 0; i < input.length(); i++){
            char inputChar = input.charAt(i);
            if (Character.isLowerCase(inputChar) && i == 0){
                newInput.append(Character.toUpperCase(inputChar));
            }else if (Character.isSpaceChar(inputChar)){
                newInput.append(inputChar);
                i++;
                inputChar = input.charAt(i);
                newInput.append(Character.toUpperCase(inputChar));
            }else newInput.append(inputChar);
        }
        return newInput.toString();
    }

    private static void countVC(String input) {
        char[] c = {'a', 'e', 'i', 'o', 'u'};
        char[] v = {'b' , 'c', 'd', 'f' , 'g' , 'h', 'j' , 'k' , 'l' , 'm' , 'n' ,'p','r','s','t','v','w','y','z'};
        int totalC = 0;
        int totalV = 0;

        for (int i = 0; i < input.length(); i++){
            char str2 = input.charAt(i);
           for (char temp : c){
               if (Character.isUpperCase(str2)){
                   char lowerCase = Character.toLowerCase(str2);
                   if (lowerCase == temp) totalC = totalC + 1;
               }else if (str2 == temp ) totalC = totalC + 1;

           }
           for (char temp2 : v){
               if (Character.isUpperCase(str2)){
                   char lowerCase = Character.toLowerCase(str2);
                   if (lowerCase == temp2) totalV = totalV + 1;
               }else if (str2 == temp2) totalV = totalV + 1;
           }
        }
        System.out.println("The number of vowels is: " + totalC);
        System.out.println("The number of consonants is: " + totalV);
    }

    private static String changeCase(String input) {
        StringBuilder str3 = new StringBuilder();
        for (int i = 0; i < input.length(); i++){
            char str2 = input.charAt(i);
            if (Character.isLowerCase(str2)) str3.append(Character.toUpperCase(str2));
            else str3.append(Character.toLowerCase(str2));
        }
        return str3.toString();
    }


}
