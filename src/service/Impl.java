package service;

import enums.Genre;
import model.Book;
import model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Impl implements BookService,UserService{

    List<Book>bookList=new ArrayList<>();
    List<User>userList=new ArrayList<>();
    @Override
    public List<Book> createBooks(List<Book> books) {
        return this.bookList;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookList;
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        List<Book>historikal=bookList.stream().filter(book -> book.getGenre().equals(Genre.HISTORICAL)).toList();
        for (Book book : bookList) {

        }
        return historikal;
    }

    @Override
    public Book removeBookById(Long id) {
        return null;
    }

    @Override
    public List<Book> sortBooksByPriceInDescendingOrder() {
        List<Book>bookList1=bookList.stream().sorted(Comparator.comparing(Book::getPrice)).collect(Collectors.toList());
        return bookList1;
    }

    @Override
    public List<Book> filterBooksByPublishedYear() {
        List<Book>bookList1=bookList.stream().filter(book -> book.getPublishedYear().equals(2019)).toList();

        return bookList1;
    }

    @Override
    public List<Book> getBookByInitialLetter() {
        return null;
    }

    @Override
    public Book maxPriceBook() {
        Book book=bookList.stream().max(Comparator.comparing(Book::getPrice)).orElseThrow();
        return book;
    }

    @Override
    public String createUser(List<User> users) {
       userList.addAll(users);

        return "User CREATED successfully!";
    }

    @Override
    public List<User> findAllUsers() {
        return userList;
    }

    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public String removeUserByName(String name) {
        return null;
    }

    @Override
    public void updateUser(Long id) {

    }

    @Override
    public void groupUsersByGender() {

    }

    @Override
    public String buyBooks(String name, List<Book> books) {
        return null;
    }
}
