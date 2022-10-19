package ar.edu.larioja.control.stock.Services;

import ar.edu.larioja.control.stock.Models.Category;
import ar.edu.larioja.control.stock.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save ( category );
    }

    @Override
    public Category updateCategory(Category emp) {
        return null;
    }

    @Override
    public Category getCategory(Long Id) {

        Optional<Category> optionalCat = categoryRepository.findById(Id);
        if (optionalCat.isPresent()) {
            return optionalCat.get();
        }
        return null;
    }

    @Override
    public void deleteCategory(Long empId) {

    }

    @Override
    public List <Category> getAllCategory() {
        return categoryRepository.findAll ();
    }
}
