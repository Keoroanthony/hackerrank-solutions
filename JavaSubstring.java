/**
 * Java String class provides the built-in substring() method that extract a substring from the given
 * string by using the index values passed as an argument. In case of substring() method startIndex
 * is inclusive and endIndex is exclusive.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }
}