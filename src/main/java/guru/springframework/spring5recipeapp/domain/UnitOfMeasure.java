package guru.springframework.spring5recipeapp.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class UnitOfMeasure {

    private String id;
    private String description;

    public UnitOfMeasure() {
    }
}
