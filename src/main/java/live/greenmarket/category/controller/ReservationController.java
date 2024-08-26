package live.greenmarket.category.controller;

import live.greenmarket.category.model.entity.HotelEntity;
import live.greenmarket.category.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
@RequestMapping("/hotel/")
@RequiredArgsConstructor
public class HotelController{
    private final HotelService hotelService;

    public List<HotelEntity> findAll() {
        return List.of();
    }

    public HotelEntity save(HotelEntity hotel) {
        return null;
    }

    public Optional<HotelEntity> findById(Long id) {
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
