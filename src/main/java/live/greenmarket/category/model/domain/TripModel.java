package live.greenmarket.category.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class TripEntity {
    private Long id;
    private Long cityId;
    private String tripName;
    private String tripContent;
}
