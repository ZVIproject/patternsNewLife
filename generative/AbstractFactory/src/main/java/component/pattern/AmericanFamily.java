package component.pattern;

import component.interfacee.Man;
import component.interfacee.Woman;
import component.service.family.american.AmericanMan;
import component.service.family.american.AmericanWoman;

/**
 * Created by vladzarovnyi on 11/27/17.
 */
public class AmericanFamily extends Factory {

    public Man createMan() {
        return new AmericanMan();
    }

    public Woman createWoman() {
        return new AmericanWoman();
    }
}
