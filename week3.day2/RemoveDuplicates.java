package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String s1="PayPal India";
		//output 
		//Convert string to array or characterArray()
		char [] charArray = s1.toCharArray();
		//Create a set
		Set<Character> newSt=new LinkedHashSet<Character>();
		
		for(Character eachValue : charArray)
		{
			if(eachValue!=' ')
			{
				//newSt.add(eachValue);
				newSt.add(eachValue);
				
			}
		}
			System.out.println(newSt);
		}
		
		
		
			
		
		
		
		
	}
	

	
