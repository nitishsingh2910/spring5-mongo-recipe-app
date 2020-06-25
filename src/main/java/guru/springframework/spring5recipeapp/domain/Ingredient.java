package guru.springframework.spring5recipeapp.domain;

import javax.persistence.*;
import java.math.BigDecimal;

public class Ingredient {

    private String id;
    private String description;
    private BigDecimal amount;

    private UnitOfMeasure uom;

    private Recipe recipe;

    public Ingredient(){

    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
        this.recipe = recipe;
    }

    public String getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public UnitOfMeasure getUom() {
        return this.uom;
    }

    public Recipe getRecipe() {
        return this.recipe;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setUom(UnitOfMeasure uom) {
        this.uom = uom;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
