package com.career.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.career.spring.dao.LoginDao;
import com.career.spring.model.Login; 




public class LoginDaoImpl implements LoginDao {

	@Autowired
	  DataSource datasource;

	  @Autowired
	  JdbcTemplate jdbcTemplate;

	  public int register(Login user) {
	    String sql = "insert into users values(?,?,?,?)";

	    return jdbcTemplate.update(sql, new Object[] { user.getName(), user.getEmail(), user.getPassword(),user.getUsertype()});
	  }

	  public Login validateUser(Login login) {
		    String sql = "select * from users where username='" + login.getName() + "' and password='" + login.getPassword()
		        + "'";
		    List<Login> users = jdbcTemplate.query(sql, new LoginMapper());

		    return users.size() > 0 ? users.get(0) : null;
	  }


}

class LoginMapper implements RowMapper<Login> {

	  public Login mapRow(ResultSet rs, int arg1) throws SQLException {
		  Login user = new Login();

	    user.setName(rs.getString("name"));
	    user.setEmail(rs.getString("email"));
	    user.setPassword(rs.getString("password"));
	    user.setUsertype(rs.getInt("type"));
	   

	    return user;
	  }

	
	}
