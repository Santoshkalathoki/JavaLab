 import java.sql.*;

class Q42{
	public static void main(String[] args){
		try{
			// Register the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bca_third_2020?serverTimezone=UTC";
			String un = "root";
			String pw = "MySql@123";
			// Create the connection object
			Connection cn = DriverManager.getConnection(url,un,pw);
			System.out.println("Connected!");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}