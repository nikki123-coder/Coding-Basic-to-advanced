//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int N = sc.nextInt();
                    int Arr[] = new int[N];
                    for(int i = 0;i<N;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.gcd(N,Arr));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int gcd(int N , int arr[]) 
    { 
       //code here.
       int result = arr[0];//storing the 1st element of the array initially to the result
       for(int i=0; i<N; i++){
           result = gcdno(result,arr[i]);//continuously call the function 
           //gcd to compute the gcd between the two elements of the array so that the common factor can be extracted as gcd of the array of the elemets.
       }
       if(result ==1){
           return 1;
       }
       return result;
    }
    static int gcdno(int A, int B){
        if(B==0)
          return A;
        return gcdno(B, A%B);
    }
}