package se.lexicon.robin;

import java.util.Scanner;

public class Calculator {

    public static void main( String[] args ){

        // The 4 variables I need to run the methods and program.
        double firstNumber;
        double secondNumber;
        char operator;
        char running;
        running = menuOption(); // Entry command
        while(running == 'y' || running == 'Y') {
            firstNumber = getNumber();
            operator = getOperator();
            secondNumber = getNumber();
            switch (operator) {
                case '+':
                    System.out.println("Result is; " + addition(firstNumber, secondNumber));
                    break;
                case '-':
                    System.out.println("Result is: " + subtraction(firstNumber, secondNumber));
                    break;
                case '*':
                    System.out.println("Result is: " + multiplier(firstNumber, secondNumber));
                    break;
                case '/':
                    // A check to make sure they don't try to divide with 0.
                    if (firstNumber == 0.0 || secondNumber == 0.0){
                        System.out.println("Can't divide with 0 try again");
                    }else {
                        System.out.println("Result is: " + divide(firstNumber, secondNumber));
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            running = menuOption(); // Stay in loop command
        }
    }
     static double addition(double firstNumber , double secondNumber){ return firstNumber + secondNumber; }

     static double subtraction(double firstNumber , double secondNumber){
        return firstNumber - secondNumber;
     }

     static double multiplier(double firstNumber , double secondNumber){
        return firstNumber * secondNumber;
     }

     static double divide(double firstNumber, double secondNumber) { return firstNumber / secondNumber; }

    static String getStringFromUser() {
        // Simple scanner to get a string from user.
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
     }

     static char menuOption(){
        // Getting a char from user and checking if its a valid option.
         // Using the get string method and looking at the first char in the string.
        System.out.println("User are you ready to do some calculation?");
        System.out.print("Y/N: ");
        boolean valid = false;
        char input = 'n';
        while (!valid){
            input = getStringFromUser().charAt(0);
            if(input == 'y' || input == 'n' || input == 'Y' || input == 'N'){
                valid = true;
            }else{
                System.out.println("Wrong choose");
            }
        }
        return input;
     }

      static double getNumber() {
        // Getting a double from the user using the get string method and parse it into a double if able to.
        System.out.print("Give me a number: ");
        boolean valid = false;
        double number = 0;
        while(!valid) {
            try {
                number = Double.parseDouble(getStringFromUser().trim().replace(',','.'));
                valid = true;
            }catch(NumberFormatException e) {
                System.out.println("Input was not a number");
            }
        }
        return number;
     }

     static char getOperator(){
        // Same as menu option but different options.
        System.out.print("Enter the calculation operator(+ , - , * , /) you want: ");
        boolean valid = false;
        char operator = '+';
        while(!valid){
            operator = getStringFromUser().charAt(0);
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/'){
                valid = true;
            }else{
                System.out.println("Not an operator try again.");
            }
        }
        return operator;
     }
}
