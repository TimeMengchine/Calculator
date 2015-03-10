package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int firstNo;
        int secondNo;
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first no:");
        firstNo = input.nextInt();

        System.out.println("Enter second no:");
        secondNo = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Enter choice of operation.\"+ - / % *\"only.");

        operation = op.nextLine();

        if (operation.equals("+")){
            System.out.println("Calculation is: " + (firstNo + secondNo));
        }
        else if (operation.equals("-")){
            System.out.println("Calculation is: " + (firstNo - secondNo));
        }
        else if (operation.equals("/")){
            System.out.println("Calculation is: " + (firstNo / secondNo));
        }
        else if (operation.equals("*")){
            System.out.println("Calculation is: " + (firstNo * secondNo));
        }
        else if (operation.equals("%")){
            System.out.println("Calculation is: " + (firstNo % secondNo));
        }
    }
}
