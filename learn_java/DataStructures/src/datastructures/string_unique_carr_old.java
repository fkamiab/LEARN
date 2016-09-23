/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author Farbod.Kamiab
 */
public class string_unique_carr_old {
    boolean isUniqueChars2(String str){
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i);
            int val = str.charAt(i);
            System.out.println(val);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }
}
