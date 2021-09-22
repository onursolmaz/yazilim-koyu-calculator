package com.renova.enumExample;
import java.util.Scanner;


public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Please your weight: ");
        double userWeight=input.nextDouble();

        for (Planets plant: Planets.values()){
            double weight = Planets.calculate(plant, userWeight);
            System.out.printf("%s = %.2f\n", plant, weight);
        }
    }

}
