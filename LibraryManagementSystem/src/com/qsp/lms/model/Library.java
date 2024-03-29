package com.qsp.lms.model;

import java.util.List;

public class Library {
        private String libraryName;
        private String libraryAddress;
        private int pincode;
        
        private List<Book> book;

		public String getLibraryName() {
			return libraryName;
		}

		public void setLibraryName(String libraryName) {
			this.libraryName = libraryName;
		}

		public String getLibraryAddress() {
			return libraryAddress;
		}

		public void setLibraryAddress(String libraryAddress) {
			this.libraryAddress = libraryAddress;
		}

		public int getPincode() {
			return pincode;
		}

		public void setPincode(int pincode) {
			this.pincode = pincode;
		}

		public List<Book> getBook() {
			return book;
		}

		public void setBook(List<Book> book) {
			this.book = book;
		}
        
        
}
