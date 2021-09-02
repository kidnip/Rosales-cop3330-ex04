package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rosales Jeremy
 */
public class MadLib {
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        Word Noun1 = new Word();
        Word Verb1 = new Word();
        Word Adjective1 = new Word();
        Word Adverb1 = new Word();

        System.out.print( "Enter a noun: " );
        Noun1.setString(input.next());
        System.out.print( "Enter a verb: " );
        Verb1.setString(input.next());
        System.out.print( "Enter a adjective: " );
        Adjective1.setString(input.next());
        System.out.print( "Enter a adverb: " );
        Adverb1.setString(input.next());

        System.out.printf("Do you %s your %s %s %s? That's hilarious!", Verb1.getString(), Adjective1.getString(),
                Noun1.getString(), Adverb1.getString());
    }
}
