package com.smru;
/*
* Rotate matrix by 90 degree
* circular rotation on each layer
* moving the top edge to right edge
* right edge to bottom edge
* bottom edge to left edge
* left edge to top edge
* */
public class MtrixRotate {

public static int[][]   rotate(int[][] mtrix, int n)
{
    for(int layer = 0 ;layer < n/2 ; ++layer)
    {
        int first = layer;
        int last = n-1-layer;

        for(int i=first ;i<last;++i)
        {
            int offset =i-first;

            //top
            int top = mtrix[first][i];

            //left top
            mtrix[first][i]=mtrix[last-offset][first];

            //bottom left
            mtrix[last-offset][first] = mtrix[last][last-offset];

            //right bottom
            mtrix[last][last-offset] = mtrix[i][last];

            //top right
            mtrix[i][last]=top;
        }
    }
    return mtrix;
}
    public static void main(String[] args) {

    int[][] mtrix = new int [4][4];
    int[][] mtrix1 = new int [4][4];
    mtrix[0][0]=1;mtrix[0][1]=2;mtrix[0][2]=3;mtrix[0][3]=4;
    mtrix[1][0]=5;mtrix[1][1]=6;mtrix[1][2]=7;mtrix[1][3]=8;
    mtrix[2][0]=9;mtrix[2][1]=10;mtrix[2][2]=11;mtrix[2][3]=12;
    mtrix[3][0]=13;mtrix[3][1]=14;mtrix[3][2]=15;mtrix[3][3]=16;

    System.out.println("Before rotate :");
    for (int i=0; i<4;i++)
    {
        for(int j=0;j<4;j++)
            System.out.print( " " + mtrix[i][j]);
        System.out.println("");
    }

        System.out.println("After  rotate :");
        mtrix1 =rotate(mtrix,4);

        for (int i=0; i<4;i++)
        {
            for(int j=0;j<4;j++)
                System.out.print( " "+mtrix1[i][j]);
            System.out.println("");
        }
    }

}

