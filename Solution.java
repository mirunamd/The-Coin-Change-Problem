import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	private static int[] coins;
	private static int n, m;
	
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(new File("in.txt"));

		n = scan.nextInt(); // value that coins have to add up to
		m = scan.nextInt();

		coins = new int[m];

		int i = 0;

		while(i < m){
			coins[i ++] = scan.nextInt();
		}

		System.out.println(changeCoins());
	}

	private static long changeCoins(){
		long[] nrSol = new long[n + 1];
		nrSol[0] = 1;

		for(int i = 0; i < m; i++)
			for(int j = coins[i]; j <= n; j++){
				nrSol[j] += nrSol[j - coins[i]];
			}

		return nrSol[n];
	}
}
