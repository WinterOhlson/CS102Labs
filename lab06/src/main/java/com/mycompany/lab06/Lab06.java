/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab06;

/**
 *
 * @author jehuv
 */
public class Lab06 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        MisspelledVar.main(args);
        RTErrorDemo.main(args);
        IncorrectMessage.main(args);
    }
}
class MisspelledVar {
    public static void main(String[] args) {
        int a = 5, b = 10;
        
        int Sum = a + b;
        
        System.out.println("Sum of variables is " + sum);
    }
}
class RTErrorDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        
        arr[9] = 250;
        
        System.out.println("Value assigned! ");
    }
}
class IncorrectMessage {
    public static void main(String[] args) {
        int a = 2, b = 8, c = 6;
        System.out.println("Finding the largest number \n");
        
        if (a > b && a > c) {
            System.out.println(a + " is the largest Number");}
        else if (b > a && b > c) {
            System.out.println(b + " is the smallest Number");}
        
        // The correct message should have been 
        // System.out.println(b + " is the
        // largest Number"); to be correct
        
        else {
            System.out.println(c + " is the largest Number");}
    }
}