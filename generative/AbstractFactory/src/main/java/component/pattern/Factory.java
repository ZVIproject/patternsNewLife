package component.pattern;

import component.interfacee.Man;
import component.interfacee.Woman;

/**
 * Created by vladzarovnyi on 11/27/17.
 */
public abstract class Factory {

    public abstract Man createMan();

    public abstract Woman createWoman();
}
