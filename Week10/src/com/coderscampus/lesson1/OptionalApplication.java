package com.coderscampus.lesson1;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.util.Optional;


public class OptionalApplication {

    public static void main(String[] args) {
//lesson 1
        Optional<String> fullName = Optional.of("Casey Michael");

        System.out.println(fullName);

        String casey = fullName.get();

        System.out.println(casey);
//lesson 2
        Recipe cookies = new Recipe();
        cookies.setName("Chocolate Chip cookies");
        cookies.setInstructions("1. Preheat oven\n2. Put dough on baking sheet\n3. Cook dough for 15 minutes");
        cookies.setPriceOpt(new BigDecimal(9.99));

        System.out.println(cookies);

        BigDecimal price = cookies.getPriceOpt()
                .map(p -> p)
                .orElse(new BigDecimal(0));

        cookies.setPriceOpt(new BigDecimal(20.00));
        //lesson 4

        cookies.getPriceOpt()
                .ifPresent(RecipeService::billClient);



//        cookies.getPriceOpt()
//
//        if (cookies.getPriceOpt().isPresent()) {
//            BigDecimal price = cookies.getPriceOpt().get;
//            System.out.println(price);
//        }

    //lesson5

    }

}
