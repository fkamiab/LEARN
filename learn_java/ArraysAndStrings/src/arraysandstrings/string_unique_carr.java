/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysandstrings;

/**
 * A collection of methods useful for answering the question: 
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you can not use additional data structures?
 * The class is initialized by specifying the string.
 * @author Farbod.Kamiab
 */


public class string_unique_carr {
    String input_string;
    
    
   /**
    * Initialization by specifying the string.
    * @param a The input string.
    * @author Farbod.Kamiab
    */
    public string_unique_carr(String a){
        input_string = a;
    }
    
    /**
     * Simply prints the input string defined when the class is initialized.
     * @author Farbod.Kamiab
     */
    public void print_input_string(){
        System.out.println(input_string);
    }
    
    /**
     * Splits the input string into an array of characters.
     * @author Farbod.Kamiab
     * @return Character array.
     */
    public char[] split_char(){
        return input_string.toCharArray();
    }
    
    
    /**
     * This method, takes the string, splits it into characters. Then starting 
     * from first character, inspects every character after until it detects repetition.
     * The number of steps taken in order to reach the answer and the answer are printed out.
     * @return The answer is a boolean, whether the string has unique characters or not. 
     */
    
    public boolean has_unique(){
        char[] split_array = split_char();
        int length = split_array.length;
        //System.out.println("The length of the string is " + length + " characters.");
        char character;
        int xx, yy, step_counter;
        xx =0;
        yy=0;
        step_counter=0;
        for (int x=0; x<length; x=x+1){
            character = split_array[x];
            //System.out.println(character);
            for (int y = x+1; y<length; y=y+1){
                if (character == split_array[y]){
                    System.out.println("The string does not have unique characters.");
                    System.out.println("Number of steps were " + (step_counter+1));
                    return false;
                }
                
                step_counter = step_counter+1;
            } 
            
           
        }
        System.out.println("The string has unique characters");
        System.out.println("Number of steps were " + step_counter);
        return true;
    }
}
