package reforme.reforme.domain.board;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import reforme.reforme.domain.YouCategory;

@Entity
@Getter @Setter
public class Reforyou extends Board {

    @Enumerated(EnumType.STRING)
    private YouCategory category; // 카테고리 [CLOTHES, BAG, SHOES, ETC]
}
