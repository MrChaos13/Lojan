/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author cstuser
 */
public class Rabbit {
    private int speed; 
    private String Name;
    private static int counter = 0;
    private int a = 4;
    public Rabbit() { 
        Rabbit.counter++;
        this.speed = 15;
        if (Rabbit.counter%3 == 0) { 
            this.Name = "Bugs";
        }
        else if ( Rabbit.counter%3 == 1) { 
            this.Name = "Babs";
        }
        else { 
            this.Name = "Bobs";
        }
        
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String toString() { 
        String message = "Hi, my name is " + this.Name;
        message += "and my speed is " + this.speed;
        
        return message;
    }
    
}
