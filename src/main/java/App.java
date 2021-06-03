/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Edmund Johnson V
 */

/*
Write a program to evenly divide pizzas. Prompt for the number of people, the number of pizzas, and the number of slices per pizza. Ensure that the number of pieces comes out even. Display the number of pieces of pizza each person should get. If there are leftovers, show the number of leftover pieces.

Example Output
How many people? 8
How many pizzas do you have? 2
How many slices per pizza? 8
8 people with 2 pizzas (16 slices)
Each person gets 2 pieces of pizza.
There are 0 leftover pieces.
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] arg){
        int people = getPeople();
        int pizzas = getPizzas();
        int slices = getSlices(pizzas);
        System.out.println(confirmation(people, pizzas, slices));
        System.out.println(piecesPerPerson(people, slices));
        System.out.println(remainderSlices(people, slices));
    }

    private static Integer getPeople(){
        System.out.println("How many people?");
        String x = in.nextLine();
        return Integer.parseInt(x.replace(" ", ""));
    }

    private static Integer getPizzas(){
        System.out.println("How many pizzas do you have?");
        String x = in.nextLine();
        return Integer.parseInt(x.replace(" ", ""));
    }

    private static Integer getSlices(int p){
        System.out.println("How many slices per pizza?");
        String x = in.nextLine();
        return Integer.parseInt(x.replace(" ", "")) * p;
    }

    private static String confirmation(int pe, int pi, int s){
        return pe + " people with " + pi + " pizzas (" + s + " slices)";
    }

    // p is equal to the number of people and not the number of pizzas for the next two methods
    private static String piecesPerPerson(int p, int s){
        int x = s / p;
        return "Each person gets " + Math.round(x) + " pieces of pizza.";
    }

    private static String remainderSlices(int p, int s){
        return "There are " + (s % p) + " leftover pieces. ";
    }
}
