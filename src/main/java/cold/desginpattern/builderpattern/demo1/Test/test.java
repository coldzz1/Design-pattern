package cold.desginpattern.builderpattern.demo1.Test;

import cold.desginpattern.builderpattern.demo1.abstractBuilder.MealBuilderFixed;
import cold.desginpattern.builderpattern.demo1.abstractBuilder.MealBuilderUnFixed;
import cold.desginpattern.builderpattern.demo1.abstractbuilderIml.SubMealBuilderA;
import cold.desginpattern.builderpattern.demo1.abstractbuilderIml.SubMealBuilderB;
import cold.desginpattern.builderpattern.demo1.abstractbuilderIml.SubMealBuilderUnFixed;
import cold.desginpattern.builderpattern.demo1.director.KFCWaiter;
import cold.desginpattern.builderpattern.demo1.product.Meal;

/**
 * Description: design-pattern-demo
 * <p>
 * Created by ys on 2020/7/16 14:47
 */
public class test {

    public static void main(String[] args) {
        //非固定模式
        MealBuilderUnFixed builder =new SubMealBuilderUnFixed();
        KFCWaiter waiter=new KFCWaiter(builder);
        Meal mealForUnFixed = waiter.createMealForUnFixed("嫩牛五方", "无糖可乐", "无骨鸡流");
        System.out.println(mealForUnFixed);

        //固定模式创建套餐A
        MealBuilderFixed builderFixed=new SubMealBuilderA();
        KFCWaiter waiter1=new KFCWaiter(builderFixed);
        Meal mealForFixedA = waiter1.createMealForFixed();
        System.out.println(mealForFixedA);

        //固定模式创建套餐B

        //先根据抽象建造者构建具体的构建者
        MealBuilderFixed builderFixedB=new SubMealBuilderB();

        //Director根据具体的建造者
        KFCWaiter waiter2 =new KFCWaiter(builderFixedB);

        //创建产品给Director
        Meal mealForFixedB = waiter2.createMealForFixed();

        System.out.println(mealForFixedB);

    }

}
