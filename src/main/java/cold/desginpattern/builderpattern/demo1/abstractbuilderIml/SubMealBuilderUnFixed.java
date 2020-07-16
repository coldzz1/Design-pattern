package cold.desginpattern.builderpattern.demo1.abstractbuilderIml;

import cold.desginpattern.builderpattern.demo1.abstractBuilder.MealBuilderUnFixed;
import cold.desginpattern.builderpattern.demo1.product.Meal;

/**
 * Description: design-pattern-demo
 * <p>
 * Created by ys on 2020/7/16 14:34
 */
public class SubMealBuilderUnFixed implements MealBuilderUnFixed {

    private Meal meal =new Meal();


    @Override
    public void addFood(String food) {
        meal.setFood(food);
    }

    @Override
    public void addDrink(String drink) {
        meal.setDrink(drink);
    }

    @Override
    public void addSnack(String snack) {
        meal.setSnack(snack);
    }

    @Override
    public Meal createMealUnFixed() {
        return meal;
    }
}
