package com.company;

import java.util.Scanner;

public class CW01 {

    public static void colorsCauseWhyNot() { //Note: This section is entirely optional.
        System.out.println("This text is kind of boring");
        System.out.println("Want to some " + Colors.green + "color" + Colors.reset +"?");
    }

    public static void vocabReview() {
        String myAnswer = ""; //TODO: Put answer here
        System.out.println("The " + myAnswer + "  translates Java code into a class file that can be run on your computer.");

        myAnswer = ""; //TODO: Put answer here
        System.out.println("A String " + myAnswer + " is enclosed in double quotes(\"\")"); //Why do you think I needed to include the \ before each quotation mark?

        myAnswer = ""; //TODO: Put answer here
        System.out.println("When using System.out.println(), the new line break happens " + myAnswer + " the text is shown."); //Before or after?

        myAnswer = ""; //TODO: Put answer here
        System.out.println("The Java keyword + " + myAnswer + " prevents even the programmer from being able to change that variable's value."); //Before or after?

        myAnswer = ""; //TODO: Put answer here
        System.out.println("The Java keyword + " + myAnswer + " prevents even the programmer from being able to change that variable's value."); //Before or after?

        myAnswer = ""; //TODO: Put answer here
        System.out.println("The two types of variables are object/reference variables and " + myAnswer);

        myAnswer = ""; //TODO: Put answer here
        System.out.println("A quick trick to identify a primitive variable is that it is " + myAnswer);
    }


    public static void variableTypes() {
    /*
    Attached to this project are two pictures. Looking at the information in each picture,
    create the appropriate variables to reflect the information displayed on each card.

    After setting up the variables, have them show using System.out.println()
     */
    }

    public static void mathOhNo() {
        Scanner userInput = new Scanner(System.in); //This is covered in Unit 1.4

        System.out.println("What is the value of: 2-3*4");
        int answer = 2-3*4;
        System.out.print("Your Guess: ");
        int userGuess = userInput.nextInt(); //This will store the value the user types as an int into the variable "userGuess"
        System.out.println();
        System.out.println("You guessed: " + userGuess);
        System.out.println("The answer is: " + answer);
        System.out.println();

        System.out.println("What is the value of: 2*3%4");
        answer = 2*3%4;
        System.out.print("Your Guess: ");
        userGuess = userInput.nextInt();
        System.out.println("You guessed: " + userGuess);
        System.out.println("The answer is: " + answer);
        System.out.println();

        System.out.println("What is the value of: 1/(5-3)");
        answer = 1/(5-3);
        System.out.print("Your Guess: ");
        userGuess = userInput.nextInt();
        System.out.println("You guessed: " + userGuess);
        System.out.println("The answer is: " + answer);
        System.out.println();

        System.out.println("What is the value of: 5%3");
        answer = 5%3;
        System.out.print("Your Guess: ");
        userGuess = userInput.nextInt();
        System.out.println("You guessed: " + userGuess);
        System.out.println("The answer is: " + answer);
        System.out.println();

        System.out.println("What is the value of: 2*(4-3)");
        double answer2 = 2*(4-3.0);
        System.out.print("Your Guess: ");
        userGuess = userInput.nextInt();
        System.out.println("You guessed: " + userGuess);
        System.out.println("The answer is: " + answer2);
        System.out.println();

        System.out.println("What is the value of: 2*(4-3.0)");
        answer2 = 2*(4-3.0);
        System.out.print("Your Guess: ");
        userGuess = userInput.nextInt();
        System.out.println("You guessed: " + userGuess);
        System.out.println("The answer is: " + answer2);
        System.out.println();
    }

    public static void comparisonOperator() {
        Scanner userInput = new Scanner(System.in);
        boolean userGuess;

        System.out.println("What is the value of: 5==3");
        System.out.print("Your Guess: ");
        userGuess = userInput.nextBoolean();
        System.out.println("You guessed: " + userGuess);
        System.out.println("The answer is: " + (5==3));
        System.out.println();

        System.out.println("What is the value of: 5!=3");
        System.out.print("Your Guess: ");
        userGuess = userInput.nextBoolean();
        System.out.println("You guessed: " + userGuess);
        System.out.println("The answer is: " + (5==3));
        System.out.println();

        System.out.println("What is the value of: true == true");
        System.out.print("Your Guess: ");
        userGuess = userInput.nextBoolean();
        System.out.println("You guessed: " + userGuess);
        System.out.println("The answer is: " + (true==true));
        System.out.println();

        System.out.println("What is the value of: false == false");
        System.out.print("Your Guess: ");
        userGuess = userInput.nextBoolean();
        System.out.println("You guessed: " + userGuess);
        System.out.println("The answer is: " + (false==false));
        System.out.println();
    }

    public static void compoundOperators() {
        int a = 10;
        double b = 8;
        int c = 4;
        int d = 2;

        //Convert the problems into their compound form.
        a = a * d; //TODO: Convert
        b = b - 3 * b; //TODO: Convert
        a = a%2; //TODO: Convert

        //Convert/Rewrite the problems use the increment/decrement operator specifically.
        a = a + 1;
        b = b + 1;
        c = c - 1;
        d = d - 1;
    }

    public static void yerAWizard() {
    //Get it? Because this is a section about Casting.

    int a = 10;
    double b = 10;
    System.out.println(a);
    System.out.println(b); //Notice how the output includes decimal even when we didn't. That's because it is a double.

    System.out.println(a+b); //Notice what the output is formatted for.
    System.out.println(a+(int)b); //We temporarily 'Cast' b into an int by placing (int) next to it
    System.out.println(b); //Notice b is still a double. The 'Cast' is temporary.


    }

    }