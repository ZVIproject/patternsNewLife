package component.pattern.fabrica;

import component.entity.Mobile;
import component.interfacee.Platform;

/**
 * Created by vladzarovnyi on 11/28/17.
 */
public class MobileFabrica extends Fabrica{

   public Platform getPlatform() {
        return new Mobile(1);
    }
}
