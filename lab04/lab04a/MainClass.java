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
        Integer[] integerList = {1, 2, 5, 8};
        double[] doubleList = {0.0, 2.0, 5.0, 7.0};
        Double[] wrapperDoubleList = {0.0, 2.0, 5.0, 7.0};
        char[] charList = {'0', '2', '5', '7'};
        Character[] characterList = {'0', '2', '5', '7'};
        
        System.out.println("mySearch() on an empty list:");
        System.out.println(mySearch(emptyList, 5));
        System.out.println("mySearch() on a list with n:");
        System.out.println(mySearch(listWithN, 5));
        System.out.println("mySearch() on a list without n:");
        System.out.println(mySearch(listWithout, 5));
        System.out.println("mySearch() on a list with Integers instead of ints");
        System.out.println(mySearch(integerList, 5));
        System.out.println("mySearch() on a list of doubles instead of ints:");
        System.out.println(mySearch(doubleList, 5));
        System.out.println("mySearch() on a list of Doubles instead of ints:");
        System.out.println(mySearch(wrapperDoubleList, 5));
        System.out.println("mySearch() on a list of chars instead of ints:");
        System.out.println(mySearch(charList, 5));
        System.out.println("mySearch() on a list of Characters instead of Integers:");
        System.out.println(mySearch(characterList, 5));
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
    
    public static int mySearch(Integer[] inputArray, int n)
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
    
    public static int mySearch(double[] inputArray, int n)
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
    
    public static int mySearch(Double[] inputArray, int n)
    {
        for(int i = 0; i < inputArray.length; i++)
        {
            if((int) ((double) inputArray[i]) == n)
            {
                return i;
            }
        }
        return -1;
    }
    
    public static int mySearch(char[] inputArray, int n)
    {
        for(int i = 0; i < inputArray.length; i++)
        {
            int valueOfChar = (int) inputArray[i];
            if(valueOfChar >= 48 && valueOfChar <= 57)
            {
                if(valueOfChar - 48 == n)
                {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public static int mySearch(Character[] inputArray, int n)
    {
        for(int i = 0; i < inputArray.length; i++)
        {
            int valueOfChar = (int) inputArray[i];
            if(valueOfChar >= 48 && valueOfChar <= 57)
            {
                if(valueOfChar - 48 == n)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
