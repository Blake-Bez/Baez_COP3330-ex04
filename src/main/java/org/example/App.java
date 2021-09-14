/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Blake Baez
 */
package org.example;
import java.util.Scanner;

public class App 
{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a noun: ");
            String noun = input.nextLine();

            System.out.print("Enter a verb: ");
            String verb = input.nextLine();

            System.out.print("Enter an adjective: ");
            String adjective = input.nextLine();

            System.out.print("Enter an adverb: ");
            String adverb = input.nextLine();

            //decided to use %s this time. There is less typing.
            System.out.println(String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb));

        }
    }