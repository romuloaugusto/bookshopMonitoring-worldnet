package com.bookshopmonitoring.observer;

import com.bookshopmonitoring.api.BooksDataObserver;
import com.bookshopmonitoring.api.BooksDataSubject;

/**
 * 
 * @author Romulo Augusto - romuloaugusto.silva@gmail.com
 * 
 * Observer of bestseller book.
 *
 */
public class BestsellerBookObserver extends BooksDataObserver {

	/**
	 * Constructor
	 * 
	 * @param booksDataSubject
	 */
	public BestsellerBookObserver(BooksDataSubject booksDataSubject) {
		super(booksDataSubject);
	}

	/**
	 * Method that updates static about bestseller book
	 */
	@Override
	public void update() {
		System.out.println("Updating static about Bestseller Book");
	}

}
