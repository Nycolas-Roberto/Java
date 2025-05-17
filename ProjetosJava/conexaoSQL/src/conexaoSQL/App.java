package conexaoSQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class App {

	private static final String URL = "jdbc:mysql://localhost:3306/eags";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
			if(conn.equals(true)) {
				System.out.println("Conectado com sucesso!");
			} else {
				System.out.println("Erro ao conectar.");
			}
			conn.close();
			
		} catch (Exception e) {
            System.out.println("Driver JDBC não encontrado!");
            e.printStackTrace();
		}
	}

}
