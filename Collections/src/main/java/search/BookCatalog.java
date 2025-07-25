package main.java.search;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private final List<Book> listcatalogBooks;


    public BookCatalog(){
        this.listcatalogBooks = new ArrayList<>();
    }

    public void addBook (String title, String author , int yearPublish){
        listcatalogBooks.add(new Book(title,author,yearPublish));
        System.out.println("Livros adicionados ao catalogo!");
    }

    public List<Book> searchBooksToAuthor(String author){
        List<Book> booksToAuthor  = new ArrayList<>();

        if ( !listcatalogBooks.isEmpty()){
            for (Book b : listcatalogBooks){
                if ( b.getAuthor().equalsIgnoreCase(author)){
                    booksToAuthor.add(b);
                }
            }
        }

        return booksToAuthor;
    }

    public Book searchBooksToTitle (String title){
        Book booksToTitle = null;
        if (!listcatalogBooks.isEmpty()){
            for (Book b : listcatalogBooks){
                if ( b.getTitle().equalsIgnoreCase(title));
                booksToTitle = b;
            }
        }
        return booksToTitle;
    }

    public List<Book> searchBooksyearInterval (int  anoInicial, int anoFinal){
        List<Book> booksToYearInterval = new ArrayList<>();
        if (!listcatalogBooks.isEmpty()){
            for (Book b : listcatalogBooks){
                if ( b.getYearPublish() >= anoInicial && b.getYearPublish() <= anoFinal);
                booksToYearInterval.add(b);
            }
        }
        return booksToYearInterval;
    }


    public static void main(String[] args) {
        BookCatalog listBooks = new BookCatalog();

        listBooks.addBook("Menina na Selva","Joao", 2019);
        listBooks.addBook("Joao e o pé de feijão", "Jozias", 2010);

        listBooks.addBook("Livro 3", "Author 3", 2012);

        listBooks.addBook("Livro 4", "Author 4", 2014);

        listBooks.addBook("Livro 5", "Author 5", 2016);

        listBooks.addBook("Livro 6", "Author 6", 2017);

        System.out.print( listBooks.searchBooksToAuthor("Joao"));
        System.out.print( listBooks.searchBooksToTitle("Livro 6"));
        System.out.print( listBooks.searchBooksyearInterval(2015,2019));





    }
}

