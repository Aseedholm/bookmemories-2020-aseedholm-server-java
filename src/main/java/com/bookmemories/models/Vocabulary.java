package com.bookmemories.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * This class represents the Vocabulary terms exported from a Book, represented by the Book class
 * model. The Vocabulary class extends the Export class, which keeps track of the Book's id as a
 * foreign key.
 */
@Entity
public class Vocabulary extends Export{

  //example of the vocabulary word.
  private String example;

  //examples of synonyms for the vocabulary word.
  private String synonym;

  @ManyToOne
  private Book book;

  public Vocabulary(){
    super();
    this.example = null;
    this.synonym = null;
    this.book = new Book();
  }

  public Vocabulary(String example, String synonym, Book book) {
    this.example = example;
    this.synonym = synonym;
    this.book = book;
  }

  public Vocabulary(Integer bookId, Integer pageOn, String content, Integer chapterNumber, String chapterTitle, String example, String synonym, Book book) {
    super(bookId, pageOn, content, chapterNumber, chapterTitle);
    this.example = example;
    this.synonym = synonym;
    this.book = book;
  }

  public String getExample() {
    return example;
  }

  public void setExample(String example) {
    this.example = example;
  }

  public String getSynonym() {
    return synonym;
  }

  public void setSynonym(String synonym) {
    this.synonym = synonym;
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }
}
