import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao 
{
private String dburl= "jdbc:mysql://localhost:3306/userdb";
private String dbuname = "root";
private String password = "root";
private String dbDriver = "com.mysql.jdbc.Driver";

public void LoadDriver(String dbDriver)
{
	try {
		Class.forName(dbDriver);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public Connection getConnection()
{
	Connection con = null;
	try {
	con = DriverManager.getConnection(dburl, dbuname, password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}
public String insert(Member member)
{
	LoadDriver(dbDriver);
	Connection con = getConnection();
	String result = "Data entered sucessfully";
	String sql = "insert into members values(?,?,?,?)";
	try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, member.getUname());
		ps.setString(2, member.getPassword());
		ps.setString(3, member.getEmail());
		ps.setString(4, member.getPhone());
		ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		result = "Data not entered";
	}
	return result;
}
}
