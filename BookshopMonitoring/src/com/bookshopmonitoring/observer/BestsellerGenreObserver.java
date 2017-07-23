package com.bookshopmonitoring.observer;

import com.bookshopmonitoring.api.BooksDataObserver;
import com.bookshopmonitoring.api.BooksDataSubject;

/**
 * @author Romulo Augusto - romuloaugusto.silva@gmail.com
 * 
 * Observer of bestseller book.
 *
 */
public class BestsellerGenreObserver extends BooksDataObserver {

	/**
	 * Constructor
	 * 
	 * @param booksDataSubject
	 */
	public BestsellerGenreObserver(BooksDataSubject booksDataSubject) {
		super(booksDataSubject);
	}

	/**
	 * Method that updates static about bestseller genre
	 */
	@Override
	public void update() {
		System.out.println("Updating static about Bestseller Genre");
	}

}
