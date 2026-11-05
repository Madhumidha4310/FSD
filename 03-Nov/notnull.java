package sql;
import java.sql.*;
public class notnull{

	public static void main(String[] args){
		try{
	        Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/FacePrep",
	            "root",
	            "@madhu28"
	        );
		Statement stmt = con.createStatement();
		//String sql="CREATE TABLE student (ID int NOT NULL,LastName varchar(30) NOT NULL,Age int)";
		String sql="INSERT INTO student VALUES(10 'Angle',28)";                 //This line not execute go to the catch because not give the ID number
		//String sql="ALTER TABLE student MODIFY COLUMN ID int NULL";            //Change the Not null value into null
 		int result=stmt.executeUpdate(sql);
		System.out.println("Runs successfully!");
		} catch (Exception e) {
	        System.out.println("sorry for inconvients. check your connections.");
	    }
	}
}
