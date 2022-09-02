//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {
        // code here
        int rem;
        int sum=0;
        int reverse=0;
        while(N>0){
            rem=N%10;
            sum = sum+rem;
            N=N/10;
        }
        int original_no = sum;
       int r;
        while(original_no >0){
            r=original_no%10;
            reverse = (reverse*10)+r;
            original_no=original_no/10;
        }
        if(sum == reverse)
           {
               return 1;
           }
         else
           return 0;
    }
}