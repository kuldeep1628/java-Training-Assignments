import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Registering driver...");    
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered....");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			
			System.out.println("Connected to the DB : "+conn);
			
			
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter Student rollnumber to delete  : ");
			int rollno = scan1.nextInt();
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from student1 where rollno=" + rollno);
			
			if(rs.next()) {
				
				System.out.println("trying to make a Prepared statment");
				PreparedStatement pst = conn.prepareStatement("DELETE FROM STUDENT1 WHERE rollno=?");
				System.out.println("Prepared Statement created : "+pst);
				pst.setInt(1, rollno);
				
				System.out.println("Trying to execute the prepared statement....");
				int rows = pst.executeUpdate();
				
				System.out.println("Prepred Statement executed, deleted the records :..."+rows);
				pst.close();	conn.close();
				
			}
			else {
				StudentNotFound stdNotFndEx = new StudentNotFound("Student NOT found exception : "+rollno);
				throw stdNotFndEx;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
