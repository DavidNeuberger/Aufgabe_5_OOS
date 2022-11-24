package de.hfu;

import java.util.Scanner;

public class App {
    

    
    /** 
     * @param args this is a comment
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bitte geben Sie das wort ein");
        String input = keyboard.nextLine();
        System.out.println(input.toUpperCase());
        keyboard.close();

    }
}