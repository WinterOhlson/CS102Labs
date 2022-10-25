/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab09;

import java.util.ArrayList;

/**
 *
 * @author jehuv
 */
public class User {
    private String name;
    private String location;
    private boolean locationSet;
    
    private ArrayList<User> followers;
    
    public boolean isLocationSet()
    {
        return locationSet;
    }
    
    public void setLocationSet(boolean locationSet)
    {
        this.locationSet = locationSet;
    }
    
    public ArrayList<User> getFollowers()
    {
        return this.followers;
    }
    
    public void addFollower(User user)
    {
        this.followers.add(user);
    }
    
    public void follow(User user)
    {
        user.addFollower(this);
    }
    
    public void displayFollowers()
    {
        System.out.println(this.getName() + "'s Followers: ");
        for(User user : this.followers)
        {
            System.out.println(user.getName());
        }
    }
    
    public User(String name, String location)
    {
        this.name = name;
        this.location = location;
        this.locationSet = true;
        
        this.followers = new ArrayList<>();
    }
    
    public User(String name)
    {
        this.name = name;
        this.location = "No Location Set!";
        this.locationSet = false;
        
        this.followers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public Tweet tweet(String text)
    {
        Tweet newTweet = new Tweet(text, this);
        return newTweet;
    }
}
