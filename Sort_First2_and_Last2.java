package sortingOperations;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_First2_and_Last2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int newArr[] = new int[4];
		int index = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i==0 || i==1 || i==arr.length-2|| i==arr.length-1)
				newArr[index++] = arr[i];
		}
		System.out.println("New Array" +Arrays.toString(newArr));
		
		for(int i=0;i<=newArr.length-1;i++)
		{
			for(int j=0;j<=i-1;j++)
			{
				if(newArr[j]>newArr[i])
				{
					int temp = newArr[i];
					newArr[i] = newArr[j];
					newArr[j] = temp;
				}
			}
		}
		System.out.println("Sorted new Array" + Arrays.toString(newArr));
		index = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i==0 || i==1 || i==arr.length-2|| i==arr.length-1)
				arr[i] = newArr[index++];
		}
		System.out.println("Sorted Array" + Arrays.toString(arr));
	}
}
