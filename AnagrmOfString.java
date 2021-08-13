package com.smru;

public class AnagrmOfString {
    //two pproaches
    // 1.Sort

    public String sort(String s)
    {
        char [] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }


    //not much optimised
    public boolean permutation(String s, String t)
    {
        if(s.length() != t.length())
            return false;
        return sort(s).equals(sort(t));
    }

    //improved version
    public static boolean permutationimprovised (String s, String t)
    {
        if(s.length() != t.length())
            return false;

        int [] letters = new int[256];
        char [] s_array = s.toCharArray();
        for(char c : s_array) //count number of ech char in s
        {
          int m =  letters[c]++;
          int n=0;
        }

        for(int i=0;i< t.length();i++)
        {
            int c = (int)t.charAt(i);
            int x = --letters[c];
            if(x<0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s1="god";
        String S2="dog";
        boolean isAnagram =permutationimprovised(s1,S2);
        System.out.println("isAnagram : "+ isAnagram);
    }
}
