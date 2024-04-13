package com.coderscampus.lesson1;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Optional;

public class Recipe {

    private String name;
    private String instructions;
    private Optional<BigDecimal> priceOpt = Optional.empty();

    //Optional.empty is the proper way to assign null to an optional variable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Optional<BigDecimal> getPriceOpt() {
        return priceOpt;
    }

    public void setPriceOpt(BigDecimal priceOpt) {
        this.priceOpt = Optional.ofNullable(null);
        //prob wont do this because you really want to get away from null values with optionals
    }

    public String toString() {
        return "Recipe [name=" + name + ", instructions=" + instructions + getPrice() + "]";

    }
    private String getPrice() {
        String priceString = priceOpt.map(price -> ", price=" + price)
                                      .orElse(", price=free");
        return priceString;

    }
}


