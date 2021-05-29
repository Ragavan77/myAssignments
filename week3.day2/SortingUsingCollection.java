package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {

		String[] input = { "HCL", "Wipro", "Aspire Systems", "CTS" };
        //Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

		//get array length
		int arrLength = input.length;
		// System.out.println(arrLength);
		//sort the array	
		Arrays.sort(input);
		
		/*Method1
		 * Sort Array in descending order using collections Arrays.sort(input,
		 * System.out.printf( Arrays.toString(input));
		 * Collections.reverseOrder()); 
		 * System.out.println(Arrays.toString(input));
		 */
		
		//Iterate in Reverse Order
		for (int i = input.length - 1; i >= 0; i--) {
			//System.out.println(input[i]);
		}

		
		//mwthod2
		ArrayList<String> newSt = new ArrayList<String>();
		newSt.add("HCL");
		newSt.add("Wipro");
		newSt.add("Aspire Systems");
		newSt.add("CTS");
		Collections.sort(newSt,Collections.reverseOrder());
		Iterator it= newSt.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}

		
		//Method3
		for (String eachValue : newSt) {

			// System.out.println(eachValue);

			System.out.println(eachValue);

		}
	}
}

