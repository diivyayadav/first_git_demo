package ques2;
import java.util.Arrays;

/*2.	Create a class ArraySort with int[] sortNumbers(int [] arr) method which 
accepts unsorted array from the user and returns sorted array. 
Create ArraySortTest class with a public method to test sortNumbers(int [] arr) method. 
*/

public class ArraySort {

	public int[] sortNumbers(int[] arr) {

		Arrays.sort(arr);
		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {

			res[i] = arr[i];
		}
		return res;
	}

}
