package live.greenmarket.category.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class RoomEntity {
    private Long id;
    private Long hotelId;
    private String roomName;
    private Long roomMax;
    private Long roomPrice;
    private String roomContent;
}
