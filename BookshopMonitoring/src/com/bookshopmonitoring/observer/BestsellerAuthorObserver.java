package com.bookshopmonitoring.observer;

import com.bookshopmonitoring.api.BooksDataObserver;
import com.bookshopmonitoring.api.BooksDataSubject;

/**
 * 
 * @author Romulo Augusto - romuloaugusto.silva@gmail.com
 * 
 * Observer of bestseller author.
 * 
 */
public class BestsellerAuthorObserver extends BooksDataObserver {

	/**
	 * Constructor
	 * 
	 * @param booksDataSubject
	 */
	public BestsellerAuthorObserver(BooksDataSubject booksDataSubject) {
		super(booksDataSubject);
	}

	/**
	 * Method that updates static about bestseller Author
	 */
	@Override
	public void update() {
		System.out.println("Updating static about Bestseller Author");
	}

}
