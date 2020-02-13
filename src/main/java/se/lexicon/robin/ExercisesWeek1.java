package se.lexicon.robin;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class ExercisesWeek1 {

    public static void main( String[] args ){

        char running = 'n';
        while (running == 'n' || running == 'N') {
            System.out.println("Choose exercises to inspect.");
            System.out.println("1. Hello name.");
            System.out.println("2. leap year.");
            System.out.println("3. hard code calculation.");
            System.out.println("4. average.");
            System.out.println("5. input name.");
            System.out.println("6. input calculation.");
            System.out.println("7. seconds convert.");
            System.out.println("8. guess number.");
            int exercises = getNumber();
            switch (exercises) {
                case 1:
                    exercisesOne();
                    break;
                case 2:
                    exercisesTwo();
                    break;
                case 3:
                    exercisesTree();
                    break;
                case 4:
                    exercisesFour();
                    break;
                case 5:
                    exercisesFive();
                    break;
                case 6:
                    exercisesSix();
                    break;
                case 7:
                    exercisesSeven();
                    break;
                case 8:
                    exercisesEight();
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            running = menuOption();
        }

    }

    static void exercisesOne(){
        String name = "Robin";
        System.out.println("Hello");
        System.out.println(name + "!");
    }

    static void exercisesTwo(){
        System.out.print("Type in a year to check if it's a leap year.");
        int year = getNumber();

        String isLeapYear = LocalDate.of(year,1,1).isLeapYear() ? "It's a leap year." : "It's not a leap year";

        System.out.println(isLeapYear);
    }
    static void exercisesTree(){
        int first = 45;
        int second = 11;
        int third = 12;
        int four = 4;
        int five = 24;
        int six = 6;
        int seven = 55;
        System.out.println(first + " + " + second + " = " + (first + second));
        System.out.println(third + " * " + four + " = " + (third * four));
        System.out.println(five + " / " + six + " = " + (five / six));
        System.out.println(seven + " - " + third + " = " + (seven - third));
    }
    static void exercisesFour(){
        System.out.print("Pick 3 numbers to calculate the average.");
        int numberTree = getNumber();
        int numberFour = getNumber();
        int numberFive = getNumber();
        System.out.println("This is the average of your selection: " + (numberTree + numberFour + numberFive) / 3);
    }
    static void exercisesFive(){
        Person person = new Person();
        System.out.print("What is  your name? ");
        person.name = getStingFromUser();
        System.out.println("Hello " + person.name);
    }
    static void exercisesSix(){
        System.out.print("Select 2 numbers to be calculated.");
        int numberOne = getNumber();
        int numberTwo = getNumber();
        System.out.println("Your numbers are added up to: " + (numberOne + numberTwo));
        System.out.println("Your numbers are subtracted to: " + (numberOne - numberTwo));
        if(numberOne != 0 || numberTwo != 0) {
            System.out.println("Your numbers are divided to: " + (numberOne / numberTwo));
        }
        System.out.println("Your numbers are multiplied to: " + (numberOne * numberTwo));
    }
    static void exercisesSeven(){
        System.out.print("Type in an amount of seconds. ");
        int seconds = getNumber();
        if(seconds >= 0 || seconds <= 86399 ){
            System.out.println("This is how many hours , minutes and seconds there is: " + LocalTime.ofSecondOfDay(seconds));
        }else{
            System.out.println("Below 0 or higher then 24 hours worth.");
        }
    }
    static void exercisesEight(){
        Random random = new Random();
        int number = random.nextInt(499);
        number += 1;

        System.out.println("Guess the number between 1 and 500.");
        boolean right = false;
        while (!right) {
            int guess = getNumber();
            if(guess == number){
                right = true;
                System.out.println("You guess correct.");
            }else if(guess < number){
                System.out.println("You guessed to low try again.");
            }else if(guess > number){
                System.out.println("You guessed to high try again.");
            }
        }
    }

    static String getStingFromUser(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static int getNumber(){
        boolean valid = false;
        int number = 0;
        while(!valid){
            try{
                number = Integer.parseInt(getStingFromUser().trim());
                valid = true;
            }catch(NumberFormatException e){
                System.out.println("Input was not a number");
            }
        }
        return number;
    }

    static char menuOption(){
        System.out.println("Are you done inspecting?");
        System.out.print("Y/N: ");
        boolean valid = false;
        char input = 'n';
        while (!valid){
            input = getStingFromUser().charAt(0);
            if(input == 'y' || input == 'n' || input == 'Y' || input == 'N'){
                valid = true;
            }else{
                System.out.println("Wrong choose");
            }
        }
        return input;
    }

}

class Person{
    String name;
}
