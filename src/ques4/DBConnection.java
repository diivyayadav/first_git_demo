package ques4;

public class DBConnection {

	public String connect(String drivername, String url, String username, String pwd) {

		if (drivername == "com.mysql.jdbc.Driver" && url == "jdbc:mysql://localhost:8080/sonoo" && username == "root"
				&& pwd == "root") {

			return "success";
		} else {
			return "failure";
		}

	}

}
