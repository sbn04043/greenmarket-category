package live.greenmarket.category.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "categories")
public class CategoryEntity {
    @Id
    //strategy 패턴: 고르는 것에 따라 메소드 실행을 다르게 함(auto increment)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "categoy_name")
    private String categoryName;

    @Column(name = "category_desc")
    private String categoryDesc;

    @Column(name = "create_by")
    private String createBy;
}
