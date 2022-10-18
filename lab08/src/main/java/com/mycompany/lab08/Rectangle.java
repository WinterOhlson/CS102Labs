/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab08;

/**
 *
 * @author jehuv
 */
public class Rectangle {
    int width;
    int height;
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Rectangle rect = new Rectangle();
        rect.width = 5;
        rect.height = 3;
        rect.draw();
    }
    
    public void draw()
    {
        for(int i = 0; i < this.height; i++)
        {
            for(int j = 0; j < this.width; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
