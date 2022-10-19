package ar.edu.larioja.control.stock.Services;

import ar.edu.larioja.control.stock.Models.Category;

import java.util.List;

public interface CategoryService {


    public Category createCategory(Category Category);
    public Category updateCategory(Category emp);
    public Category getCategory(Long empId);
    public void deleteCategory(Long empId);
    public List <Category> getAllCategory();
}
