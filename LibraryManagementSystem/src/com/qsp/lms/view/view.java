package com.qsp.lms.view;

import java.util.Scanner;

import com.qsp.lms.controller.Controller;
import com.qsp.lms.model.Book;
import com.qsp.lms.model.Library;

public class view {
	static private Library library = new Library();
	
	public static Library getLibrary() {
		return library;
	}

	public static void setLibrary(Library library) {
		view.library = library;
	}

	public static Scanner getMyInput() {
		return myInput;
	}

	public static void setMyInput(Scanner myInput) {
		view.myInput = myInput;
	}

	static Scanner myInput = new Scanner(System.in);
	static Controller controller = new Controller();
	static {
		System.out.println("------Welcome to LMS-------");
		System.out.print("Enter name of library:");
		String libraryName = myInput.nextLine();
		library.setLibraryName(libraryName);
		//
		System.out.print("Enter address of library:");
		library.setLibraryAddress(myInput.nextLine());
		System.out.print("Enter pincode :");
		library.setPincode(myInput.nextInt());
		myInput.nextLine();
	}

	public static void main(String[] args) {
//	    System.out.println(library.getLibraryName());
//	    System.out.println(library.getLibraryAddress());
//	    System.out.println(library.getPincode());
		
		
		do {
			System.out.println("Select option to perform");
			System.out.println("1.Add Book\n2.Remove Book\n3.Update Book\n4.Get Book\n0.Exit");
			System.out.print("Enter digit respective to desired option :");
			Byte userChoice = myInput.nextByte();
			myInput.nextLine();
			switch(userChoice) {
			case 0:
				myInput.close();
				System.out.println("-----------E X I T E D-----------");
				System.exit(0);
				break;
            case 1:
            {
            	Book book = new Book();
            	System.out.print("Enter Book name : ");
            	book.setBookName(myInput.nextLine());
            	System.out.print("Enter Author Name : ");
            	book.setBookAuthorName(myInput.nextLine());
            	System.out.print("Enter price : ");
            	book.setBookprice(myInput.nextDouble());
            	controller.addBook(book);
            }
				break;
            case 2:
            {
            	System.out.print("Enter book name you want to remove : ");
                String bookToRemove = myInput.nextLine();
                if (controller.removebook(bookToRemove)) {
					System.out.print("Requested book has been removed : ");
				}
                else {
                	System.out.print("Book does not exist : ");
                	  break;
                }
    
            }
            case 3:
            {
            	System.out.println("Enter book name to update : ");
            	Book bookExist = controller.getBook(myInput.nextLine());
            	Book bookToUpdate = bookExist;
            	if (bookExist !=null) {//Book Exist karta hai
            		System.out.println("What details to update?");
            		System.out.println("1.Book name\n2.Author name\n3.Book price");
            		System.out.println("Enter digit respective to the option : ");
            		byte updateChoice = myInput.nextByte();
            		myInput.nextLine();
            		switch(updateChoice) {
            		case 1:
            			System.out.println("Enter the book name to update : ");
            			bookExist.setBookName(myInput.nextLine());
            			break;
            			
            		case 2:
            			System.out.println("Enter the Author name to update : ");
            			bookExist.setBookAuthorName(myInput.nextLine());
            			break;
            			
            		case 3:
            			System.out.println("Enter the updated book price : ");
            			double newBookPrice = myInput.nextDouble();
            			myInput.nextLine();
            			bookExist.setBookprice(newBookPrice);
            			break;
            			default:
            				System.out.println("Please Select the Correct option!!!!");
            				break;
            		}
				}
            	else {
            		System.out.println("Book doesnt exist,updation cannot be performed");
            	}
            
				if (controller.update(bookExist, bookToUpdate)) {
					System.out.println("updation completed successfully");
					
				} else {
                   System.out.println("failed updation");
				}
            }
	
	          break;
            case 4:
	              System.out.print("Enter book name you are looking for :");
	              Book fetchbook = controller.getBook(myInput.nextLine());
	              if (fetchbook != null) {
					System.out.print("Book is Available : ");
					System.out.print("Deatils : ");
					System.out.print(fetchbook);
				} else {
                    System.out.print("Book is not Available :");
				}
	           break;
	           
	        default:
	        	   System.out.print("Invalid selection");

		} 
	}while (true);

}
}