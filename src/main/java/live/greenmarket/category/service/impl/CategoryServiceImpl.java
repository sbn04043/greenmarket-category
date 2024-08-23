package live.greenmarket.category.service.impl;

import live.greenmarket.category.model.domain.CategoryModel;
import live.greenmarket.category.model.entity.CategoryEntity;
import live.greenmarket.category.model.repository.CategoryRepository;
import live.greenmarket.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository CATEGORY_REPOSITORY;

    @Autowired
    public CategoryServiceImpl(CategoryRepository CATEGORY_REPOSITORY) {
        this.CATEGORY_REPOSITORY = CATEGORY_REPOSITORY;
    }

    @Override
    public List<CategoryModel> findAll() {
        return CATEGORY_REPOSITORY.findAll();
    }

    @Override
    public CategoryEntity save(CategoryModel category) {
        return null;
    }

    @Override
    public Optional<CategoryEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {

    }
}
