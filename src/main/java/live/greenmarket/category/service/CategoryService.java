package live.greenmarket.category.service;

import live.greenmarket.category.model.domain.CategoryModel;
import live.greenmarket.category.model.entity.CategoryEntity;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<CategoryModel> findAll();

    CategoryEntity save(CategoryModel category);

    Optional<CategoryEntity> findById(Long id);

    boolean existsById(Long id);

    long count();

    void deleteById(Long id);
}
