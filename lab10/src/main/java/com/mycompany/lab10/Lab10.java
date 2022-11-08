/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab10;

import java.util.Stack;

/**
 *
 * @author jehuv
 */
public class Lab10 {

    public static void main(String[] args) {
        String equation1 = "4 * (5 - 3)";
        String equation2 = "(3 + (5 * 4)";
        String equation3 = "4 + (5 * (2 * 3)))";
        String equation4 = "))3 * 2((";
        
        System.out.println("Checking the equation " + equation1 + " returns " + checkEquation(equation1));
        System.out.println("Checking the equation " + equation2 + " returns " + checkEquation(equation2));
        System.out.println("Checking the equation " + equation3 + " returns " + checkEquation(equation3));
        System.out.println("Checking the equation " + equation4 + " returns " + checkEquation(equation4));
    }
    
    public static boolean checkEquation(String equation)
    {
        Stack<Character> myStack = new Stack<>();
        for(int i = 0; i < equation.length(); i++)
        {
            if(equation.charAt(i) == '(' || equation.charAt(i) == ')')
            {
                myStack.push(equation.charAt(i));
            }
        }
        
        int balance = 0;
        for(Character character : myStack)
        {
            if(character == '(')
            {
                balance += 1;
            }
            else if(character == ')')
            {
                balance -= 1;
            }
            if(balance < 0)
            {
                return false;
            }
        }
        if(balance == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
