package cold.desginpattern.builderpattern.demo1.abstractBuilder;

import cold.desginpattern.builderpattern.demo1.product.Meal;

/**
 * Description:
 * 抽象建造者-自由选择套餐中的主食选项(不固定套餐)
 * Created by ys on 2020/7/16 14:32
 */
public interface  MealBuilderUnFixed {

    //只是规定了有哪些组成(跟建筑设计规定了有哪些模块一样)

    void addFood(String food);

    void addDrink(String drink);

    void addSnack(String snack);

    Meal createMealUnFixed();
}
