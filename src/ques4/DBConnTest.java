package ques4;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DBConnTest {
	private DBConnection db;
	private String drivername;
	private String url;
	private String username;
	private String pwd;

	@Before
	public void setUpBeforeClass() {
		db = new DBConnection();
		
		drivername = "com.mysql.jdbc.Driver";
		url = "jdbc:mysql://localhost:8080/sonoo";
		username = "root";
		pwd = "root";
		
	}

	@Test
	public void DBConnectionTest() {
		assertEquals("success", db.connect(drivername, url, username, pwd));
	}

}
