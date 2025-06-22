package Pract;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "\"" + title + "\"by" + author + "(ISBN:" + ISBN + ")";
    }
}

class Member {
    private String name;
    private String memberId;
    private List<Book> borrowedBooks;

    public Member(String name, String memberId) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }
    public void borrowBook(Book book){
        borrowedBooks.add(book);
         System.out.println(name + " borrowed: " + book);
    }
    public void returnBook(String isbn) {
        Book toReturn = null;
        for (Book book : borrowedBooks) {
            if (book.getISBN().equals(isbn)) {
                toReturn = book;
                break;
            }
        }

        if (toReturn != null) {
            borrowedBooks.remove(toReturn);
            System.out.println(name + " returned: " + toReturn);
        } else {
            System.out.println("Book with ISBN " + isbn + " not found in borrowed list.");
        }
        
    }
     public void listBorrowedBooks() {
        System.out.println("Books borrowed by " + name + ":");
        if (borrowedBooks.isEmpty()) {
            System.out.println("  No books currently borrowed.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println("  - " + book);
            }
        }
    }
}

// Task 2: Library Management System
// OOP Concepts: Composition, Encapsulation, Polymorphism
// Description:
// Create a Book class with title, author, ISBN.
// Create a Member class with name, memberId, and a list of borrowed books.
// Use composition to store multiple Book objects in a Member.
// Create methods to borrow and return books.
public class Library_Manag_System {
public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");

        member1.borrowBook(book1);
        member1.borrowBook(book2);
        member1.listBorrowedBooks();

        member2.borrowBook(book1);
        member2.listBorrowedBooks();

        member1.returnBook("1234567890");
        member1.listBorrowedBooks();
    }
}
