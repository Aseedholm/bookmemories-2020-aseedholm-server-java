package com.bookmemories.daos;

import com.bookmemories.models.Book;

/**
 * This interface represents all the API calls that will be associated with the Book Model.
 *
 *
 *
 * */
//TODO - Better documentation.
public interface BookDAO {
  /**
   * Creates a book object based on the passed data.
   *
   * @param book a Book object.
   * @return a Book object.
   */
  Book createBook(Book book);


}
