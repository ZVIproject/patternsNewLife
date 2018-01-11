package component.pattern;

import component.interfacee.Car;
import component.service.Nissan;

/**
 * Created by vladzarovnyi on 11/24/17.
 */
public class NissanDialog extends Dialog{

    public Car getNewCar() {
        return new Nissan();
    }
}
