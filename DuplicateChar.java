package com.smru;

//Arrays & Strings
//Algo to determine if String has all unique chars
//not using additional Data Structure
//ASCII -->256 chars
//time complexity O(n)
//Space complexity O(1)

public class DuplicateChar {

    public static boolean isUniqueChars2(String str)
    {
        if(str.length() >256 )
            return false;

        boolean[] char_set = new boolean[256];
        for(int i=0;i<str.length();i++)
        {
            int val= str.charAt(i);
            if(char_set[val])
            {
                //already found
                return false;
            }char_set[val]=true;
        }
        return true;

    }


    public static void main(String[] args) {
	// write your code here

        String S="Smruti";
        String s1="Smrutee";

        System.out.println("checking if string has unique chars");
        boolean res = isUniqueChars2(S);
        System.out.println("first " +res);

        res=isUniqueChars2(s1);
        System.out.println("second " + res);
    }
}
