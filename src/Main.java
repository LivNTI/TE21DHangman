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
        // howInputAndOutputWorks();


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