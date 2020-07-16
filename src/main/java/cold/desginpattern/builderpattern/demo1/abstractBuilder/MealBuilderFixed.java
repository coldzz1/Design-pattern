package cold.desginpattern.builderpattern.demo1.abstractBuilder;

import cold.desginpattern.builderpattern.demo1.product.Meal;

/**
 * Description: 抽象的建造者,即组装套餐的过程(或者理解成固定的有哪几种成分组成)
 *              至于具体组装哪些食物到这个套餐,不是我关心的,而是具体的建造者去关心的
 * Created by ys on 2020/7/16 13:53
 */
//这里是固定套餐的模式,想要增加只需要添加新的具体建造方式(套餐实现类)
public interface  MealBuilderFixed {


    //加入主食
    void buildDrink();

    //加入饮料
    void buildFood() ;

    //加入小食
    void buildSnack();

    //组装套餐
    Meal createMeal();


}
