package controller;

import model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.BookService;

import java.util.List;

@RestController
@RequestMapping("api/recipes")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<Book> createRecipe(@RequestBody Book recipe) {
        return ResponseEntity.ok(bookService.createRecipe(recipe));
    }

    @GetMapping()
    public ResponseEntity<List<Book>> getAllRecipe() {
        return ResponseEntity.ok(bookService.getAllRecipe());
    }
}