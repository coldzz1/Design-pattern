package cold.desginpattern.builderpattern.demo1.abstractbuilderIml;

import cold.desginpattern.builderpattern.demo1.abstractBuilder.MealBuilderFixed;
import cold.desginpattern.builderpattern.demo1.product.Meal;

/**
 * Description: design-pattern-demo1
 *   具体的建造者 - 这里是制作套餐B
 * Created by ys on 2020/7/16 14:01
 */
public class SubMealBuilderB implements MealBuilderFixed {

    private Meal meal;

    @Override
    public void buildDrink() {
        meal.setFood("老北京鸡肉卷");
    }

    @Override
    public void buildFood() {
        meal.setDrink("雪碧");
    }

    @Override
    public void buildSnack() {
        meal.setSnack("鲜蔬汤");
    }

    @Override
    public Meal createMeal() {
        meal=new Meal();
        buildDrink();
        buildFood();
        buildSnack();
        System.out.println("创建了B套餐");
        return meal;
    }
}
