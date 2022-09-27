/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jehuv
 */
public class MainClass {
    public static void main(String[] args)
    {
        int[] emptyList = {};
        int[] listWithN = {0, 2, 5, 7};
        int[] listWithout = {1, 3, 7, 9};
        double[] doubleList = {0.0, 2.0, 5.0, 7.0};
        char[] charList = {'0', '2', '5', '7'};
        
        System.out.println("mySearch() on an empty list:");
        System.out.println(mySearch(emptyList, 5));
        System.out.println("mySearch() on a list with n:");
        System.out.println(mySearch(listWithN, 5));
        System.out.println("mySearch() on a list without n:");
        System.out.println(mySearch(listWithout, 5));
        System.out.println("mySearch() on a list of Doubles instead of Integers:");
        System.out.println(mySearch(doubleList, 5));
        System.out.println("mySearch() on a list of Characters instead of Integers:");
        System.out.println(mySearch(charList, 5));
    }
    
    public static int mySearch(int[] inputArray, int n)
    {
        for(int i = 0; i < inputArray.length; i++)
        {
            if((int) inputArray[i] == n)
            {
                return i;
            }
        }
        return -1;
    }
}
