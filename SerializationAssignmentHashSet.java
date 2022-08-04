import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;

public class SerializationAssignmentHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book("c",99,"amol",4,1100,100000);
		Book book2 = new Book("Java",100,"Aikansh",5,1200,20000);
		Book book3 = new Book("python",101,"Abhishek",6,1300,30000);
		
		HashSet<Book> book = new HashSet<Book>();
		book.add(book1);
		book.add(book2);
		book.add(book3);
		
		System.out.println("Objects created...");
		try {
			FileOutputStream fout  = new FileOutputStream("C:\\Users\\KSH20\\Documents\\Hashset.java");
			System.out.println("File is ready");
			
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			System.out.println("books ready");
			
			System.out.println("Trying to store the books...");
			
		
			oos.writeObject(book);
		
			System.out.println("books stored....");
			
			oos.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}