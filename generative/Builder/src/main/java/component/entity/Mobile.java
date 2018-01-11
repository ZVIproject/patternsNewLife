package component.entity;

import component.interfacee.Platform;

/**
 * Created by vladzarovnyi on 11/28/17.
 */
public class Mobile implements Platform {

    private int version;

    public Mobile(int version) {
        this.version = version;
    }

    public void startGame() {
        System.out.println("Start mobile application with version :" + version);
    }

    public void finishGame() {
        System.out.println("Finish mobile application.");
    }
}
