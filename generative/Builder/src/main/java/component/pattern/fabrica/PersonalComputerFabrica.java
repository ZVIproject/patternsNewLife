package component.pattern.fabrica;

import component.entity.PersonalComputer;
import component.interfacee.Platform;

/**
 * Created by vladzarovnyi on 11/28/17.
 */
public class PersonalComputerFabrica extends Fabrica {

    public Platform getPlatform() {
        return new PersonalComputer("Digital");
    }
}
