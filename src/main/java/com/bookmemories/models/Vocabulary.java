package com.bookmemories.models;

import javax.persistence.Entity;
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

  public Vocabulary(){
    super();
    this.example = null;
    this.synonym = null;
  }

  public Vocabulary(String example, String synonym) {
    this.example = example;
    this.synonym = synonym;
  }

  public Vocabulary(Integer bookId, Integer pageOn, String content, Integer chapterNumber, String chapterTitle, String example, String synonym) {
    super(bookId, pageOn, content, chapterNumber, chapterTitle);
    this.example = example;
    this.synonym = synonym;
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
}
