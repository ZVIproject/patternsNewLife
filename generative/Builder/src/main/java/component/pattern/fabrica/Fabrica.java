package component.pattern.fabrica;

import component.interfacee.Platform;

/**
 * Created by vladzarovnyi on 11/28/17.
 */
public abstract class Fabrica {

    public void startPlatform(){

        Platform platform = getPlatform();
        platform.startGame();
        platform.finishGame();

    }

   protected abstract Platform getPlatform();
}
