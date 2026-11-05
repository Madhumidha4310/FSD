package sql;
import java.sql.*;
public class alter{

	public static void main(String[] args){
		try{
	        Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/FacePrep",
	            "root",
	            "@madhu28"
	        );
		Statement stmt = con.createStatement();
		//String sql="ALTER TABLE students ADD Email varchar(60);";            Column add
		//String sql="ALTER TABLE students DROP COLUMN Email";                 Remove column
		//String sql="ALTER TABLE students RENAME COLUMN dept to Department";  Rename column
		String sql="ALTER TABLE students RENAME TO STUDENTS";                //Rename Table
 		int result=stmt.executeUpdate(sql);
		System.out.println("Record alter successfully!");
		} catch (Exception e) {
	        System.out.println("sorry for inconvients. check your connections.");
	    }
	}
}

