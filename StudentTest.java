import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentTest {

     public static void main(String[] args) {
          // TODO Auto-generated method stub
          try {
              DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
              Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");

              PreparedStatement pstmt = conn.prepareStatement("insert into student1 values (?,?,?,?,?,?,?,?)");
              System.out.println("Enter data of the student");
              
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter Roll No");
              int rollno = sc.nextInt();
              
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
              
              //System.out.println("Enter Total Marks");
              int Total = (physics+maths+chemistry);
              
              float avg = Total/3;
  			String Grade;
  			System.out.println("Your average is "+avg);
  			System.out.println();
  			if(avg> 90)
  			{
  				Grade = "A+";
  			}else if (avg <90 && avg >80) {
  				Grade ="A";
  				System.out.println("Your Grade is "+Grade);
  			}else if (avg <80 && avg >70) {
  				Grade ="B";
  				System.out.println("Your Grade is "+Grade);
  			}else if (avg <70 && avg >60) {
  				Grade ="C";
  				System.out.println("Your Grade is "+Grade);
  			}else if (avg <60 && avg >50) {
  				Grade ="D";
  				System.out.println("Your Grade is "+Grade);
  			}else if (avg <50 && avg >40) {
  				Grade ="E";
  				System.out.println("Your Grade is "+Grade);
  			}else {
  				Grade ="F";
  				System.out.println("Your Grade is "+Grade+" And you are failed");
  			} 
              
              pstmt.setInt(1,rollno);
              pstmt.setString(2,studentName);
              pstmt.setString(3,dob);
              pstmt.setInt(4,physics);
              pstmt.setInt(5,chemistry);
              pstmt.setInt(6,maths);
              pstmt.setInt(7,Total);
              pstmt.setString(8,Grade);
              
              
              Statement stmt = conn.createStatement();
              ResultSet rs = stmt.executeQuery("select * from student1 where rollno ="+rollno);
              if(rs.next())
              {
                   StudentAlreadyExists stAlready = new StudentAlreadyExists("Student Already Exists in dataBase");
                   throw stAlready;
              }else {
                   pstmt.executeUpdate();
                   ResultSet rs1 = stmt.executeQuery("select * from student1");
                   System.out.println("--------------------------");
                   while(rs1.next())
                   {
                        
                        System.out.println("Roll no : "+rs1.getInt(1));
                        System.out.println("Student Name : "+rs1.getString(2));
                        System.out.println("Date of Birth : "+rs1.getString(3));
                        System.out.println("Physics : "+rs1.getInt(4));
                        System.out.println("Chemistry : "+rs1.getInt(5));
                        System.out.println("Maths : "+rs1.getInt(6));
                        System.out.println("Total : "+rs1.getInt(7));
                        System.out.println("Grade : "+rs1.getString(8));
                        System.out.println("--------------------------");
                   }
              }
              
              pstmt.close();
              stmt.close();
              conn.close();
          } catch (SQLException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
          }
     }
}
