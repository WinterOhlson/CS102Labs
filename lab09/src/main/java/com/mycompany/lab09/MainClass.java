/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab09;

/**
 *
 * @author jehuv
 */
public class MainClass {

    public static void main(String[] args) {
        User user01 = new User("Saba", "Chicago");
        user01.tweet("Hello everyone! This is my first tweet!").display();     
        
        User user02 = new User("Joe");
        user02.tweet("Hi! This is Joe!").display();
        
        User user03 = new User("Emily", "NYC");
        user03.tweet("Such a beautiful day in New York today!").display();
        
        user02.tweet("I wish I could get some pizza right now.").display();
        
        user02.follow(user01);
        user03.follow(user01);
        user02.follow(user03);
        
        user01.displayFollowers();
        user03.displayFollowers();
    }
}
