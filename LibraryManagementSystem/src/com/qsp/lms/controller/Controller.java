package com.qsp.lms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.qsp.lms.model.Book;
import com.qsp.lms.model.Library;
import com.qsp.lms.view.view;

public class Controller {
       private Library library = view.getLibrary();
       
       public void addBook(Book book) {
    	   List<Book> books = library.getBook();
    	   if (books == null) {
    		   books = new ArrayList<>();
    	   }
    	   books.add(book);
    	   library.setBook(books);
       }
       
       public boolean removebook(String bookName) {
    	      Book book = getBook(bookName);
    	      if (book != null) {//Book exist
    	    	  List<Book> books = library.getBook();
    	    	  boolean remove = books.remove(book);
    	    	  library.setBook(books);
    	    	  return true;
    		}
    	  	return false;
    		}
       
       public Book getBook(String bookName) {
    	   List<Book> books = library.getBook();
    	   
    	   if(books!=null) {//list of book exists
    		   for (Book book : books) {
    			   if (book.getBookName().equalsIgnoreCase(bookName)) {
					 return book;
				}
    		   }
    	   }
    	   return null;
    	      
       }

	public boolean update(Book bookExist, Book bookToUpdate) {
	    List<Book> books = library.getBook();
	    for(Book book : books) {
	    	if (book.getBookName().equalsIgnoreCase(bookExist.getBookName())) {
	    		books.remove(bookExist);
	    		books.add(bookToUpdate);
	    		library.setBook(books);
	    		return true;
				
			}
		}
	
		return false;
	}

	

}
  
