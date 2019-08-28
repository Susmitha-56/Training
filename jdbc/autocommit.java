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
  			con.setAutoCommit(false)//autocommit;
			PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?)");  
for(int i=0;i<10;i++)
{			
String name=sc.next();
			int num =sc.nextInt();

			stmt.setInt(1,name);//1 specifies the first parameter in the query  
			stmt.setString(,"num);  
  
int i=stmt.execute();  
if(i==5)
con.rollback();
if(i==10)
con.commit():
if(
System.out.println(i+" records inserted");  
  }
con.close(); 
stmt.close(); 
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  