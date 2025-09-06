package activities;

import java.util.Arrays;

public class Activity2 {
	public static void main(String[]args) {
		
		int [] numArr = {10, 77, 10, 54, -11, 10};
		System.out.println("original array: " + Arrays.toString(numArr));
		
		int searchnum= 10;
		int fixedsum= 30;
		
		System.out.println("result: " + result(numArr, searchnum,fixedsum ));
	}
	
	public static boolean result (int[] numbers, int searchnum, int fixedsum) {
		int temp_sum=0;
			for (int number : numbers) {
				temp_sum += searchnum;
				if (temp_sum > fixedsum) { 
					break;	
				
			}
			 
            }
			
			return temp_sum == fixedsum;
	}
	
}
