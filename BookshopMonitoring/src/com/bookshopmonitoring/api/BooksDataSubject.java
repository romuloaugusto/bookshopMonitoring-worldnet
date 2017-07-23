package com.bookshopmonitoring.api;


import java.util.ArrayList;

import com.bookshopmonitoring.model.Book;

/**
 * 
 * @author Romulo Augusto - romuloaugusto.silva@gmail.com
 *
 * Class that has methods to attach and detach observers to a client object.
 * Besides this notifies his clients about modifications
 */
public class BooksDataSubject {

	protected ArrayList<BooksDataObserver> observers;
	protected Book book;

	/**
	 * Constructor 
	 */
	public BooksDataSubject() {
		observers = new ArrayList<BooksDataObserver>();
	}
	
	/**
	 * Method that adds an client to observer list
	 * 
	 * @param observer
	 */
	public void attach(BooksDataObserver observer) {
		observers.add(observer);
	}

	/**
	 * Method that remove an client from observer list
	 * 
	 * @param indice
	 */
	public void detach(int indice) {
		observers.remove(indice);
	}
	
	/**
	 * Method that notifies the clients about modifications.
	 */
	private void notifyObservers() {
		for (BooksDataObserver observer : observers) {
			observer.update();
		}
	}

	/**
	 * @param book the book to set
	 */
	public void setState(Book book) {
		this.book = book;
		notifyObservers();
	}

	/**
	 * @return the book
	 */
	public Book getState() {
		return book;
	}
	
	

}
