package day8;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSQL3 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/ex1?characterEncoding=UTF-8";
		String userId = "root";
		String passwd = "Hieu@123";

		String sql = "INSERT INTO `ex1`.`notices` \r\n" 
				+ "(`ID, \r\n" + "`TITLE`, \r\n" 
				+ "`WRITER_ID`, \r\n"
				+ "`CONTENT`, \r\n" 
				+ "`REGDATE`, \r\n" + "`VALUES`, \r\n" 
				+"(0, \r\n" 
				+ "`JDBCPROGRAMING10`, \r\n" 
				+ "`TEST1`, \r\n" + "`HI ALL ~~`, \r\n" 
				+ "now());";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}

	}

}
