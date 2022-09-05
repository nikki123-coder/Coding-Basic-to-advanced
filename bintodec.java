//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.binary_to_decimal(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int binary_to_decimal(String str) {
        // Code here
          int ans = 0;
        int n = str.length();
        for (int i = 0; i < n; i++)
            // Calculating 2^i * s[i]
            ans += (Math.pow(2,n-i-1)) * (str.charAt(i) - '0');
        return ans;
    }
}