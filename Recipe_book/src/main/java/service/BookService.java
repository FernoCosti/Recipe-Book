package service;

import model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    Book createRecipe(Book recipe);

    List<Book> getAllRecipe();
}