//Problem Link: https://www.hackerrank.com/challenges/java-loops/

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s=0,x=0;
            for(int j=0;j<n;j++)
            {
                s=0;
                x=(int)Math.pow(2,j);
                while(x>0)
                {
                    s=s+(x*b);
                    x=x/2;
                }
                s=a+s;
                System.out.print(s+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
