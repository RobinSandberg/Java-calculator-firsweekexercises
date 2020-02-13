package se.lexicon.robin;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        String firstName = "Robin";
        String lastName = "Sandberg";
        int age = 37;
        String hobby = "Gaming";

        double income = 130.50;
        double bonus = 49.50;

        System.out.println("Fullname: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Hobby: " + hobby);
        System.out.println("Earned a total of " + (income + bonus) + " kronor this year.");

        Car car = new Car();
        car.brand = "Volvo";
        car.registration = "BTH609";
        car.maxSpeed = 220;
        car.owner = "Robin Sandberg";
        System.out.println("Car: " + car.brand);
        System.out.println("Registration number: " + car.registration);
        System.out.println("Top speed: " + car.maxSpeed);
        System.out.println("Owner: " + car.owner);

        int score = 82;

        if(score >= 65){
            System.out.println("You passed");
        } else{
            System.out.println("You did not pass");
        }

        System.out.print("What is your favorite animal? ");
        String animal =  getStringFromUser();
        System.out.println("Your favorite animal is: " + animal);

    }

    static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

class Car{
    String brand;
    String registration;
    int maxSpeed;
    String owner;
}

