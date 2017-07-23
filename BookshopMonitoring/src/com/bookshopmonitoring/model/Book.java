package com.bookshopmonitoring.model;

/**
 * 
 * @author Romulo Augusto - romuloaugusto.silva@gmail.com
 * 
 * Class that represents a book.
 *
 */
public class Book {
	
	private String name;
	
	private String author;
	
	private String category;
	
	/**
	 * Default constructor
	 */
	public Book() {
		super();
	}

	/**
	 * Constructor 
	 * 
	 * @param name
	 * @param author
	 * @param category
	 */
	public Book(String name, String author, String category) {
		super();
		this.name = name;
		this.author = author;
		this.category = category;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

}
