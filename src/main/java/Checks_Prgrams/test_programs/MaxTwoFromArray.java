package Checks_Prgrams.test_programs;

public class MaxTwoFromArray {
	
	public void findMaxTwo(int[] args) {
		int firstMax = 0;
		int secondMax = 0;
		for(int val:args) {

			
			if(firstMax < val) {
				secondMax = firstMax;
				firstMax = val;
			}
			else if(secondMax < val) {
				secondMax = val;
			}
		}
		
		System.out.println("First max" + firstMax);
		System.out.println("Second max" + secondMax);
	}
	
	/*
	 * 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,8,4,10,9};
		MaxTwoFromArray maxTwoFromArray = new MaxTwoFromArray();
		
		maxTwoFromArray.findMaxTwo(arr);

	}
	 */

}
