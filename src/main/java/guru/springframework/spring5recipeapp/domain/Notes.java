package guru.springframework.spring5recipeapp.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode(exclude = "recipe")
public class Notes {

    private String id;
    private Recipe recipe;
    private String recipeNotes;

    public Notes() {
    }

}
