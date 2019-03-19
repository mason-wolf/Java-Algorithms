/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProject;

import java.util.Scanner;

/**
 *
 * @author Mason
 */
public class App {

    private static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String creditCardNumber = validateCardNumberFormat("Enter card number: ");
        
        if (validateCardNumber(creditCardNumber))
        {
            System.out.println(creditCardNumber + " is valid");
        }
        else 
        {
            System.out.println(creditCardNumber + " is invalid");
        }
  
    }
   
  
    // Make sure card number has correct length, does not contain any letters and is the right type.
    public static String validateCardNumberFormat(String prompt) {
        String cardNumber = "";

        boolean validInput = false;

        while (!validInput) {
            System.out.print(prompt);
            cardNumber = sc.next();

            if (cardNumber.length() < 13 || cardNumber.length() > 16) {
                System.out.println("Invalid card number length.");
            } else if (!validateCardDigits(cardNumber)) {
                System.out.println("Card numbers can only contain digits.");
            } else if (!validateCardType(cardNumber)) {
                System.out.println("Invalid card type.");
            } else {
                validInput = true;
            }
            sc.nextLine();
        }

        return cardNumber;
    }

    // Ensures each character in the card number is a digit.
    public static Boolean validateCardDigits(String cardDigits) {
        boolean validInput = false;

        for (int i = 0; i < cardDigits.length(); i++) {
            if (Character.isDigit(cardDigits.charAt(i))) {
                validInput = true;
            } else {
                validInput = false;
            }
        }

        return validInput;
    }
    
    // Ensures the card is the proper type.
    public static Boolean validateCardType(String cardDigits) {
        boolean validCarrier = false;

        // Check if card is Visa.
        if (cardDigits.charAt(0) == '4') {
            validCarrier = true;
        } // Check if card is Master Card.
        else if (cardDigits.charAt(0) == '5') {
            validCarrier = true;
        } // Check if card is American Express.
        else if (cardDigits.charAt(0) == '6') {
            validCarrier = true;
        } // Check if card is Discover.
        else if (cardDigits.charAt(0) == '3' && cardDigits.charAt(1) == '7') {
            validCarrier = true;
        }
        return validCarrier;
    }
    
    // Recursively checks even and odd numbers in a card number, sums them up and 
    // determines if the card is valid, as long as the sum is divisable by 10.
    public static boolean validateCardNumber(String cardNumber) {
        
        int evenDigit = 0;
        int oddDigit = 1;
        int doubledDigit = 0;
        int evenSum = 0;
        int oddSum = 0;
        boolean validCard = false;
        
        // Reverse the string.
        for (int i = cardNumber.length() - 1; i > -1; i--) {

            // Prevent loop from going out of index bounds.
            if (evenDigit < cardNumber.length()) {

                // Double each digit.
                doubledDigit = Character.getNumericValue(cardNumber.charAt(evenDigit)) * 2;

                // If digit is a double digit, add them together, else sum the others.
                if (doubledDigit > 9) {

                    int doubleDigitSum = 0;

                    while (doubledDigit > 0) {
                        doubleDigitSum += doubledDigit % 10;
                        doubledDigit = doubledDigit / 10;
                    }
                    evenSum += doubleDigitSum;
                } else {
                    evenSum += doubledDigit;
                }
                evenDigit += 2;
            }
            
            // Add up the even numbers.
            if (oddDigit < cardNumber.length()) {
                oddSum += Character.getNumericValue(cardNumber.charAt(oddDigit));
                oddDigit += 2;
            }
        }

        int sumTotal = evenSum + oddSum;
        int remainder = sumTotal % 10;
        
        if (remainder == 0)
        {
            validCard = true;
        }
        
        return validCard;
    }
}

    
