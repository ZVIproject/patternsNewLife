package component.service;

import component.interfacee.Human;
import component.pattern.Visitor;

/**
 * Created by vladzarovnyi on 11/22/17.
 */
public class American implements Human {

    private String name;

    private Double foodPrice;

    public American(String name, Double foodPrice) {
        this.name = name;
        this.foodPrice = foodPrice * 24;
    }

    /**
     * Create food
     *
     * @return
     */
    public Food doBreakfast() {
        return null;
    }

    /**
     * Pattern method
     *
     * @param visitor
     * @return
     */
    public Food accept(Visitor visitor) {
        return visitor.visitAmerican(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }
}
