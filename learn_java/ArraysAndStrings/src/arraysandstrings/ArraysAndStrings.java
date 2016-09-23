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
public class ArraysAndStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        
        try {       
            string_unique_carr alex = new string_unique_carr(args[0]);
            boolean answer = alex.has_unique();            
        } catch (RuntimeException e) {
            System.out.println("No argument provided.");
            System.exit(0);               
        }                       
    }     
}
