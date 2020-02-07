package ques5;

/*5.	Create a class Book with double discountedPrice(int price,double discount) method 
which accepts input from the user and returns total amount to be paid after discount. 
Test Book class discountedPrice(-,-) method by using Parameterized Test approach
with @RunWith(Parameterized.class) annotation*/

public class Book {

	public double discountedPrice(int price, double discount) {
		System.out.println("Book price "+price);
		double pay = (double)price*0.1;			
		System.out.println(pay);
		return pay;
	}
	
}
