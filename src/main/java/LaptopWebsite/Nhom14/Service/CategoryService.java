package LaptopWebsite.Nhom14.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LaptopWebsite.Nhom14.Model.Category;
import LaptopWebsite.Nhom14.Repository.CategoryRepository;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> GetAllCategories(){return categoryRepository.findAll();}

    public Category getCategoryById(Integer id){return categoryRepository.findById(id).orElse(null);}

    public void deleteCategory(Integer id){categoryRepository.deleteById(id);}

    public Category saveCategory(Category category){return categoryRepository.save(category);}
}
