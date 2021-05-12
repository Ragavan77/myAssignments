package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
				
		for(int i=0;i<=arr.length-1;i++)
		{

		
		if (arr[i]+1!=arr[i+1])
			//2!=3
			//3!=4
			//4!=4
		  {
			  System.out.println("Missing Array is " + (arr[i]+1));
			  break;
		  }
	/*
		for(int j=0; j<=arr.length;j++)
		{
			System.out.println(arr[j]);
			if( j!=arr[j])
			{
				System.out.println(arr[j]);
				break;
			}
			
		}	
	*/	}
		
		
		
		//int[] sortedData=arr;
		//System.out.println(sortedData);
		}

	


}