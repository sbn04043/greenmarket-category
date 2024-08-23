package live.greenmarket.category.model.repository;

import live.greenmarket.category.model.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//eager: 안정성 때문에 사용
@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
    public List findAll();
    public CategoryEntity save(CategoryEntity category);
}
