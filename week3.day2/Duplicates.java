package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {

	public static void main(String[] args) {
		
		int[] data= {1,3,8,3,11,5,6,4,7,6,7};
		
	    
				for (int i = 0; i < data.length; i++) {
					for (int j = i + 1; j < data.length; j++) {
						
						if(data[i]==data[j])
						{
							System.out.println(data[i]);
						}
							
					}
					
				}
			
		
	}

}
