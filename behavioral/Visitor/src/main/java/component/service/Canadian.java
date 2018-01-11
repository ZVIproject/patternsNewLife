package component.service;

import component.pattern.Visitor;

/**
 * Created by vladzarovnyi on 11/22/17.
 */
public class Canadian extends American {


    public Canadian(String name, Double foodPrice) {
        super(name, foodPrice / 2);
    }

    /**
     * Pattern method
     *
     * @param visitor
     * @return
     */
    @Override
    public Food accept(Visitor visitor) {
        return visitor.visitCanadian(this);
    }

    /**
     * Create food
     *
     * @return
     */
    @Override
    public Food doBreakfast() {
        return null;
    }


}
