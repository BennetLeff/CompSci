import java.lang.Math.*;

public class Book {
	private String bookName;
	private long bookISBN;

	public Book() {
		bookName = "Joe's Crab Shack";
		bookISBN = 234566556;
	}

	public Book(String nVal, long isbnVal) {
		bookName = nVal;
		bookISBN = isbnVal;
	}

	public void setName(String nVal) {
		bookName = nVal;
	}

	public void setISBN(long isbnVal) {
		bookISBN = isbnVal;
	}

	public String toString() {
		return "The name of the book is: " + bookName + ", and the ISBN is: " + bookISBN;
	}
}
