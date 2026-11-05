package sql;
import java.sql.*;
public class unique{

	public static void main(String[] args){
		try{
	        Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/FacePrep",
	            "root",
	            "@madhu28"
	        );
		Statement stmt = con.createStatement();
		//String sql="CREATE TABLE emp(ID int NOT NULL,Name varchar(50) NOT NULL,Age int,UNIQUE (ID))";    
		//String sql="INSERT INTO emp VALUES (1, 'Arun', 19),(26, 'Priya', 20),(2, 'Riya', 22),(34, 'Ram', 25)";   Insert sucessfully
		String sql="INSERT INTO emp VALUES (1, 'Arun', 19),(26, 'Priya', 20),(26, 'Riya', 22),(34, 'Ram', 25)";    //not insert into table because id 26 has two times in the id
 		int result=stmt.executeUpdate(sql);
		System.out.println("Record alter successfully!");
		} catch (Exception e) {
	        System.out.println("sorry for inconvients. check your connections.");
	    }
	}
}
