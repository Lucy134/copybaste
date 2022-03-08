package com.recipe.copybaste.models;

import javax.persistence.*;

@Entity
public class RecipeJunction {
    @Id
    @GeneratedValue
    private Integer junctionID;


    @ManyToOne
    @JoinColumn(name = "recipeId")
    private Recipe recipe;
    @ManyToOne
    @JoinColumn(name = "product")
    private Ingredient ingredient;
    private String unit;
    private Double quantity;
    private String preparationNotes;

    public RecipeJunction(Recipe recipe, Ingredient ingredient, String unit, Double quantity, String preparationNotes) {
        this.recipe = recipe;
        this.ingredient = ingredient;
        this.unit = unit;
        this.quantity = quantity;
        this.preparationNotes = preparationNotes;
    }
    public RecipeJunction() {
    }



    public Integer getJunctionID() {
        return junctionID;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public String getMeasurement() {
        return unit;
    }

    public Double getQuantity() {
        return quantity;
    }

    public String getPreparationNotes() {
        return preparationNotes;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public void setMeasurement(String unit) {
        this.unit = unit;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public void setPreparationNotes(String prepNotes) {
        this.preparationNotes = preparationNotes;
    }
}
