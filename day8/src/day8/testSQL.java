package day8;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class testSQL {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/ex1?characterEncoding=UTF-8";
		String userId = "root";
		String passwd = "Hieu@123";
		String sql = "SELECT * FROM notices;";// where hit = 9999

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, userId, passwd);
			st = con.createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {

				int ID = rs.getInt("ID");

				String title = rs.getString("title");

				String writer_id = rs.getString("WRITER_ID");

				int hit = rs.getInt("HIT");

				String regdate = rs.getString("regdate");

//				System.out.println("ID:" + ID  + "title:" + title  + "\tWRITER_ID: " + writer_id  + "\tHIT: " + hit  + "\tregdate: " + regdate );
				System.out.println(
						" raw data: ID:" + ID + "," + title + "," + writer_id + "," + hit + "," + regdate);
			}
			
			rs.close();
			st.close();
			con.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}

}
