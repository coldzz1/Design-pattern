package cold.desginpattern.builderpattern.demo1.director;

import cold.desginpattern.builderpattern.demo1.abstractBuilder.MealBuilderFixed;
import cold.desginpattern.builderpattern.demo1.abstractBuilder.MealBuilderUnFixed;
import cold.desginpattern.builderpattern.demo1.product.Meal;

/**
 * Description:
 *     可以是服务员,也可以是催制作套餐的人
 * Created by ys on 2020/7/16 14:04
 */
public class KFCWaiter {

    /**拥有建造的抽象模式**/
    private MealBuilderFixed builder;

    private MealBuilderUnFixed unFixedBuilder;

    /**使用多态,套餐的种类非常多,所有种类我都能使用**/
    public KFCWaiter(MealBuilderFixed builder){
        this.builder=builder;
    }

    public KFCWaiter(MealBuilderUnFixed unFixedBuilder){
        this.unFixedBuilder=unFixedBuilder;
    }


    //服务员或者说老板只想看到需要的产品--要交到客户的手里
    public Meal createMealForFixed(){
        //这里是相当于套餐都固定死了,我如果想要增加套餐只需要增加一个具体建造实现类就行
        return builder.createMeal();
    }


    public Meal createMealForUnFixed(String food,String drink,String snack){
        unFixedBuilder.addFood(food);
        unFixedBuilder.addDrink(drink);
        unFixedBuilder.addSnack(snack);
        return unFixedBuilder.createMealUnFixed();
    }




}
