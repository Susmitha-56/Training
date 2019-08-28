import java.sql.*;  

class Batchstmt{  
	public static void main(String args[])
	{  
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
  
			Statement stmt=con.createStatement();  
			stmt.addBatch("insert into EMP values("x",1);

			stmt.addBatch("insert into EMP values("x",1);
			stmt.addBatch("insert into EMP values("x",1);
			stmt.addBatch("insert into EMP values("x",1);
			Thread.Sleep(10000);
			stmt.executeBatch();
			con.close();  
			stmt.close():
  
		}
		catch(Exception e)
		{
		 System.out.println(e);
		}  
  
	}  
}  