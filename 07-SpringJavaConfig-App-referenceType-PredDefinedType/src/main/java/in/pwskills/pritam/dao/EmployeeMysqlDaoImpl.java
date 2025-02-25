package in.pwskills.pritam.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mysqlDao")
public class EmployeeMysqlDaoImpl implements IEmployeeDao {
	
	@Autowired
	@Qualifier("ds")
	private DataSource ds;
	@Override
	public void getConnection() {
		try {
			Connection conn = ds.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery("select * from student where sid=1");
			
			if(result.next()) {
				System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
