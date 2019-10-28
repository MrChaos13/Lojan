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
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int[] arrMyNumbers = new int[5];
        int[] arrAwesomeMyNumbers = new int[8];
        
        String[] arrMyStrings= {"Ronald", "Brother", "Father", "Mother"};
        
        Rabbit[] arrMyBunnies = new Rabbit[15];
        Rabbit[] arrMyBunnies2 = new Rabbit[15];
        
        
        arrMyNumbers[2] = 5;
        arrMyNumbers[0] = 15;
        arrMyNumbers[1] = 10;
        arrMyNumbers[3] = 35;
        arrMyNumbers[4] = 25;
        
        arrAwesomeMyNumbers[2] = 7;
        arrAwesomeMyNumbers[0] = 14;
        arrAwesomeMyNumbers[1] = 21;
        
        ArraysManipulations am = new ArraysManipulations();
        //am.printArraysData(arrMyNumbers);
        
       //am.printArraysData(arrAwesomeMyNumbers);
        //am.printArraysData(arrMyStrings);
        
        for (int i=0;i<15;i++) {  
            arrMyBunnies[i] = new Rabbit();
            
        }
        am.printArraysData(arrMyBunnies);
        
       
      /*  int i = 0;
        for (Rabbit r : arrMyBunnies) { 
            arrMyBunnies2[i] = r;
            i++;
        } */
        
        
        
       
        
        // TODO code application logic here
    }
    
}
