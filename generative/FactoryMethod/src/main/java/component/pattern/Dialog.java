package component.pattern;

import component.interfacee.Car;

/**
 * Created by vladzarovnyi on 11/24/17.
 */
public abstract class Dialog {

    public void doDriveTheCar(){

        Car car = getNewCar();
        car.startTheCar();
        car.doSignal(12);
    }

    public abstract Car getNewCar();
}
