package riccardo.U5W2D2.entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Author {

    private long id;

    private String name;

    private String lastName;

    private String email;

    private LocalDate dateOfBirth;

    private String avatar;

    public Author(long id, String name, String lastName, String email, LocalDate dateOfBirth, String avatar) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.avatar = "https://ui-avatars.com/api/?name=" + name + "+" + lastName;
    }
}
