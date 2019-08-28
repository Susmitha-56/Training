import java.sql.*;  
class InsertPrepared
{  
	public static void main(String args[])
	{  
	try
	{  
			Scanner sc=new Scanner(System.in);
			Class.forName("oracle.jdbc.driver.OracleDriver");  
  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
  
			PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?)");  
			String name=sc.next();
			int num =sc.nextInt();

			stmt.setInt(1,name);//1 specifies the first parameter in the query  
			stmt.setString(,"num);  
  
int i=stmt.execute();  
System.out.println(i+" records inserted");  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  