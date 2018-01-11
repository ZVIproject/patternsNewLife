package component.service;

import component.interfacee.Human;
import component.pattern.Visitor;

/**
 * Created by vladzarovnyi on 11/22/17.
 */
public class German implements Human {

    private Integer age;

    private Double totalPrice;

    public German(Integer age, Double totalPrice) {
        this.age = age;
        this.totalPrice = totalPrice;
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
        return visitor.visitGerman(this);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
