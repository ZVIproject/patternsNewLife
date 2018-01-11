package component.service;

import component.interfacee.Car;

/**
 * Created by vladzarovnyi on 11/24/17.
 */
public class Nissan implements Car{

    public void doSignal(Integer signalPower) {
        System.out.println(signalPower < 10 ? "piypiy" : "babaaa");
    }

    public void startTheCar() {
        System.out.println("Brrbrbrbrbrbrbbrbrbbrrbrbrbrbr");
    }
}
