package live.greenmarket.category.controller;

import live.greenmarket.category.model.entity.ReviewEntity;
import live.greenmarket.category.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/review/")
@RequiredArgsConstructor
public class ReviewController{
    public List<ReviewEntity> findAll() {
        return List.of();
    }

    public ReviewEntity save(ReviewEntity review) {
        return null;
    }

    public Optional<ReviewEntity> findById(Long id) {
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
