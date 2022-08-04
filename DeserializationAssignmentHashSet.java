import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;


public class DeserializationAssignmentHashSet  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Book> book = null;
		try {
			FileInputStream fileInputStream  = new FileInputStream("C:\\Users\\KSH20\\Documents\\Hashset.java");
			System.out.println("Reading File.....");
			
			ObjectInputStream ois = new ObjectInputStream(fileInputStream);
			System.out.println("Reading Data");
			
			System.out.println("Trying to retrieve the books...");
			
			book = (HashSet<Book>) ois.readObject();
			
			System.out.println("books retrieved....");
			
			System.out.println("HashSet is : "+book);
			
			ois.close();
			fileInputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}