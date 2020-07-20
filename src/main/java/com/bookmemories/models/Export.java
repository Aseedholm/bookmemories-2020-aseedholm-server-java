package com.bookmemories.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * This class represents a parent class for Quote and Vocabulary classes. It contains all common
 * variables and methods between the two classes and enforces a single table inheritance strategy
 * when creating the table in the MySQL database.
 */
@Entity
//Single table inheritance for performance.
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "exports")
public class Export {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

//  //FK referencing the book associated with the exported material.
//  private Integer bookId;

  //TODO - this might be better as a String instead of an Integer.
  private Integer pageOn;

  private String content;

  //TODO - this might be better as a String instead of an Integer.
  private Integer chapterNumber;

  private String chapterTitle;

  public Export() {
//    this.bookId = -1;
    this.pageOn = -1;
    this.content = null;
    this.chapterNumber = -1;
    this.chapterTitle = null;
  }

  public Export(Integer bookId, Integer pageOn, String content, Integer chapterNumber, String chapterTitle) {
//    this.bookId = bookId;
    this.pageOn = pageOn;
    this.content = content;
    this.chapterNumber = chapterNumber;
    this.chapterTitle = chapterTitle;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

//  public Integer getBookId() {
//    return bookId;
//  }
//
//  public void setBookId(Integer bookId) {
//    this.bookId = bookId;
//  }

  public Integer getPageOn() {
    return pageOn;
  }

  public void setPageOn(Integer pageOn) {
    this.pageOn = pageOn;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Integer getChapterNumber() {
    return chapterNumber;
  }

  public void setChapterNumber(Integer chapterNumber) {
    this.chapterNumber = chapterNumber;
  }

  public String getChapterTitle() {
    return chapterTitle;
  }

  public void setChapterTitle(String chapterTitle) {
    this.chapterTitle = chapterTitle;
  }
}
