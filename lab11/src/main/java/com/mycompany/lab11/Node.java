/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab11;

/**
 *
 * @author jehuv
 */
public class Node {
    private int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    
    public boolean search(int num)
    {
        if(this.value == num)
        {
            return true;
        }
        else if(num < this.value && this.left != null)
        {
            return this.left.search(num);
        }
        else if(num > this.value && this.right != null)
        {
            return this.right.search(num);
        }
        else
        {
            return false;
        }
    }
}
