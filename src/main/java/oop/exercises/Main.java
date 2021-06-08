package oop.exercises;
import java.util.Scanner;
/*
 * UCF cop3330 Summer 2021 Assignment 1 solutions
 * Copyright 2021 Keondez Robinson
 */
public class Main
{
    public static void main(String[] args)
    {
        int age;
        Scanner input;

        input = new Scanner(System.in);

        System.out.print("What is your age? ");
        age = input.nextInt();
        System.out.println ("You are " + (age < 16 ? "not old enough " : "old enough") + " to legally drive.");

    }
}
