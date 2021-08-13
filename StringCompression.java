package com.smru;


/*basic string compression
* example: String aabccccaaaa --> a2b1c4a4gfxxxxxsx
* if the compressed string is not smaller than original string then return original*/
public class StringCompression {

    public static int countCompression(String str)
    {
        if(str ==null || str.isEmpty() )
            return 0;
        char last = str.charAt(0);
        int size =0;
        int count =1;

        for (int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==last)
                count++;
            else
            {
                last=str.charAt(i);
                size+= 1+ String.valueOf(count).length();
                count =1;
            }
        }
        size += 1+String.valueOf(count).length();
        return size;


    }

public static String stringCompress(String str)
{
    //check if compression returns longer string
    int size = countCompression(str);
    if(size > str.length())
        return str;
    StringBuffer strbf = new StringBuffer();
    char last= str.charAt(0);
    int count = 1;
    for(int i=1 ; i< str.length();i++)
    {
        if(str.charAt(i)== last)
        {
            count++;
        }else {
            strbf.append(last);
            strbf.append(count);
            last = str.charAt(i);
            count =1;
        }
    }
    strbf.append(last);
    strbf.append(count);

    return strbf.toString();

}


    public static void main(String[] args) {

        String initialString = "aabccccaaaa";
        String compressed =stringCompress(initialString);
        System.out.print ("Compressed : " + compressed)
                ;

    }
}
