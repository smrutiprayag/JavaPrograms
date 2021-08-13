package com.smru;

/*
* method to replace all spaces in String with '%20'
* given the true length of the string
* here char array is used*/

public class ReplaceSpacesInString {

    public static char[] replaceSpaces(char[] str, int length)
    {
        // we will scan twice
        int spaceCount=0,i,newLength;
        for(i=0;i<length;i++)
        {
            if(str[i]==' ')
                spaceCount++;
        }

        //now the new length should be
        newLength = length+spaceCount*2;
        str[newLength]='\0';
        for( i=length-1 ; i>=0;i--)
        {
            if(str[i]==' ')
            {
                str[newLength-1]='0';
                str[newLength-2]='2';
                str[newLength-3]='%';

                newLength=newLength-3;
            }
            else
            {
                str[newLength-1]=str[i];
                newLength=newLength-1;
            }
        }
    return str;
    }



    public static void main(String[] args) {
        String mystring ="Hello W";
        char[] mystringchararr = new char[50];
      // mystringchararr = mystring.toCharArray() ;//"Hello World how are you";//23
        mystringchararr[0]='H';
        mystringchararr[1]='E';
        mystringchararr[2]='L';
        mystringchararr[3]=' ';
        mystringchararr[4]='L';
        mystringchararr[5]='O';
        mystringchararr[6]=' ';
        mystringchararr[7]=' ';
        char[] mystringout = replaceSpaces(mystringchararr,8);
        for (char c: mystringout)
            System.out.print(c);

    }
}
