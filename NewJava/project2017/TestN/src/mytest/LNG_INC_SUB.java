package mytest;

import java.io.BufferedReader;
import java.io.InputStreamReader;


class LNG_INC_SUB//Longest Increasing Subsequence
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Numbers Separated by Spaces to find their LIS\n");
		String[] s1=br.readLine().split(" ");
		int n=s1.length;
		int[] a=new int[n];//Array actual of Numbers
		String []ls=new String[n];// Array of Strings to maintain LIS for every element
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(s1[i]);
		}
		int[]dp=new int[n];//Storing length of max subseq.
		int max=dp[0]=1;//Defaults
		String seq=ls[0]=s1[0];//Defaults
		for(int i=1;i<n;i++)
		{
			dp[i]=1;
			String x="";
			for(int j=i-1;j>=0;j--)
			{
				//First check if number at index j is less than num at i.
				// Second the length of that DP should be greater than dp[i]
				// -1 since dp of previous could also be one. So we compare the dp[i] as empty initially
				if(a[j]<a[i]&&dp[j]>dp[i]-1)
				{

					{
						dp[i]=dp[j]+1;//Assigning temp length of LIS. There may come along a bigger LIS of a future a[j]
						x=ls[j];//Assigning temp LIS of a[j]. Will append a[i] later on
					}
				}
				x+=(" "+a[i]);
				ls[i]=x;
				if(dp[i]>max)
				{
					max=dp[i];
					seq=ls[i];
				}
			}
			System.out.println("Length of LIS is: " + max + "\nThe Sequence is: " + seq);
		}
	}
}
