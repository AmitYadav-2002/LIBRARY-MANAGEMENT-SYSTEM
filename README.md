Library Management System
                                  
Introduction:
                                   
Library Management System is a software which is designed to perform various operations in a library. This project helps the user and the staff to manage the library through digital mode. It is user friendly and efficient to use.


●	Components of the program MVC:

MVC stands for Model-View-Controller.
It is a way to organize and structure code to enhance maintainability, modularity, and scalability.

❖	Model:.In model there are two components that is library and book.

❖	View: View is used to interact with the user. It has some of the startup instructions which guides the user to do the required operation.

❖	Controller: In controller the control of the program has been designed.


● Workflow and Use of the program:


❖	The program starts by entering the details of the library which is entered by the user.

❖	After entering the details a menu bar is displayed to the user.

❖	The menu bar consists of some operations that the user can perform according to his/her choice.

❖	The operations are: add a book, remove a book, update a book, search for a book, display all the books and exit.

❖	There is a specific number allotted for the operations so respective to that number the user can choose the option.

❖	With the help of this system it becomes easy to manage and maintain the library. It is designed for both user as well as the library staff .

❖	It reduces the manual work as most of the things are done digitally. For example there is no need to maintain a register to keep the records of the books.


● Explanation of Program:

★ Model:

➢	Book: Book is a class in model package where there are some variables which are defined by the programmer which stores the information about the books. These variables are declared as privated and we use getter setter method to access those variables. Then the toString() method has been overridden to get the data entered by the user.

➢	Library: Library is a class in model package where there are some variables which are defined by the programmer which stores the information about the library. These variables are declared as privated and we use getter setter method to access those variables. Then the toString() method has been overridden to get the data entered by the user.

★	View: In view input is taken from the user. In the main method there is a do while loop used in which switch statement is included which helps to give menu driven program and helps the user to select menu options. The loop helps to execute the menu repeatedly.

★	Controller: In the controller the control of the program is achieved by creating various nonstatic methods which returns the values.


➢ The methods present are:

➔	addBook: With the help of this method the books are added which is entered by the user.

➔	searchBook: With the help of this method the user can search for the book which is present inside the library.

➔	removebook: With the help of this method the book which is present in the library can be removed.

➔	updateBookPricebyBookName: With the help of this method the price of the book which is present in the library can be updated.


Entities

Book

• Attributes:-

• bookName: Name of the book  
• bookPrice: Price of the book  
• authorName: Name of the author 

• Methods:-

• getBookName(): Returns the name of the book  
• setBookName(String bookName): Sets the name of the book  
• getBookPrice(): Returns the price of the book  
• setBookPrice(double bookPrice): Sets the price of the book  
• getAuthorName(): Returns the name of the author  
• setAuthorName(String authorName): Sets the name of the author  
• toString(): Returns a string representation of the book  

Library

• Attributes:-

• libraryName: Name of the library    
• libraryAddress: Address of the library    
• pincode: Pincode of the library location  
• books: List of books in the library  

• Methods:-

• getBooks(): Returns the list of books in the library  
• setBooks(List<Book> books): Sets the list of books in the library  
• getLibraryName(): Returns the name of the library  
• setLibraryName(String libraryName): Sets the name of the library  
• getLibraryAddress(): Returns the address of the library  
• setLibraryAddress(String libraryAddress): Sets the address of the library  
• getPincode(): Returns the pincode of the library location  
• setPincode(int pincode): Sets the pincode of the library location  

Functionality

• Add a book to the library

• Update book details

• Remove a book from the library

• Get book details

System Requirements :

Java Runtime Environment (JRE) installed on your computer.

User Interaction :

The application will greet you with a welcome message and prompt you to enter the library's details during the first run:


<img width="349" alt="image" src="https://github.com/AmitYadav-2002/LIBRARY-MANAGEMENT-SYSTEM/assets/162001129/ee1333e7-9884-4463-b639-9527103f8c8c">


Once the library details are set, the main menu appears:


<img width="355" alt="image" src="https://github.com/AmitYadav-2002/LIBRARY-MANAGEMENT-SYSTEM/assets/162001129/07eb5273-94d9-4e56-bfab-d97690be91e4">


The application will prompt you to enter details for the new book :


<img width="348" alt="image" src="https://github.com/AmitYadav-2002/LIBRARY-MANAGEMENT-SYSTEM/assets/162001129/a699c674-7604-43d9-aa22-58214ef0b013">


Choose option 2: "Remove book"


<img width="351" alt="image" src="https://github.com/AmitYadav-2002/LIBRARY-MANAGEMENT-SYSTEM/assets/162001129/c33a0bc0-57c4-4f03-a204-9a1ceccb7a6c">


Choose option 3: "Update book"


![image](https://github.com/AmitYadav-2002/LIBRARY-MANAGEMENT-SYSTEM/assets/162001129/2fd344c1-f847-41c1-9569-d8c98258cedc)


Choose option 4: "Get book" 

![image](https://github.com/AmitYadav-2002/LIBRARY-MANAGEMENT-SYSTEM/assets/162001129/54f37ac6-6bf3-4216-80fa-f749f8ee3e1b)








