package cold.desginpattern.builderpattern.demo1.abstractbuilderIml;

import cold.desginpattern.builderpattern.demo1.abstractBuilder.MealBuilderFixed;
import cold.desginpattern.builderpattern.demo1.product.Meal;

/**
 * Description: design-pattern-demo1
 *   具体的建造者 ,这里是做套餐A
 * Created by ys on 2020/7/16 13:55
 */
public class SubMealBuilderA implements MealBuilderFixed {

    private Meal meal;
    @Override
    public void buildDrink() {
        meal.setDrink("可乐");
    }

    @Override
    public void buildFood() {
        meal.setFood("香辣鸡腿堡");

    }

    @Override
    public void buildSnack() {
        meal.setSnack("土豆泥");
    }

    @Override
    public Meal createMeal() {
        meal=new Meal();
        buildDrink();
        buildFood();
        buildSnack();
        System.out.println("创建了一个套餐A");
        return meal;
    }
}
