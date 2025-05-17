package bancoDeDados;

import java.sql.*;

public class BancoDeDados {

	public static void main(String[] args) {
		String url = "jdbc:mysql://192.168.15.20:3306/eags";
		String username;
		String password;
		
		try (Connection conn = DriverManager.getConnection(url, user, password)) {
			
		}
	}

}
