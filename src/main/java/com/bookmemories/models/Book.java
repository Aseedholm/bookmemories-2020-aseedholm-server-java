package com.bookmemories.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * This class represents the Book model that will serve as a table in the MySQL database. This class
 * is to be used whenever a user wants to add quotes or vocabulary from a book.
 */
@Entity
@Table(name = "books")
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

//  @OneToMany(mappedBy = "")
//  private List<Quote> quotes;
//
//  @OneToMany(mappedBy = "")
//  private List<Vocabulary> words;

  private String bookVersion;

  private String author;

  private String publisher;

  private String bookTitle;

  private Integer pageCount;

  /**
   * Constructs a Book object with all variables set to empty, null, or -1.
   */
  //null and empty are synonymous...
  public Book() {
//    this.quotes = new ArrayList<Quote>();
//    this.words = new ArrayList<Vocabulary>();
    this.bookVersion = null;
    this.author = null;
    this.publisher = null;
    this.bookTitle = null;
    this.pageCount = -1;
  }

  /**
   * Constructs a book object with all variables provided as arguments to the constructor.
   *
   * @param quotes a List that contains Quote objects representing the associated quotes
   *               to this book object.
   * @param words a List that contains Vocabulary objects representing the associated vocabulary
   *              words to this book object.
   * @param bookVersion a String representing the version of the book for this book object.
   * @param author a String representing the author of the book.
   * @param publisher a String representing the publisher of the book.
   * @param bookTitle a String representing the title of the book.
   * @param pageCount an Integer representing the number of pages in the book.
   */
  public Book(List<Quote> quotes, List<Vocabulary> words, String bookVersion, String author, String publisher, String bookTitle, Integer pageCount) {
//    this.quotes = quotes;
//    this.words = words;
    this.bookVersion = bookVersion;
    this.author = author;
    this.publisher = publisher;
    this.bookTitle = bookTitle;
    this.pageCount = pageCount;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

//  public List<Quote> getQuotes() {
//    return quotes;
//  }
//
//  public void setQuotes(List<Quote> quotes) {
//    this.quotes = quotes;
//  }
//
//  public List<Vocabulary> getWords() {
//    return words;
//  }
//
//  public void setWords(List<Vocabulary> words) {
//    this.words = words;
//  }

  public String getBookVersion() {
    return bookVersion;
  }

  public void setBookVersion(String bookVersion) {
    this.bookVersion = bookVersion;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public String getBookTitle() {
    return bookTitle;
  }

  public void setBookTitle(String bookTitle) {
    this.bookTitle = bookTitle;
  }

  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }
}
