/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysandstrings;

/**
 * Practicing various problems regarding arrays and strings in Java.
 * @author Farbod.Kamiab
 */
public class ArraysAndStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        
        try {       
            string_unique_carr problem_1 = new string_unique_carr(args[0]);
            //boolean answer = problem_1.has_unique();       
            boolean answer2=problem_1.isUniqueChars2();
        } catch (RuntimeException e) {
            System.out.println("No argument provided.");
            System.exit(0);               
        }                       
    }     
}
