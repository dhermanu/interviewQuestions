package com.company;

/**
 * Created by Dean Hermanudin on 3/13/16.
 */

/*1.4 Write a method to replace all spaces in a string with ‘%20’.
 *You may assume that the string has sufficient space
 * at the end of the string to hold the additional characters,
 * and that you are given the “true” length of the string.
 */

public class arrayq1 {
    public String new20String(String s, int length)
    {
        char[] content = s.toCharArray();
        int spaceCount  = 0;
        int newLength = 0;

        //check for white spaces
        for(int i = 0; i < length; i++)
        {
            if(content[i] == ' ')
                spaceCount++;
        }

        newLength = spaceCount*2 + length;
        content [newLength] = '\0';

        for(int i = length - 1; i >= 0; i--)
        {
            if (content[i] == ' ')
            {
                content[newLength-1] = '0';
                content[newLength-2] = '2';
                content[newLength-3] = '%';
                newLength = newLength-3;
            }

            else
            {
                content[newLength-1] = content[i];
                newLength = newLength-1;
            }
        }
        return new String(content);
    }
}
