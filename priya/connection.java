import java.sql.*;
class DBCon
{
	public static void main(String args[])throws Exception
	{
		// 1. Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Get the Connection Object
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","Mura@9848");

		if(con!=null)
			System.out.println("Connection is Established");
		else
			System.out.println("Connection failed");
	}
}
