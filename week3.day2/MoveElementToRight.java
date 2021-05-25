package week3.day2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MoveElementToRight {
	
	public static void main(String[] args) {
		
	
	int[] nums = {4,0,3,0,1,5,2,0};
	
	
	//decalre the number of items to be moved let me say 3 Zero's to the right
	int n=3;
	
	List<Integer> list1 = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>();

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
        	list1.add(nums[i]);
        } else if (nums[i] != 0) {
            list2.add(nums[i]);
            
        }
    }
    List<Integer> finalList = new ArrayList<Integer>(list2);
    finalList.addAll(list1);
    System.out.println(finalList);
}}