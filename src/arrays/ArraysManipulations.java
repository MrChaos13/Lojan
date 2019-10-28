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
public class ArraysManipulations {
    
    
    public void printArraysData(int [] myArray) { 
        for (int i = 0; i < myArray.length; i++) { 
            System.out.println(myArray[i]);
        
        }
    }
     
    public void printArraysData(String [] myArray) { 
        /*System.out.print("[ ");
        System.out.print(myArray[0] + ", ");
        System.out.print(myArray[1] + ", ");
        System.out.print(myArray[2]);
        System.out.print(" ]"); */
        
        for(int i=0; i<myArray.length; i++) { 
            System.out.print("[ " + myArray[i] + ", ]");
            
        }
        
    }
    
    public void printArraysData(Rabbit[] myArray) {
            for(int i=0; i<myArray.length; i++) { 
                System.out.println(myArray[i].toString());
            
            }
            
            /*System.out.println("================================");
            for(Rabbit MyBunny: myArray) { 
            System.out.println(MyBunny);
            }*/
    }
        
    
            
}
        
    

