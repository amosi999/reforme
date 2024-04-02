package reforme.reforme.domain.board;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import reforme.reforme.domain.Category;
import reforme.reforme.domain.Image;
import reforme.reforme.domain.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter @Setter
public abstract class Board {

    @Id @GeneratedValue
    @Column(name = "board_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private String title;

    private String body;

    @OneToMany(mappedBy = "image", cascade = CascadeType.ALL)
    private List<Image> images = new ArrayList<>();

    private LocalDateTime createdDateTime;

    private LocalDateTime modifiedDateTime;

    @Enumerated(EnumType.STRING)
    private Category category; // 카테고리 [TOP, BOTTOM, OUTWEAR, BAG, ETC]

}
