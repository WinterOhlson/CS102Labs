/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab11;

/**
 *
 * @author jehuv
 */
public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Node root = new Node(20);
        root.left = new Node(15);
        root.right = new Node(30);
        root.left.left = new Node(10);
        root.left.left.right = new Node(12);
        root.left.right = new Node(18);
        root.left.left.left = new Node(10);
        
        System.out.println("Searching the tree for the number 12 returns " + root.search(12));
        System.out.println("Searching the tree for the number 7 returns " + root.search(7));
    }
}
