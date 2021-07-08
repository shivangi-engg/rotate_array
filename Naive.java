//rotate the array by given no.
import java.util.*;
import java.lang.*;
public class Naive
{
	public static void main(String[] args) 
	{
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of the array:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("enter the elements of the array:");
		for(int i=0; i<n; i++)
		{
			int ele = sc.nextInt();
			arr[i] = ele;
		}
		System.out.println("enter the no.by which u want to rotate the array:");
		int k = sc.nextInt();
		
		for(int j=0; j<k; j++)
		{
			temp = arr[n-1];
			for(int x=n-2; x>0; x--)
			{
				arr[x+1] = arr[x];
				arr[x] = arr[x-1];
			}
			arr[0] = temp;
		}
		System.out.println("array after rotation is:");
		for(int a=0; a<n; a++)
		{
			System.out.print(arr[a]+" ");
		}
	}
}