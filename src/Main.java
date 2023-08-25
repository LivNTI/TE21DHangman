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

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to hangman!");
        // howInputAndOutputWorks();

        String word = "flaggstångsknoppspoleringsmedel";

        //Create an array of letters
        char[] letters = word.toCharArray();
        String[] reveal = new String[word.length()]; // this is where the revealed letter will be displayed

        // fyll reveal med _
        for (int i = 0; i < reveal.length; i++) {
            reveal[i] = "_";
        }

        //String[] testlist = {"hej", "hopp", "hejsan"};
        //printList(reveal);
        //printList(testlist);
        //printList(); // fungerar inte. Metoden måste får en String[] för att fungera!!!
        //howInputAndOutputWorks(testlist); // vi får inte göra så här!!! metoden tar inte emot några parametrar

        //Create a scanner to be able to ask for user input
        Scanner myScan = new Scanner(System.in);

        // Ask user for input
        System.out.println("Guess a letter:");
        String guess = myScan.nextLine();

        // System.out.println("the guess is " + guess);

        for (int i = 0; i < letters.length; i++) {

            if (guess.equals(String.valueOf(letters[i]))) {
                System.out.println("Letter " + guess + " is in the word");
                System.out.println("It is at index" + i);

            }
        }


    }


    public static void printList(String[] myString) {
        for (int i = 0; i < myString.length; i++) {
            System.out.println("at index " + i + " is letter " + myString[i]);
        }
    }


    public static void howInputAndOutputWorks() {
        System.out.println("To print in console typee:");
        System.out.println(" sout + tab");

        Scanner myScan = new Scanner(System.in);
        String input = myScan.nextLine();

        System.out.println("My input was " + input);
    }

}


// this is a single line of comment
/*
This
is
a
block
comment
 */