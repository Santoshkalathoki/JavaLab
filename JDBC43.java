import java.sql.*;

class JDBC43{
	public static void main(String[] args){
		Connection cn = null;
		try{
			// Register the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bca_third_2020?serverTimezone=UTC";
			String un = "root";
			String pw = "";
			// Get connection
			cn = DriverManager.getConnection(url,un,pw);
			insert(cn);
		}catch(Exception e){
			System.out.println(e);
		}finally{
			cn.close();
		}
	}
	
	private static void insert(Connection cn) throws SQLException {
		// Create Statement
		Statement stat = cn.createStatement(); 
		String query = "insert into student (roll_no, name, course) values (5, 'Sangina', 'BIM')";
		// Execute query
		stat.execute(query); 

		System.out.println("Record inserted!");
	}
}