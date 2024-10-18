package businessLogics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CSDL {
	private static Connection ketNoi;
	private static String url = "jdbc:mysql://localhost:3306/phuong_perfume?useUnicode=true&characterEncoding=UTF-8";

	public static Connection getKetNoi() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ketNoi = DriverManager.getConnection(url, "root", "");
			return ketNoi;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
//	public static void main(String[] args) {
//		if(getKetNoi() != null)
//			System.out.println("thanh cong");
//		else
//			System.out.println("that bai");
//	}
}
