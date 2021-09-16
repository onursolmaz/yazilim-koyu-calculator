package com.renova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
//    static Double result=0.0;

    public static void main(String[] args) {

        int choice;
        boolean status = true;
        Double result=0.0;
        List<Double> resultsDB = new ArrayList<Double>();   // To keep user saved results


        while (status) {
            printMenu();

            System.out.print("Please enter operation: ");
            choice = input.nextInt();

            switch (choice) {
                case 0:
                    status = false;
                    break;
                case 1:
                   result= addition();
                    break;
                case 2:
                    result= subtraction();
                    break;
                case 3:
                    result=  multiplication();
                    break;
                case 4:
                    result=  division();
                    break;
                case 5:
                    result= mode();
                    break;
                case 6:
                    resultsDB.add(result);
                    System.out.println("Result successfully saved");
                    break;
                case 7:
                    printResultsFromDB(resultsDB);
                    resultsDB.removeAll(resultsDB);
                    break;
                default:
                    System.out.println("Please enter valid number !!!");
            }
            System.out.println("--------------------------------");
        }

    }

    public static Double addition() {
        List<Integer> numbers = getNumbersFromUser();
        Double result = 0.0;
        for (int num : numbers) {
            result += num;
        }
        System.out.printf("result is= %.2f\n", result);
        return result;
    }

    public static Double subtraction() {
        List<Integer> numbers = getNumbersFromUser();
        Double result = Double.valueOf(numbers.get(0));
        numbers.set(0, 0);
        for (int num : numbers) {
            result -= num;
        }
        System.out.printf("result is= %.2f\n", result);
        return result;
    }

    public static Double multiplication() {
        List<Integer> numbers = getNumbersFromUser();
        Double result = 1.0;
        for (int num : numbers) {
            result *= num;
        }
        System.out.printf("result is= %.2f\n", result);
        return result;
    }

    public static Double division() {
        List<Integer> numbers = getNumbersFromUser();
        Double result = Double.valueOf(numbers.get(0));
        numbers.set(0, 1);
        for (int num : numbers) {
            result /= num;
        }
        System.out.printf("result is= %.2f\n", result);
        return result;
    }

    public static Double mode() {
        int num1, num2;

        System.out.println("please enter your first number");
        num1 = input.nextInt();

        System.out.println("Please enter your second number");
        num2 = input.nextInt();

        Double result= Double.valueOf(num1%num2);
        System.out.println("result is = " + result);
        return result;

    }


    // Get numbers from user until enter -1 and must enter at least two number
    private static List<Integer> getNumbersFromUser() {
        int i = 1, inputNumber = 0;
        boolean status=true;
        List<Integer> numbers = new ArrayList<Integer>();
        while (status) {
            System.out.print("enter your " + i + ". number(for exit:-1): ");
            inputNumber = input.nextInt();

            if (inputNumber == -1) {
                if(numbers.size()<2){
                    System.out.println("enter at least two numbers");
                }else
                    break;
            }else{
                numbers.add(inputNumber);
                i++;
            }
        }
        return numbers;
    }


    public static void printMenu() {
        String[] operations = {
                "[1] addition",
                "[2] subtraction",
                "[3] multiplication",
                "[4] division",
                "[5] Mode",
                "[6] Save Memory",
                "[7] Print from memory and clean",
                "[0] Exit"
        };
        for (String operation : operations) {
            System.out.println(operation);
        }
    }

    // Print results saved memory
    public static void printResultsFromDB(List<Double> results){
        System.out.println("-------------Last Results-------------------");
        for(Double result:results){
            System.out.printf((results.indexOf(result)+1) + ". result: %.2f \n", result);
        }
    }

}

