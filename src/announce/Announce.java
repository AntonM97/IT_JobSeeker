package announce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Announce {
	public static void main (String[] args) {
		//Connect to JDBC
		String jdbcURL = "jdbc:postgresql://localhost:5432/it_jobseeker";
		String username = "postgres";
		String password = "34698";
		
		try {
			Connection connection = DriverManager.getConnection(jdbcURL, username, password);
			System.out.println("Connected to PostgreSQL");
			//TODO fix the insertion into db
			String sql = "INSERT INTO Announcement (id, date, position, descr, comp_name)"
					+" VALUES ('-100500', '2021-04-13', 'Java Developer', "
					+ "'Laser Romae nell ottica dell ampliamento del proprio organico sta selezionando un:\r\n"
					+ "JAVA DEVELOPER La risorsa, che deve aver mat'," + "'LASER ROMAE');";
			
			Statement statement = connection.createStatement();
			int rows = statement.executeUpdate(sql);
			if (rows>0) {
				System.out.println("new announse has been inserted.");
			}
			
			
			connection.close();
			
		} catch (SQLException e) {
			System.out.println("Error in connection to PostgreSQL server");
			e.printStackTrace();
		}





		//TODO Date of publication


		//TODO description of announce


		//TODO free field for introducing technologies

	}
}
