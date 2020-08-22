package com.career.logincheck;


import java.sql.*;

public class LoginConnect {
	static Connection currentCon = null;
	static ResultSet rs = null;
	private static String dburl = "jdbc:mysql://localhost:3306/userdb";
	private static String dbuname = "root";
	private static String dbpassword = "root";
	//private String dbDriver = "com.mysql.cj.jdbc.Driver";
	
//	public void LoadDriver(String Driver) {
//		try {
//			Class.forName(dbDriver);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public Connection getConnection() {
//		Connection con = null;
//		try {
//			con = DriverManager.getConnection(dburl, dbuname, password);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return con;
//	}


	public static Member login(Member bean) {

		// preparing some objects for connection
		Statement stmt = null;

		String username = bean.getUname();
		String password = bean.getPassword();

		String searchQuery = "select * from userdb.member where username='" + username + "' AND password='" + password
				+ "'";

		// "System.out.println" prints in the console; Normally used to trace the
		// process
		System.out.println("Your user name is " + username);
		System.out.println("Your password is " + password);
		System.out.println("Query: " + searchQuery);

		try {
			// connect to DB
			currentCon = DriverManager.getConnection(dburl, dbuname, dbpassword);
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery);
			boolean more = rs.next();

			// if user does not exist set the isValid variable to false
			if (!more) {
				System.out.println("Sorry, you are not a registered user! Please sign up first");
				bean.setValid(false);
			}

			// if user exists set the isValid variable to true
			else if (more) {
				String Name = rs.getString("uname");

				System.out.println("Welcome " + Name);

				bean.setValid(true);
			}
		}

		catch (Exception ex) {
			System.out.println("Log In failed: An Exception has occurred! " + ex);
		}

		// some exception handling
		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
				}
				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
				}
				stmt = null;
			}

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}

		return bean;

	}
}