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
