package component.entity;

import component.interfacee.Platform;

/**
 * Created by vladzarovnyi on 11/28/17.
 */
public class PersonalComputer implements Platform {

    private String version;

    public PersonalComputer(String version) {
        this.version = version;
    }

    public void startGame() {
        System.out.println("Start PC game with platform : " + version);
    }

    public void finishGame() {
        System.out.println("Finish the game.");
    }

}
