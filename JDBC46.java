import java.sql.*;

class JDBC46{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bca_third_2020?serverTimezone=UTC";
			String un = "root";
			String pw = "";
			Connection cn = DriverManager.getConnection(url,un,pw);
			delete(cn);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	private static void delete(Connection cn) throws SQLException {
		Statement stat = cn.createStatement(); // statment create

		String query = "delete from student where roll_no = 1";
		stat.executeUpdate(query); // execute query

		System.out.println("Record deleted!");
	}
}