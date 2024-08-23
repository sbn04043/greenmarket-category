package live.greenmarket.category.controller;

import live.greenmarket.category.model.domain.CategoryModel;
import live.greenmarket.category.model.entity.CategoryEntity;
import live.greenmarket.category.service.CategoryService;
import live.greenmarket.category.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category/")
public class CategoryController {
    private final CategoryService CATEGORY_SERVICE;

    @Autowired
    public CategoryController(CategoryServiceImpl categoryServiceImpl) {
        CATEGORY_SERVICE = categoryServiceImpl;
    }

    @GetMapping("findAll")
    public List<CategoryModel> findAll() {
        System.out.println("hi");
        return CATEGORY_SERVICE.findAll();
    }

    @PostMapping("save")
    public CategoryEntity save(@RequestParam CategoryModel category) {

        return CATEGORY_SERVICE.save(category);
    }

    public Optional<CategoryEntity> findById(Long id) {
        return Optional.empty();
    }

    public boolean existsById(Long id) {
        return false;
    }

    public long count() {
        return 0;
    }

    public void deleteById(Long id) {

    }
}
