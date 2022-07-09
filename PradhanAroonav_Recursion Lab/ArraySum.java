/**
 * 
 * @author Aroonav Pradhan
 *
 */
public class ArraySum {

	private int result;

	public int sumOfArray(Integer[] myArray, int i) {
		//recursive method to calculate sum of an array
	     if (i == 0) {  // base case
	         result = 0;
	     }
	     else {
	    	 result = myArray[i-1] + sumOfArray(myArray,(i-1));
	     }
	     return result;
	}//end of sumOfArray
	
}