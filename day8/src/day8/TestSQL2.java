package day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSQL2 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/ex1?characterEncoding=UTF-8";
		String userId = "root";
		String passwd = "Hieu@123";

//		String sql = "INSERT INTO notices(TITLE, WRITER_ID, CONTENT, REGDATE) VALUES(?, ?, ?,now());";

//		String sql = "delete from notices where id = ?;";
		String sql = "update notices set title=?, hit=?, files=? where id = ?;";
		Connection con = null;
		Statement st = null;

		try {
//			String TITLE = "title111";
//			String WRITER_ID = "test111";
//			String CONTENT = "content111";

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, userId, passwd);
			PreparedStatement stmt = con.prepareStatement(sql);

//			stmt.setString(1, TITLE);
//			stmt.setString(2, WRITER_ID);
//			stmt.setString(3, CONTENT);
			
			//delete
//			int ID = 3;
//			stmt.setInt(1, ID);
			//update
			
			String TITLE = "edittitle";
			String WRITER_ID = "test111";
			String CONTENT = "content111";

			int ID =4;
			int HIT = 9999;
			String files = "files....";
			stmt.setString(1,TITLE);
			stmt.setInt(2, HIT);
			stmt.setString(3, files);
			stmt.setInt(4, ID);
			
			int result = stmt.executeUpdate();

			System.out.println("result: " + result);

			stmt.close();
			con.close();

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

	}

}
