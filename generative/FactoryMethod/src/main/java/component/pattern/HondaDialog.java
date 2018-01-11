package component.pattern;

import component.interfacee.Car;
import component.service.Honda;

/**
 * Created by vladzarovnyi on 11/24/17.
 */
public class HondaDialog extends Dialog {

    public Car getNewCar() {
        return new Honda();
    }
}
