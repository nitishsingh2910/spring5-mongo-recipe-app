package guru.springframework.spring5recipeapp.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@EqualsAndHashCode(exclude = "recipe")
public class Notes {

    @Id
    private String id;
//    private Recipe recipe;
    private String recipeNotes;

    public Notes() {
    }

}
