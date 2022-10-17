/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab07;

/**
 *
 * @author jehuv
 */
public class Lab07 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] testArray = {3, 5, 7, 11, 13};
        int findableItem = 13;
        int missingItem = 2;
        
        System.out.println("Using binarySearch() to find " + findableItem + " in array...");
        binarySearch(testArray, findableItem);
        System.out.println("Using binarySearch() to find " + missingItem + " in array...");
        binarySearch(testArray, missingItem);
    }
    
    public static void binarySearch(int[] array, int item)
    {
        // In the following two lines, variables are set to determine how much of the array is being searched
        int first = 0;
        int last = array.length - 1;
        int mid = (first + last) / 2; // In this line, a variable is set to determine which element of the array is being used for comparison
        while(first <= last) // This should only stop in a break statement or if every element of the array has been searched, setting first to last + 1 or last to first -1
        {
            if(array[mid] == item) // This is the case where the item has finally been found
            {
                System.out.println("The item is at index " + mid); // This is equivalent to a return statement, but instead uses a print statement to display the index of the item being searched for
                break; // This ends the while loop without triggering the condition that says the item was unable to be found
            }
            else if(item < array[mid]) // In the condition where the middle of the searched portion of the array is greater than the item being searched for...
            {
                last = mid - 1; // ... only everything to the left of mid gets searched next
            }
            else if(item > array[mid]) // In the condition where the middle of the searched portion of the array is less than the item being searched for...
            {
                first = mid + 1; // ... only everything to the right of mid gets searched next
            }
            
            mid = (first + last) / 2; // This updates mid at the end of every loop to ensure that it's not the same value being compared against the item being searched for every time
        }
        
        if(first > last) // If every element of the array is searched with no success
        {
            System.out.println("The item could not be found in the array. ");
        }
    }
}
