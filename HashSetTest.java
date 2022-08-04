import java.util.HashSet;
import java.util.Objects;

public class HashSetTest {
	public static void main(String[] args) {

		Book1 book1 = new Book1("Java");
		Book1 book2 = new Book1("Java");
		Book1 book3 = book1;
		
		System.out.println("book1 : "+book1);
		System.out.println("book2 : "+book2);
		System.out.println("book3 : "+book3);

		System.out.println("----");
		
		System.out.println("book1 : "+book1.hashCode());
		System.out.println("book2 : "+book2.hashCode());
		System.out.println("book3 : "+book3.hashCode());

		
		HashSet<Book1> bookShelf = new HashSet<Book1>();
		
		System.out.println("Adding book1 ");
		bookShelf.add(book1);
		
		System.out.println("Adding book2 ");
		bookShelf.add(book2);

		System.out.println("Adding book3 ");
		bookShelf.add(book3);
			
		
		for (Book1 book : bookShelf) {
			System.out.println("The Book : "+book);
		}
	}
}

class Book1
{
	String title;

	public Book1(String title) {
		super();
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Book1 other = (Book1) obj;
		return Objects.equals(title, other.title);
	}
	
}