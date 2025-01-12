package week2.day1;

public class Library {

	
	String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public void issueBook(){
		System.out.println("Book issued Sucessfully");
	}
	
	
	
	public static void main(String[] args) {
		Library ln = new Library();
		String bookTitle = ln.addBook("Romeo Juliet");
		ln.issueBook();
		System.out.println(bookTitle);
		

	}

}
