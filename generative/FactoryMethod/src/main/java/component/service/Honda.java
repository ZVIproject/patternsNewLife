package component.service;

import component.interfacee.Car;

/**
 * Created by vladzarovnyi on 11/24/17.
 */
public class Honda implements Car {

    public void startTheCar() {
        System.out.println("bshbshsbshbsh");
    }

    public void doSignal(Integer signalPower) {
        System.out.println(signalPower < 10 ? "pffff" : "biiiiibiii");
    }
}
