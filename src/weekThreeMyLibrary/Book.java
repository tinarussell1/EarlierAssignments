package weekThreeMyLibrary;

public class Book {
	private String isbn;
	private int numOfPages;
	private int branchNum;
	private String title;
	private String genre;
	private String author;
	
	//default constructor
	public Book() { 
	}

	//Tinas constructor
	public Book(String isbn , int numOfPages,int branchNum ,String title,String genre, String author) { 
		this.isbn = isbn;
		this.numOfPages = numOfPages;
		this.branchNum = branchNum;
		this.title = title;
		this.genre = genre;
		this.author = author;
	}
	//Deasia's constructor
	public Book(int numOfPages,int branchNum ,String title,String genre, String author, String isbn) { 
		this.isbn = isbn;
		this.numOfPages = numOfPages;
		this.branchNum = branchNum;
		this.title = title;
		this.genre = genre;
		this.author = author;
	}

	//getters setters
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public int getNumOfPages() {
		return numOfPages;
	}
	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public int getBranchNum() {
		return branchNum;
	}
	public void setBranchNum(int branchNum) {
		this.branchNum = branchNum;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

}
