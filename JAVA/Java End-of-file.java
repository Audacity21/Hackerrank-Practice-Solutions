//Problem Link: https://www.hackerrank.com/challenges/java-end-of-file/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int i=1;
        while(sc.hasNext())
        {
            s=sc.nextLine();
            System.out.println(i+" "+s);
            i++;
        }
    }
}
