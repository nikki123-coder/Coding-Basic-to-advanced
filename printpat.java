//{ Driver Code Starts
import java.util.Scanner;



class PrintPattern
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			GfG g = new GfG();
			g.printPat(n);
			System.out.println();
		
		t--;
		}
	}
}
// } Driver Code Ends


class GfG
{
    void printPat(int n)
    {
         // Your code here
         int i,j;
         int m=n;
         while(m>=1){
             for(i=n; i>=1; i--){
                 for(j=1; j<=m; j++){
                     System.out.print(i+" ");
                 }
             }
             System.out.print("$");
             m--;
         }
    }
}