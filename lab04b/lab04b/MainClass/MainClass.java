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
        int[] initialArray = {5, 3, 16, 9, 9, 17, 23, 22, 27, 34, 32};
        mySort(initialArray);
        System.out.println("The sorted result is:");
        for(int i : initialArray)
        {
            System.out.println(i);
        }
    }
    
    public static void mySort(int[] inputArray)
    {
        int arraySize = inputArray.length;
        for(int i = 0; i < arraySize - 1; i++)
        {
            int index = i;
            for(int j = i + 1; j < arraySize; j++)
            {
                if(inputArray[j] < inputArray[index])
                {
                    index = j;
                }
            }
            int temp = inputArray[i];
            inputArray[i] = inputArray[index];
            inputArray[index] = temp;
        }
    }
}
