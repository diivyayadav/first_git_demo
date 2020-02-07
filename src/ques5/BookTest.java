package ques5;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BookTest {

	private int input;	
	private Book book;
	private double discount;
	
	private double result;
	
	 @Before
	   public void init() {
		 book = new Book();
	   }

   public BookTest(int input, double discount, double result) {
	
	this.input = input;
	this.discount= discount;
	this.result= result;
}


 @Parameterized.Parameters
   public static Collection userValues() {
      return Arrays.asList(new Object[][] {
         { 500, 10, 50 },
         { 1000, 10, 100 },
         { 100, 10, 10 }
      });
   }
  
   @Test
   public void testdiscountedPrice() {
      //System.out.println("Parameterized Number is : " + input);
     
      assertEquals(result, book.discountedPrice(input, discount), 0.002);
   }
}