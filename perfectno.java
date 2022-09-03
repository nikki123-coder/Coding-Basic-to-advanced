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
            System.out.println(ob.isPerfect(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int isPerfect(int N) {
        // code here
        int r;
        int m = N;
        int sum =0;
        while(N>0){
        r=N%10;
       int s= fact(r);
       sum=s+sum;
       N=N/10;
        }
        if(sum==m )
        return 1;
        else
        return 0;
    }
    int fact(int n){
        if(n==0)
          return 1;
          if(n==1)
          return 1;
          else
          return n*fact(n-1);
        
    }
}