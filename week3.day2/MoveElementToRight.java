package week3.day2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MoveElementToRight {
	
	public static void main(String[] args) {
		
	
	int[] nums = {4,0,3,0,1,5,2,0};
	
	
	//decalre the number of items to be moved let me say 3 Zero's to the right
	
	
	List<Integer> list1 = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>();

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
        	list1.add(nums[i]);
        	//contains the array index which is equal to Zero---Index of 1,3,7
        	
        } else if (nums[i] != 0) {
            list2.add(nums[i]);
          //contains the array index which is equal to Zero, Index of 0,2,4,5,6---{4,3,1,5,2}
            
        }
    }
    //Passing list2 and adding list1
    List<Integer> finalList = new ArrayList<Integer>(list2);
    finalList.addAll(list1);
    System.out.println(finalList);
}}