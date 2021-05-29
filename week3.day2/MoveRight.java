package week3.day2;

public class MoveRight {

	public static void main(String[] args) {
		int[] num = {4,0,3,0,1,5,2,0};
		
		//decalre the number of items to be moved let me say 3 Zero's to the right
		int n=3;
		for (int i = 0; i < num.length; i++) {
			//System.out.println(num[i]);
		}
		
		for (int i = 0; i < n; i++) {
			int j, right;
			right=num[num.length-1];
		
			for( j=num.length-1; j>0; j--)
			{
				num[j]=num[j-1];
			}
			num[0]=right;
			
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]+" ");
		}
		
		}

	}

