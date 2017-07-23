package com.bookshopmonitoring.demo;

import com.bookshopmonitoring.api.BooksDataSubject;
import com.bookshopmonitoring.model.Book;
import com.bookshopmonitoring.observer.BestsellerAuthorObserver;
import com.bookshopmonitoring.observer.BestsellerBookObserver;
import com.bookshopmonitoring.observer.BestsellerGenreObserver;

public class Demo {
	
	public static void main(String[] args) {
		BooksDataSubject subject = new BooksDataSubject();		
		subject.attach(new BestsellerAuthorObserver(subject));
		subject.attach(new BestsellerBookObserver(subject));
		subject.attach(new BestsellerGenreObserver(subject));
		
		// Simulating the sale of a book
		subject.setState(new Book("Holy Bible", "God", "Religion"));
		
		subject.setState(new Book("A Gentleman in Moscow", "Amor Towles", "Drama"));
	}

}
