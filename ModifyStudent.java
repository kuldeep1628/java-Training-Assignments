import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ModifyStudent {
	public static void main(String[] args)
	{
		try {
			System.out.println("Registering driver...");    
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered....");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			
			System.out.println("Connected to the DB : "+conn);
			
			System.out.println("trying to make a Prepared statment");
			PreparedStatement pst = conn.prepareStatement("UPDATE STUDENT1 SET ROLLNO =?,STUDENTNAME=?,BIRTHDATE=?,PHYSICS=?,CHEMISTRY=?,MATHS=?,TOTAL=?,GRADE=? WHERE ROLLNO=?");
			System.out.println("Prepared Statement created : "+pst);
			
			
			Scanner sc = new Scanner(System.in);
            System.out.println("Enter Roll No");
            int rollno = sc.nextInt();
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from student1 where rollno="+ rollno);
			
			if(rs.next()) {
			
				
	        
	              System.out.println("Enter Student Name");
	              String studentName = sc.next();
	              
	              System.out.println("Enter Date of birth");
	              String dob = sc.next();
	  			  Date date = Date.valueOf(dob);

	              
	              System.out.println("Enter Physics Marks");
	              int physics = sc.nextInt();
	              
	              System.out.println("Enter Chemistry Marks");
	              int chemistry = sc.nextInt();
	              
	              System.out.println("Enter maths Marks");
	              int maths = sc.nextInt();
	              
	             // System.out.println("Enter Total Marks");
	              int Total = (physics+maths+chemistry);
	              
	              System.out.println("Enter Grade");
	              String Grade = sc.next();
				
	              pst.setInt(1,rollno);
	              pst.setString(2,studentName);
	              pst.setString(3,dob);
	              pst.setInt(4,physics);
	              pst.setInt(5,chemistry);
	              pst.setInt(6,maths);
	              pst.setInt(7,Total);
	              pst.setString(8,Grade);
	              pst.setInt(9, rollno);

				System.out.println("Trying to execute the prepared statement....");
				int rows = pst.executeUpdate();
				
				System.out.println("Prepred Statement executed, updated the records :..."+rows);
				
			}
			else {
				StudentNotFound ex = new StudentNotFound("This Student does not exist in DB : "+ rollno);
				throw ex;
			}

			pst.close();	conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		    
	}
}
