package component.interfacee;

import component.pattern.Visitor;
import component.service.Food;

/**
 * The main functions for the human.
 * Created by vladzarovnyi on 11/22/17.
 */
public interface Human {

    /**
     * Create food
     * @return
     */
    Food doBreakfast();

    /**
     * Pattern method
     * @param visitor
     * @return
     */
    Food accept(Visitor visitor);
}
