package com.bookshopmonitoring.api;

/**
 * 
 * @author Romulo Augusto - romuloaugusto.silva@gmail.com
 * 
 * Class that represent an observer.
 *
 */
public abstract class BooksDataObserver {

	protected BooksDataSubject booksData;

	/**
	 * Constructor
	 * 
	 * @param booksDataSubject
	 */
	public BooksDataObserver(BooksDataSubject booksDataSubject) {
		this.booksData = booksDataSubject;
	}

	/**
	 * @author Romulo Augusto - romuloaugusto.silva@gmail.com
	 * 
	 * Method to update the informations. 
	 */
	public abstract void update();
}