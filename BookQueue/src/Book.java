
public class Book {
	
	String title;
	String author;
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public int comapareTo(Book book) {
		// TODO Auto-generated method stub
		return this.title.compareTo(book.title);
	}
	

}
