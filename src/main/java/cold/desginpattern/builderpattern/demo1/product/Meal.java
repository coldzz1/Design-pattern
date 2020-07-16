package cold.desginpattern.builderpattern.demo1.product;

/**
 * Description:
 *  产品类 - 被建造的对象
 * Created by ys on 2020/7/16 13:50
 */
public class Meal {

    /**主食**/
    private String food ;

    /**饮料**/
    private String drink ;

    /**小食**/
    private String snack;

    public String getFood() {
        return food;
    }

    public String getDrink(){
        return drink;
    }

    public void setFood(String food){
        this.food=food;
    }

    public void setDrink(String drink){
        this.drink=drink;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    public String getSnack(){
        return snack;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "food='" + food + '\'' +
                ", drink='" + drink + '\'' +
                ", snack='" + snack + '\'' +
                '}';
    }
}
