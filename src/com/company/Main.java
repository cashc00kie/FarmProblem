package com.company;
import java.util.Scanner;
public class Main {



    public static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        animals();//this is a method call - this calls a method
    }

    public static int animals() {
        System.out.println("How many chickens");
        int chicken = input.nextInt() * 2;
        System.out.println("How many cows");
        int cows = input.nextInt() * 4;
        System.out.println("How many pigs");
        int pigs = input.nextInt() * 4;
        int legs = chicken + cows + pigs; // legs is a local variable, it only exists in the scope of animals method
        System.out.println();
        System.out.println(legs);
        return legs;
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

