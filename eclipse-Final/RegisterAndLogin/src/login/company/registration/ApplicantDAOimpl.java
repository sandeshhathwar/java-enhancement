package login.company.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ApplicantDAOimpl implements ApplicantDAO {

	static Connection con;
	static PreparedStatement ps;

	@Override
	public int insertApplicant(Applicant a) {
		int status = 0;
		try {
			con = MyConnectionProvider.getCon();
			ps = con.prepareStatement("insert into customer values(?,?,?)");
			ps.setString(1, a.getUsername());
			ps.setString(2, a.getPassword());
			ps.setString(3, a.getName());
			status = ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Applicant getApplicant(String customer, String password) {

		Applicant a = new Applicant();
		try {
			con = MyConnectionProvider.getCon();
			ps = con.prepareStatement("select * from logindb.customer where customer=? and password =?");
			ps.setString(1, customer);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				a.setUsername(rs.getString(1));
				a.setPassword(rs.getString(2));
				a.setName(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
}