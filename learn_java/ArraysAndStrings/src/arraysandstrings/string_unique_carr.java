/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysandstrings;

/**
 *
 * @author Farbod.Kamiab
 */
public class string_unique_carr {
    String input_string;
    
    string_unique_carr(String a){
        input_string = a;
    }
    
    public void print_input_string(){
        System.out.println(input_string);
    }
    
    public char[] split_char(){
        return input_string.toCharArray();
    }
    
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
