package com.bookmemories.models;

import javax.persistence.Entity;

/**
 * This class represents a Quote from an exported book ....
 */ //TODO finish documentation.
@Entity
public class Quote extends Export{
  //TODO - this might be better as a String instead of an Integer.
  private Integer startOfQuote;
  private Integer endOfQuote;

  private String whyQuoted;

  private String saidBy;

  public Quote() {
    super();
    this.startOfQuote = -1;
    this.endOfQuote = -1;
    this.whyQuoted = null;
    this.saidBy = null;
  }

  public Quote(Integer startOfQuote, Integer endOfQuote, String whyQuoted, String saidBy) {
    this.startOfQuote = startOfQuote;
    this.endOfQuote = endOfQuote;
    this.whyQuoted = whyQuoted;
    this.saidBy = saidBy;
  }

  public Quote(Integer bookId, Integer pageOn, String content, Integer chapterNumber, String chapterTitle, Integer startOfQuote, Integer endOfQuote, String whyQuoted, String saidBy) {
    super(bookId, pageOn, content, chapterNumber, chapterTitle);
    this.startOfQuote = startOfQuote;
    this.endOfQuote = endOfQuote;
    this.whyQuoted = whyQuoted;
    this.saidBy = saidBy;
  }

  public Integer getStartOfQuote() {
    return startOfQuote;
  }

  public void setStartOfQuote(Integer startOfQuote) {
    this.startOfQuote = startOfQuote;
  }

  public Integer getEndOfQuote() {
    return endOfQuote;
  }

  public void setEndOfQuote(Integer endOfQuote) {
    this.endOfQuote = endOfQuote;
  }

  public String getWhyQuoted() {
    return whyQuoted;
  }

  public void setWhyQuoted(String whyQuoted) {
    this.whyQuoted = whyQuoted;
  }

  public String getSaidBy() {
    return saidBy;
  }

  public void setSaidBy(String saidBy) {
    this.saidBy = saidBy;
  }
}
