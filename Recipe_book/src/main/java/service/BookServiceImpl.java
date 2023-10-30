package service;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    private List<Book> recipeList = new ArrayList<>();

    @Override
    public Book createRecipe(Book recipe) {
        recipeList.add(recipe);
        System.out.println("Recipe was created");
        return recipe;
    }

    @Override
    public List<Book> getAllRecipe() {
        return recipeList;
    }
}