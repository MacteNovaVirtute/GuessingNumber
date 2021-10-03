package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        boolean guessedRight = false;
        Random randomPseudo = new Random();
        int random = randomPseudo.nextInt(3);
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Guess the number: ");
            int guess = scanner.nextInt();
            if (guess == random) {
                System.out.println("Congrats");
                guessedRight = true;
            } else if (guess > random) {
                System.out.print("Its less then your number");
            } else {
                System.out.print("Its bigger your number");
            }
        } while(!guessedRight);



    }
}
