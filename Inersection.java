package week1.day2;

import java.util.Iterator;

public class Inersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 3, 2, 11, 4, 6, 7 };
		int arr2[] = { 1, 2, 8, 4, 9, 7 };

		for (int i = 0; i < arr1.length; i++)

		{

			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					// int b[]=arr1.clone();
					/* System.out.println("the intersection is "+ arr2[i]); */

					System.out.println("the intersection is " + arr2[i]);
					return;

				}

				/// System.out.println("the intersection is "+ arr2[i]);

			}

		}
	}
}
