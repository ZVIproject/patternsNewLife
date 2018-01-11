package component.pattern;

import component.interfacee.Man;
import component.interfacee.Woman;
import component.service.family.ukrainian.UkrainianMan;
import component.service.family.ukrainian.UkrainianWoman;

/**
 * Created by vladzarovnyi on 11/27/17.
 */
public class UkrainianFamily extends Factory{

    public Man createMan() {
        return new UkrainianMan();
    }

    public Woman createWoman() {
        return new UkrainianWoman();
    }
}
