package ques2;
import static org.junit.Assert.*;

import org.junit.Test;

public class ArraySortTest {

	@Test
	public void test() {
		
		ArraySort arraySort= new ArraySort();
		int[] arr= {5,3,2,1,4};
		int[] res= {1,2,3,4,5};
		assertArrayEquals(res, arraySort.sortNumbers(arr));
		
	}

}
