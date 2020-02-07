package ques1;
import static org.junit.Assert.*;

import org.junit.Test;

public class WordCountTest {

	@Test
	public void test() {
		
		WordCount count = new WordCount();
		
		assertEquals(5, count.count("Hello"));
	}

}
