package com.deloitte.library.main;
import java.util.*;

import com.library.model.Books;
import com.library.services.BookImpl;

public class LibraryDemo {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		String option;
		//Books book = new Books();
		BookImpl booksImpl = new BookImpl();
		List<Books> booklist=new ArrayList<Books>();
		
		while (true) {
			System.out.println("1. ADD BOOK " + "\n 2.DISPLAY BOOK" + "\n 3.EXIT");
			option = sc.next();
			//System.out.println("Enter no:of books");
			//int num = sc.nextInt();
			switch (option) {
			case "1":
				
			
				// for (int i = 0; i < num; i++) {
				System.out.println("Enter book name");
				String bookName = sc.next();

				System.out.println("Enter book price");
				String bookPrice = sc.next();

				System.out.println("Enter book author");
				String bookAuthor = sc.next();
				 
			
			booklist.add(booksImpl.addBooks(bookName, bookPrice, bookAuthor));
				
			//}
				break;

			case "2": for(Books book:booklist)
					System.out.println(book);
			break;
			
			case "3":System.exit(0);
			break;

			}

		}

	}

}
