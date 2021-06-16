package by.training.wlood.s04_programming_with_classes.t01_class_and_object;

/*
9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */
public class Task9 {
	public static void main(String[] args) {
		Book[] books = new Book[6];

		books[0] = new Book(1, "Head First Java", "Kathy Sierra", "O'Reilly Media", 2003, 619, 24, "hard");
		books[1] = new Book(2, "Effective Java", "Joshua Bloch", "Pearson", 2001, 416, 30, "hard");
		books[2] = new Book(3, "Thinking in Java", "Bruce Eckel", "Pearson", 1998, 1150, 23, "hard");
		books[3] = new Book(4, "Java: The Complete Reference", "Herbert Schildt", "McGraw", 2018, 1249, 65, "hard");
		books[4] = new Book(5, "Java: A Beginner's Guide", "Herbert Schildt", "McGraw", 2002, 728, 43, "hard");
		books[5] = new Book(6, "Head First Design Patterns", "Kathy Sierra", "O'Reilly Media", 2004, 672, 65, "hard");

		BookController controller = new BookController(books);
//		controller.booksByAuthor("Herbert Schildt");
//		controller.booksByPublishingHouse("O'Reilly Media");
		controller.booksByAfterYear(2010);

	}
}

class BookController {
	private Book[] books;

	public BookController(Book[] books) {
		this.books = books;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public void booksByAuthor(String author) {
		for (Book book : books)
			if (book.getAuthor().equals(author))
				System.out.println(book);
	}

	public void booksByPublishingHouse(String publishingHouse) {
		for (Book book : books)
			if (book.getPublishingHouse().equals(publishingHouse))
				System.out.println(book);
	}

	public void booksByAfterYear(int inputYear) {
		for (Book book : books)
			if (book.getPublishingYear() > inputYear)
				System.out.println(book);
	}

}

class Book {
	private int id;
	private String bookName;
	private String author;
	private String publishingHouse;
	private int publishingYear;
	private int pagesNumber;
	private int price;
	private String bindingType;

	public Book(int id, String bookName, String author, String publishingHouse, int publishingYear, int pagesNumber,
			int price, String bindingType) {
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.publishingYear = publishingYear;
		this.pagesNumber = pagesNumber;
		this.price = price;
		this.bindingType = bindingType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	public int getPagesNumber() {
		return pagesNumber;
	}

	public void setPagesNumber(int pagesNumber) {
		this.pagesNumber = pagesNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", author=" + author + ", publishingHouse="
				+ publishingHouse + ", publishingYear=" + publishingYear + ", pagesNumber=" + pagesNumber + ", price="
				+ price + ", bindingType=" + bindingType + "]";
	}

}