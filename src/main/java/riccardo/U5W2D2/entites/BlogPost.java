package riccardo.U5W2D2.entites;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BlogPost {

    private long id;

    private String category;

    private String title;

    private String cover;

    private String content;

    private int readingTime;

}
