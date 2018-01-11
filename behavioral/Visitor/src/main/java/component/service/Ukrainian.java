package component.service;

import component.interfacee.Human;
import component.pattern.Visitor;

/**
 * Created by vladzarovnyi on 11/22/17.
 */
public class Ukrainian implements Human {

    private String name;

    private Double totalPrice;

    private boolean hasMoney;

    public Ukrainian(String name, Double totalPrice, boolean hasMoney) {
        this.name = name;
        this.totalPrice = totalPrice;
        this.hasMoney = hasMoney;
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
        return visitor.visitUkrainian(this);
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

    public boolean isHasMoney() {
        return hasMoney;
    }

    public void setHasMoney(boolean hasMoney) {
        this.hasMoney = hasMoney;
    }
}
