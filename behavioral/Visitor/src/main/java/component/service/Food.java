package component.service;

/**
 * Entity for food
 * Created by vladzarovnyi on 11/22/17.
 */
public class Food {

    private String name;

    private Double totalPrice;

    private boolean healthyFood;

    public Food(String name, Double totalPrice, boolean healthyFood) {
        this.name = name;
        this.totalPrice = totalPrice;
        this.healthyFood = healthyFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isHealthyFood() {
        return healthyFood;
    }

    public void setHealthyFood(boolean healthyFood) {
        this.healthyFood = healthyFood;
    }

    @Override
    public String toString () {
        return String.format("Food name : %s \nhealth food : %b \n total price : %f", this.name, this.healthyFood, this.totalPrice);
    }
}
