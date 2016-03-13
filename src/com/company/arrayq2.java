package com.company;

import java.util.HashMap;



/**
 * Created by Dean Hermanudin on 3/13/16.
 */

/*Implement an algorithm to determine if a
 *string has all unique characters.
 *What if you cannot use additional data structures?
 */
public class arrayq2 {
    public static boolean checkUnqiue(String s)
    {
        HashMap storeChar = new HashMap();
        for(int i = 0; i < s.length(); i++)
        {
            if(storeChar.containsValue(s.charAt(i)))
               return false;
            else
               storeChar.put(i, s.charAt(i));
        }
        return true;
    }

}
