package ques3;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountdetailsTest {

	private Accountdetails ad;

	@Before
	public void init() {
		ad = new Accountdetails(1000f, 1234, "Divya");
	}

	@After
	public void remove() {

		ad = null;
	}

	@Test
	public void test1() {
		assertEquals(1234, ad.acctNo(1234));
	}

	@Test
	public void test2() {
		assertEquals("Divya", ad.acctName("Divya"));
	}

	@Test
	public void test3() {
		assertEquals(1000f, ad.acctBalance(1000f), 0.002f);
	}

	@Test
	public void test4() {
		assertEquals(1100f, ad.Deposit(100f), 0.002f);
	}

	@Test
	public void test5() {
		assertEquals(900, ad.Withdraw(100f), 0.002f);
		
	}


}
