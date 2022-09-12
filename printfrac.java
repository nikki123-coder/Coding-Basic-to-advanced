//{ Driver Code Starts
import java.util.*;

class Fraction_Addition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			GfG g = new GfG();
			g.addFraction(a,b,c,d);
		T--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete this function*/
class GfG
{ 	
    void addFraction(int num1, int den1, int num2, int den2)
    {
        // Your code here
        int numx,denx;
        numx = num1*den2 + den1*num2;
        denx= den1*den2;
        int divisor=numx; int dividend=denx;
        while(divisor>0){
            int val=divisor; divisor=dividend%divisor; dividend=val;
        }
        numx/=dividend; denx/=dividend;
        System.out.println(numx+"/"+denx);
        
        
        
    }
}