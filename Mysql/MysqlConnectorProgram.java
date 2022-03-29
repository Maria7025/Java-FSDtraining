import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlConnectorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Javid123@gecw");
			Statement s = c.createStatement();
			ResultSet r = s.executeQuery("select * from Emp");
			while(r.next())
			{
				System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3));
			}
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}

		
	}

}
