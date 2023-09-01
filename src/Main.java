/*
Todo: how should my hangman work?
 * choose a word
  - statiskt
  - lista
  - user input
 * user inputs a letter
  - check user input
 * check if letter is in the word
  - multiple instances?
 * check where letter is
 * write the letter
 * life counter
 * loop till done
  - no more life
  - word complete
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to hangman!");

        //choose a word
        String word = "flaggstångsknoppspoleringsmedel";
        System.out.println(word);

        // set the amount of lives (tries)
        int lives = 8;
        boolean wordIsRevealed;


        //Create an array of letters
        char[] letters = word.toCharArray();
        String[] reveal = new String[word.length()]; // this is where the revealed letter will be displayed

        // fyll reveal med _
        for (int i = 0; i < reveal.length; i++) {
            reveal[i] = "_";
        }


        //Create a scanner to be able to ask for user input
        Scanner myScan = new Scanner(System.in);
        do {
            wordIsRevealed = true;
            String guess;

            // Check user guess
            // Ask user for input
            while (true) {
                System.out.print("Guess a letter: ");
                guess = myScan.nextLine();
                // Check that input is a letter
                if ((guess.matches("[a-öA-Ö]+")) &&
                        (guess.length() == 1)) {
                    break;
                }
                System.out.println("Please guess a single letter");
            }


            // System.out.println("the guess is " + guess);
            //create check value for letter
            boolean letterFound = false;

            //checks if the guessed letter exists in our word
            for (int i = 0; i < letters.length; i++) {

                if (guess.equalsIgnoreCase(String.valueOf(letters[i]))) {
                    //print letter to revealed word
                    reveal[i] = guess.toLowerCase();
                    letterFound = true;
                }
                if (reveal[i].equals("_")) {
                    wordIsRevealed = false;
                }

            }

            if (!letterFound) { // same as letterFound == false
                lives--;
            }

            //print the current revealed word and remaining lives
            printList(reveal);
            System.out.println("you now have " + lives + " lives left");

        } while ((lives > 0) && (!wordIsRevealed));

        System.out.println("game over");
    }

    //prints the content of a String Array
    public static void printList(String[] myString) {
        /*
        for (int i = 0; i < myString.length; i++) {

            System.out.print(myString[i]);
        }
         */

        for (String myLetter : myString) {
            System.out.print(myLetter);
        }
        System.out.println();
    }
}














