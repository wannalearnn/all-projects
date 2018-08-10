package Question1;

import java.util.Scanner;

public class Adjacentreplacement {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n  = sc.nextInt() ; 
		int arr[] = new int[200002] ; 
		for(int i = 1 ; i <= n ; i++ )
		{
			arr[i] = sc.nextInt()  ; 
		}
		for(int i=1;i<=n;i++)
			{
			int x= arr[i]%2 ; 
			if(x == 1)
				System.out.print(arr[i]+" ");
			else
				System.out.print(arr[i]-1+" ");
			}

	}

}
