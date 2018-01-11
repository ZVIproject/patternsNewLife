package standalone;

import component.pattern.builder.Director;
import component.pattern.builder.GameBuilder;
import component.pattern.builder.ManualBuilder;
import component.pattern.fabrica.MobileFabrica;
import component.pattern.fabrica.PersonalComputerFabrica;

/**
 * Created by vladzarovnyi on 11/28/17.
 */
public class BuilderStandalone {

    public static void main(String[] args) {

        GameBuilder gameBuilder = new GameBuilder();
        ManualBuilder manualBuilder = new ManualBuilder();

        Director director = new Director();

        director.createGoodGame(gameBuilder, new MobileFabrica());
        director.createGoodGame(gameBuilder, new PersonalComputerFabrica());

        director.createGoodGame(manualBuilder, new PersonalComputerFabrica());

        System.out.println("Game is " + gameBuilder.getResult().getGameType());
        System.out.println(manualBuilder.getResult());
    }
}
